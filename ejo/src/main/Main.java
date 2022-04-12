package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException  {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
		Parent mainForm = loader.load();
		
		Controller controller = new Controller();
		controller.setNowForm(mainForm);
		controller.setMainForm(mainForm);
		
		Scene scene = new Scene(mainForm);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
