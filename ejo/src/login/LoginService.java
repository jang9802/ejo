package login;
import common.PublicController;
import common.CommonService;
import common.OpenService;
import javafx.fxml.FXMLLoader;
import main.Controller;
import reg.RegDAO;
import reg.RegDTO;


public class LoginService{
	
	private CommonService commonService;
	private LoginDAO loginDao;
	private Controller controller;
	
	public LoginService() {
		commonService = new CommonService();
		loginDao = new LoginDAO();
		controller = new Controller();
	}
	public void login(String id, String pw) {
		
		if(id.equals("")) {
			commonService.msg("아이디를 입력하세요");
		}else {
			RegDTO regDto = loginDao.selectId(id);
			if(regDto != null && regDto.getPw().equals(pw)) {
				controller.setLoginId(id);
				controller.cancelPage();
				commonService.msg("로그인 성공");
			}else {
				// 로그인 실패
				commonService.msg("로그인 실패");
			}
		}
		
	}
	
	
}