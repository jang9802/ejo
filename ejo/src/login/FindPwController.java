package login;

import java.net.URL;
import java.util.ResourceBundle;

import common.CommonService;
import common.OpenService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class FindPwController extends PublicController implements Initializable  {
	
	private Parent findPwForm;
	private FindPwService findPwService;
	private @FXML TextField idField;
	private @FXML TextField nameField;
	private @FXML TextField answerField;
	private @FXML ComboBox queBox;
	private CommonService commonService; 
	private OpenService openService;
	
	
	
	public void findPw() {
		String pwQuestion= (String) queBox.getValue();
		findPwService.findPw(idField.getText(), nameField.getText(), pwQuestion, answerField.getText());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		queBox.getItems().addAll("첫사랑 이름은?","졸업한 초등학교는?","가장 친한 친구의 이름은?","나의 고향은?");
		findPwService=new FindPwService();
		openService=new OpenService();
		commonService=new CommonService();
	}
	

}
