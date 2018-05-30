package jdbcTesting;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Parent;


public class Main extends Application {
	@FXML
	PasswordField Login_PasswordText;
	@FXML
	TextField Login_UserNameText;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			//kleines bsp login
			//besser LoginController class und von dort object zurückgeben lassen und in main stage einbinden
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			
			
			
			primaryStage.show();
		} catch(Exception e) {
			System.out.println("lol fail");
			e.printStackTrace();
		}
		return;
	}
	
	
	
//	public static void main(String[] args) {
//		launch(args);
//
//	}
}

