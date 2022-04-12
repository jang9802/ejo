package login;

import common.CommonService;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import main.Controller;
import reg.RegDTO;

public class FindPwService {

	private CommonService commonService;
	private FindPwDAO findPwDao;
	private Controller controller;
	private LoginDAO loginDao;
	private @FXML ComboBox queBox;
	
	public FindPwService() {
		commonService = new CommonService();
		findPwDao = new FindPwDAO();
		controller = new Controller();
	}
	public void findPw(String id, String name, String pwQuestion, String pwAnswer) {
		pwQuestion = (String) queBox.getValue();
		if(id.equals("")) {
			commonService.msg("아이디를 입력하세요");
		}else if (name.equals("")){
			commonService.msg("이름을 입력하세요");
		}else if (pwQuestion.equals("")){
			commonService.msg("질문을 선택하세요");
		}else if (pwAnswer.equals("")){
			commonService.msg("답을 입력하세요");
		}
		else {
			RegDTO regDto = loginDao.selectId(id);
			if(regDto != null && regDto.getId().equals(id)&& regDto.getName().equals(name)&& regDto.getPwQuestion().equals(pwQuestion)&& regDto.getPwAnswer().equals(pwAnswer)) {
				controller.cancelPage();
				commonService.msg("비밀번호는 "+ regDto.getPw());
			}else {
				commonService.msg("입력하신 정보가 일치하지 않습니다.");
				
			}
		}
		
	}
}
