package presentation;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;



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
			
			
			LoginController lc = (LoginController) changeScene("Login.fxml", "Loginto Postgre and Oracle");
			lc.setApplication(this);//injection itself
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gotoTitleSelectionScene() {
		try {
			
			
			TitleSelectionController tsc = (TitleSelectionController) changeScene("TitleSelection.fxml", "Select Title Entrys");
			tsc.setApplication(this);//injection itself
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gotoCastSelection() {
		try {
			
			
			CastSelectionController csC = (CastSelectionController) changeScene("CastSelection.fxml", "Select Cast Info");
			csC.setApplication(this);//injection itself
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gotoPersonSelection() {
		try {
			
			
			PersonSelectionController psC = (PersonSelectionController) changeScene("PersonSelection.fxml", "Select Persons Info");
			psC.setApplication(this);//injection itself
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gotoMovieInfoSelection() {
		try {
			
			
			MovieInfoSelectionController misC = (MovieInfoSelectionController) changeScene("MovieInfoSelection.fxml", "Select Movie Info");
			misC.setApplication(this);//injection itself
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gotoMovieCompanySelection() {
		try {
			
			
			MovieCompanySelectionController mcsC = (MovieCompanySelectionController) changeScene("MovieCompanySelection.fxml", "Select MovieCompany Info");
			mcsC.setApplication(this);//injection itself
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//changes Scene to desired xml String
	public Initializable changeScene(String fxml, String windowTitle) throws Exception{
		FXMLLoader fxmlLoader = new FXMLLoader();
		Pane p = fxmlLoader.load(getClass().getResource(fxml).openStream());
		Initializable loginC = (Initializable) fxmlLoader.getController();
		
		Scene newScene = new Scene(p);
		stage.setScene(newScene);
		stage.setTitle(windowTitle);
		return loginC;
		
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}

