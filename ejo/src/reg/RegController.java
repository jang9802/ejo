package reg;

import java.net.URL;
import java.util.ResourceBundle;

import common.CommonService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Controller;

public class RegController extends PublicController implements Initializable{

	@FXML TextField searchField;
	@FXML TextField nameField;
	@FXML TextField idField;
	@FXML PasswordField pwField;
	@FXML PasswordField pwcheckField;
	@FXML TextField emailField;
	@FXML TextField phoneField;
	@FXML TextField answerField;
	@FXML ComboBox queBox;
	private CommonService commonService;
	private Controller controller;
	private RegService regService;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		queBox.getItems().addAll("첫사랑 이름은?","졸업한 초등학교는?","가장 친한 친구의 이름은?","나의 고향은?");
		commonService = new CommonService();
		controller = new Controller();
		regService = new RegService();
	}
	
	//회원가입
	public void register() {
		String question = (String) queBox.getValue();
		if (question==null) {
			commonService.msg("질문을 선택하세요");
			return;
		}
		regService.register(nameField,idField,pwField,pwcheckField,emailField,phoneField,answerField,question);
		
		
	}
	
	//텍스트필드 초기화
	public void reset() {
		searchField.clear();
		nameField.clear();
		idField.clear();
		pwField.clear();
		pwcheckField.clear();
		pwcheckField.clear();
		emailField.clear();
		phoneField.clear();
		answerField.clear();
		queBox.getSelectionModel().clearSelection();
	}

	//창닫기
	public void cancel() {
		controller.cancelPage();
	}
	
	

}
