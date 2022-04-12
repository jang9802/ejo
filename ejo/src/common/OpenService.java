package common;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Controller;

public class OpenService {
	
	public void openLoginPage() {
		pageOpen("/login/login.fxml","login");
	}
	
	public void openRegPage() {
		pageOpen("/reg/register.fxml","register");
	}
	public void openNoticePage() {
		
	}
	
	public void openGoodsPage() {
		
	}
	
	public void openEventPage() {
		
	}
	
	public void openDrawPage() {
		
	}
	
	public void openMainPage() {
		pageOpen("/main/main.fxml","main");
	}
	
	public void pageOpen(String fxmlUrl,String name) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlUrl));
		Parent form = null;
		try {
			form = loader.load();
			
			Controller controller = new Controller();
			switch(name) {
			case "login" : controller.setLoginForm(form); break;
			case "main" : controller.setMainForm(form); break;
			case "register" : controller.setRegForm(form); break;
			default : return;
			}
			controller.setNowForm(form);
			
			Scene scene = new Scene(form);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
