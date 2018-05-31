package presentation;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;


public class Migration extends Application {

	private Stage stage;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			//kleines bsp login
			//besser LoginController class und von dort object zurückgeben lassen und in main stage einbinden
			
			//achtung, wird schon bei fx:controller initialisiert,könnte zu problem werden
			//Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			//LoginController.makePgController();
			//LoginController pgLogin = LoginController.getPgLoginC();
			
			
			//Scene scene = pgLogin.loadScene(primaryStage);
			//Scene scene = new Scene(root);

			//primaryStage.setScene(scene);
			
			
			stage = primaryStage;
			primaryStage.show();
			gotoLoginScene();
		} catch(Exception e) {
			System.out.println("lol fail");
			e.printStackTrace();
		}
		return;
	}
	
	public void gotoLoginScene() {
		try {
			
			
			LoginController lc = (LoginController) replaceSceneContent("Login.fxml");
			lc.setApplication(this);//injection itself
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//changes Scene to desired xml String
	public Initializable replaceSceneContent(String fxml) throws Exception{
		FXMLLoader fxmlLoader = new FXMLLoader();
		Pane p = fxmlLoader.load(getClass().getResource(fxml).openStream());
		LoginController loginC = (LoginController) fxmlLoader.getController();
		
		Scene newScene = new Scene(p);
		stage.setScene(newScene);
		
		return loginC;
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}

