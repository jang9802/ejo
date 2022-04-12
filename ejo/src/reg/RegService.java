package reg;

import common.CommonService;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Controller;

public class RegService {
	
	private RegDAO regDao;
	private CommonService commonService;
	private Controller controller;
	public RegService() {
		regDao = new RegDAO();
		commonService = new CommonService();
		controller = new Controller();
	}

	public void register(TextField nameField, TextField idField, PasswordField pwField, PasswordField pwcheckField, TextField emailField, TextField phoneField, TextField answerField, String question) {
		
		String name = nameField.getText();
		String id = idField.getText();
		String pw = pwField.getText();
		String pwcheck = pwcheckField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		String answer = answerField.getText();
		
		if (id.equals("")) {
			commonService.msg("아이디를 입력해주세요");
		}
		else if (pw.equals("")) {
			commonService.msg("비밀번호를 입력해주세요");
		}
		else if (pwcheck.equals("")) {
			commonService.msg("비밀번호 확인을 입력해주세요");
		}
		else if (!pwcheck.equals(pw)) {
			commonService.msg("비밀번호가 다릅니다");
		}
		
		else if (regDao.selectId(id)==null) {
			RegDTO regDto = new RegDTO();
			regDto.setId(id); regDto.setPw(pw);  regDto.setName(name);  regDto.setPhone(phone);  regDto.setEmail(email);  regDto.setPwQuestion(question);  regDto.setPwAnswer(answer);
			regDao.insert(regDto);
			controller.cancelPage();
			commonService.msg("회원가입이 완료되었습니다");
			
		}else {
			commonService.msg("중복된 아이디가 있습니다");
			return;
		}
		
		
		
	}
}
