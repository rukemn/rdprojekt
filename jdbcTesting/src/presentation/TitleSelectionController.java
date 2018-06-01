package presentation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;



public class TitleSelectionController implements Initializable {

	@FXML
	Label InfoLabel;
	
	@FXML
	Button nextScreen;
	
	@FXML
	TextField fromYearText;
	
	@FXML
	TextField toYearText;
	
	@FXML
	CheckBox tvmovieCB;
	
	@FXML
	CheckBox tvSeriesCB;
	
	@FXML
	CheckBox videoMovieCB;
	
	@FXML
	CheckBox tvMiniSeriesCB;
	
	@FXML
	CheckBox videoGamesCB;
	
	@FXML
	CheckBox episodeCB;
	
	@FXML
	Button rowCountButton;
	
	@FXML
	Label rowCountResult;
	
	private Migration app;
	
	@FXML
	private void handleNextScreenButtonAction(ActionEvent event) {
		InfoLabel.setText("button action recieved: result");
	}
	
	@FXML
	private void handleRowCountButtonAction(ActionEvent event) {
		
	}
	public void setApplication(Migration appl) {
		this.app = appl;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TextFormatter<String> fromYearIntVer = TextFieldVerifiers.IntegerValidater();
		fromYearText.setTextFormatter(fromYearIntVer);
		
		TextFormatter<String> toYearIntVer = TextFieldVerifiers.IntegerValidater();
		toYearText.setTextFormatter(toYearIntVer);
		

	}

}
