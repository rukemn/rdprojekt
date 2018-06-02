package presentation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;



public class MovieCompanySelectionController implements Initializable {


	
	
	@FXML
	Label InfoLabel;
	
	@FXML
	Button nextScreen;
	
	//table company type constraints
	@FXML
	CheckBox distributorsCB;
	
	@FXML
	CheckBox productionCompaniesCB;
	
	@FXML
	CheckBox specialEffectsCompaniesCB;
	
	@FXML
	CheckBox miscellaneousCompaniesCB;
	
	//row count refresh 
	@FXML
	Button rowCountButton;
	
	@FXML
	Label rowCountInfo;
	
	
	private Migration app;
	
	@FXML
	private void handleNextScreenButtonAction(ActionEvent event) {
		InfoLabel.setText("button next screen action CompanyType selection recieved: result");
	}
	
	
	
	@FXML
	private void handleRowCountButtonAction(ActionEvent event) {
		rowCountInfo.setText("testing rowcount Movie company type");
	}
	public void setApplication(Migration appl) {
		this.app = appl;
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		

	}

}

