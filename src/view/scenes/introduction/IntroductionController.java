package view.scenes.introduction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IntroductionController {
	
	@FXML
	private Button quitButton;
	@FXML
	private GridPane introductionPane;
	Stage stage;
	
	public void quit(ActionEvent e) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Quit");
		alert.setHeaderText("You are about to quit!");
		alert.setContentText("Are you sure?");
		if (alert.showAndWait().asPaint() == ButtonType.OK) {
			stage = (Stage) introductionPane.getScene().getWindow();
			stage.close();
		}
	}
}
