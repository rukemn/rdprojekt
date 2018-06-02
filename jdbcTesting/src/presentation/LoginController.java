package presentation;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class LoginController implements Initializable{
	@FXML
	PasswordField Login_PasswordText;
	
	@FXML
	TextField Login_UserNameText;
	
	@FXML
	Button Login_CancelButton;

	@FXML
	Button Login_OkayButton;
	
	private Migration app;
	

	// sets scene and gives controller for the buttons and writes it into User-BDOs for databases

	
	@FXML
	private void handleOkayButtonAction(ActionEvent event) {
		
		System.out.println("ok button recieved");
		bdo.PostgresUser.setUsername(Login_UserNameText.getText());
		bdo.PostgresUser.setPassword(Login_PasswordText.getText());
		
		//application call --> data call: postgre validate
		
		//if correct
		app.gotoTitleSelectionScene();
		//app.gotoNewScene

		
	}
	
	@FXML
	private void handleCancelButtonAction(ActionEvent event) {
		System.out.println(bdo.PostgresUser.getUsername());
		System.out.println(bdo.PostgresUser.getPassword());
	}
	
	// fx:controller calls no argument constructor
//	public LoginController(String loginType){
//		// selects object
//	}
	//has access to fxml fields
	public LoginController() {
		System.out.println("constructor");
		//pgLoginC = this;
	}
	
	public void setApplication(Migration appl) {
		this.app = appl;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("LC init");
		//set controller
	}
	
	
}
