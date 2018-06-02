package presentation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;



public class PersonSelectionController implements Initializable {


	
	
	@FXML
	Label InfoLabel;
	
	@FXML
	Button nextScreen;
	
	@FXML
	CheckBox quotesCB;
	
	@FXML
	CheckBox triviaCB;
	
	@FXML
	CheckBox miniBiographyCB;
	
	@FXML
	CheckBox birthNotesCB;
	
	@FXML
	CheckBox birthDateCB;
	
	@FXML
	CheckBox heightCB;
	
	@FXML
	CheckBox deathDateCB;
	
	@FXML
	CheckBox spouseCB;
	
	@FXML
	CheckBox otherWorksCB;
	
	@FXML
	CheckBox birthNameCB;
	
	@FXML
	CheckBox salaryHistoryCB;
	
	@FXML
	CheckBox nickNamesCB;
	
	@FXML
	CheckBox booksCB;
	
	@FXML
	CheckBox biographicalMoviesCB;
	
	@FXML
	CheckBox portrayedInCB;
	
	@FXML
	CheckBox whereNowCB;
	
	@FXML
	CheckBox tradeMarkCB;
	
	@FXML
	CheckBox interviewCB;
	
	@FXML
	CheckBox articleCB;
	
	
	@FXML
	CheckBox magazinCoverPhotoCB;
	
	@FXML
	CheckBox pictorialCB;
	
	@FXML
	CheckBox deathNotesCB;
	
	@FXML
	Button rowCountButton;
	
	@FXML
	Label rowCountResult;
	
	private Migration app;
	
	@FXML
	private void handleNextScreenButtonAction(ActionEvent event) {
		InfoLabel.setText("button action Person selection recieved: result");
		app.gotoMovieInfoSelection();
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
