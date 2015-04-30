package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
    
	public Parent createContent() {
    	
		final ComboBox<String> comboBoxMonth = new ComboBox<String>();
		comboBoxMonth.getItems().addAll(
			    "January",
			    "February",
			    "Option 3"
			);
		final ComboBox<String> comboBoxDay = new ComboBox<String>();
		comboBoxDay.getItems().addAll(
			    "1",
			    "2",
			    "3"
			);
		final ComboBox<String> comboBoxYear = new ComboBox<String>();
		comboBoxYear.getItems().addAll(
			    "Option 7",
			    "Option 8",
			    "Option 9"
			);
		
		Label month = new Label("Month");
	    Label day = new Label("Day");
	    Label year = new Label("Year");
	    
        HBox hb1 = new HBox();
        hb1.setSpacing(10);
        hb1.setAlignment(Pos.CENTER);
        
        HBox hb2 = new HBox();
        hb2.setSpacing(10);
        hb2.setAlignment(Pos.CENTER);
        
        HBox hb3 = new HBox();
        hb3.setSpacing(10);
        hb3.setAlignment(Pos.CENTER);
        
        VBox vb1 = new VBox();
        vb1.setSpacing(10);
        vb1.setAlignment(Pos.CENTER);
        
        hb1.getChildren().addAll(month, comboBoxMonth);
        hb2.getChildren().addAll(day, comboBoxDay);
        hb3.getChildren().addAll(year, comboBoxYear);
        vb1.getChildren().addAll(hb1, hb2, hb3);
        return vb1;
    }
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(createContent());//,400,100);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
