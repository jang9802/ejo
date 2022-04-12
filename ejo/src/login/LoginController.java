package login;

import java.net.URL;
import java.util.ResourceBundle;

import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import common.CommonService;
import common.OpenService;

public class LoginController extends PublicController implements Initializable{
	
	private Parent loginForm;
	private LoginService loginService;
	private @FXML TextField id;
	private @FXML PasswordField pw;
	private CommonService commonService; 
	private OpenService openService;
	
	
	
	public void setLoginForm(Parent loginForm) {
		this.loginForm = loginForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginService = new LoginService();
		openService=new OpenService();
		commonService=new CommonService();
		
	}
	public void login() {
		loginService.login(id.getText(), pw.getText());
	}

	public void findIdProc() {
		
	}
	
	public void findPwProc() {
		
	}
	
	
}
