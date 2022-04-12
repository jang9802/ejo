package common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonService {
	
	public void msg(String text) {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(text);
		alert.show();
	}
	
	public void windowClose(Parent form) {
		Stage stage = (Stage) form.getScene().getWindow();
		stage.close();
	}
}
