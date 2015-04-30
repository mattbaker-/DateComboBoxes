package ch.makery.address;

import java.io.IOException;

import ch.makery.address.view.ComboBoxController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Date Combo Boxes");

        initComboBoxes();
	}
	
	/**
     * Shows the person overview inside the root layout.
     */
    public void initComboBoxes() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ComboBox.fxml"));
            AnchorPane ComboBox = (AnchorPane) loader.load();
            
			// Set password prompt into the center of the scene.
			Scene scene = new Scene(ComboBox);
			primaryStage.setScene(scene);
			
			// Give the controller access to the main app.
			ComboBoxController controller = loader.getController();
			controller.setMainApp(this);
			
			primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	public static void main(String[] args) {
		launch(args);
	}
}
