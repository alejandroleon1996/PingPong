package controller;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	private RadioButton facil;
	@FXML
	private RadioButton medio;
	@FXML
	private RadioButton dificil;
	@FXML
	private Button go;
	@FXML
	public void jugar (ActionEvent event) throws IOException {
		
		if(facil.isSelected()){
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Sample2.fxml"));

            Stage stage = new Stage();
            Pane root = loader.load();

            Scene scene = new Scene(root);
            stage.initModality(Modality.APPLICATION_MODAL);


            stage.setScene(scene);
            stage.showAndWait();
            stage.setTitle("P I N G - P O N G FACIL para (nenes)");
		}else if(medio.isSelected()){
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Sample3.fxml"));

            Stage stage = new Stage();
            Pane root = loader.load();

            Scene scene = new Scene(root);
            stage.initModality(Modality.APPLICATION_MODAL);


            stage.setScene(scene);
            stage.showAndWait();
            stage.setTitle("P I N G - P O N G MEDIO para no tan malotes");
		}else if(dificil.isSelected()){
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Sample4.fxml"));

            Stage stage = new Stage();
            Pane root = loader.load();

            Scene scene = new Scene(root);
            stage.initModality(Modality.APPLICATION_MODAL);


            stage.setScene(scene);
            stage.showAndWait();
            stage.setTitle("P I N G - P O N G DIFICIL para campeones");
		}
	}
		
}
