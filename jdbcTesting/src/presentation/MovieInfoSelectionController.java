package presentation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;



public class MovieInfoSelectionController implements Initializable {


	
	
	@FXML
	Label InfoLabel;
	
	@FXML
	Button nextScreen;
	
	//table movie info constraints
	@FXML
	CheckBox runtimesCB;
	
	@FXML
	CheckBox colorInfoCB;
	
	@FXML
	CheckBox genresCB;
	
	@FXML
	CheckBox languagesCB;
	
	@FXML
	CheckBox certificatesCB;
	
	@FXML
	CheckBox soundMixCB;
	
	@FXML
	CheckBox techInfoCB;
	
	@FXML
	CheckBox countriesCB;
	
	@FXML
	CheckBox taglinesCB;
	
	@FXML
	CheckBox crazyCreditsCB;
	
	@FXML
	CheckBox goofsCB;
	
	@FXML
	CheckBox quotesCB;
	
	@FXML
	CheckBox releaseDatesCB;
	
	@FXML
	CheckBox triviaCB;
	
	@FXML
	CheckBox locationsCB;
	
	@FXML
	CheckBox interviewsCB;
	
	@FXML
	CheckBox screenplay_teleplayCB;
	
	@FXML
	CheckBox novelCB;
	
	@FXML
	CheckBox adaptaionCB;
	
	@FXML
	CheckBox bookCB;
	
	@FXML
	CheckBox productionProcessProtocolCB;
	
	@FXML
	CheckBox printedMediaReviews;
	
	@FXML
	CheckBox essaysCB;
	
	@FXML
	CheckBox otherLiteatureCB;
	
	@FXML
	CheckBox mpaaCB;
	
	@FXML
	CheckBox plotCB;
	
	@FXML
	CheckBox productionDatesCB;
	
	@FXML
	CheckBox copyrightHolder;
	
	@FXML
	CheckBox filmingDatesCB;
	
	@FXML
	CheckBox budgetCB;
	
	@FXML
	CheckBox weekendGrossCB;
	
	@FXML
	CheckBox grossCB;
	
	@FXML
	CheckBox openingWeekCB;
	
	@FXML
	CheckBox rentalsCB;
	
	@FXML
	CheckBox admissionCB;
	
	
	//table movieInfo info type
	@FXML
	CheckBox votesDistributionCB;
	
	@FXML
	CheckBox votesCB;
	
	@FXML
	CheckBox ratingCB;
	
	@FXML
	CheckBox top250rankCB;
	
	@FXML
	CheckBox bottom10rankCB;
	
	//row count refresh 
	@FXML
	Button rowCountButton;
	
	@FXML
	Label rowCountInfo;
	
	@FXML
	Label rowCountInfoIndex;
	
	private Migration app;
	
	@FXML
	private void handleNextScreenButtonAction(ActionEvent event) {
		InfoLabel.setText("button action MovieInfo selection recieved: result");
		app.gotoMovieCompanySelection();
	}
	
	
	
	@FXML
	private void handleRowCountButtonAction(ActionEvent event) {
		rowCountInfo.setText("testing rowcount MovieInfo");
		rowCountInfoIndex.setText("testing rowcount MovieInfoIndex");
		
	}
	public void setApplication(Migration appl) {
		this.app = appl;
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		

	}

}
