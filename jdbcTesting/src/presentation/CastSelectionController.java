package presentation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;




public class CastSelectionController implements Initializable {
	
	@FXML
	Label InfoLabel;
	
	@FXML
	Button nextScreen;
	
	@FXML
	CheckBox actorCB;
	
	@FXML
	CheckBox actressCB;
	
	@FXML
	CheckBox producerCB;
	
	@FXML
	CheckBox writerCB;
	
	@FXML
	CheckBox cinematographerCB;
	
	@FXML
	CheckBox composerCB;
	
	@FXML
	CheckBox costumeDesignerCB;
	
	@FXML
	CheckBox directorCB;
	
	@FXML
	CheckBox editorCB;
	
	@FXML
	CheckBox miscellaneousCrewCB;
	
	@FXML
	CheckBox productionDesignerCB;
	
	@FXML
	CheckBox guestCB;	
	
	@FXML
	Button rowCountButton;
	
	@FXML
	Label rowCountResult;
	
	private Migration app;
	
	@FXML
	private void handleNextScreenButtonAction(ActionEvent event) {
		InfoLabel.setText("button action Cast selection recieved: result");
		app.gotoPersonSelection();
	}
	
	@FXML
	private void handleRowCountButtonAction(ActionEvent event) {
		rowCountResult.setText("testing rowcount");
	}
	public void setApplication(Migration appl) {
		this.app = appl;
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		

	}

}