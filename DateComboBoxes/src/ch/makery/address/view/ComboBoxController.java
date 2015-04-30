package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import ch.makery.address.MainApp;

public class ComboBoxController {
	@FXML
	private Label monthLabel;
	@FXML
	private Label dayLabel;
	@FXML
	private Label yearLabel;
	@FXML
	private ComboBox<String> monthComboBox = new ComboBox<String>();
	@FXML
	private ComboBox<String> dayComboBox = new ComboBox<String>();
	@FXML
	private ComboBox<String> yearComboBox = new ComboBox<String>();
	
	// Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ComboBoxController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	monthComboBox.getItems().addAll(
    		    "January",
    		    "February",
    		    "March",
    		    "April",
    		    "May",
    		    "June",
    		    "July",
    		    "August",
    		    "September",
    		    "October",
    		    "November",
    		    "December"
    		);
    	
    	dayComboBox.getItems().addAll(
    			"1",
    			"2",
    			"3",
    			"4",
    			"5",
    			"6",
    			"7",
    			"8",
    			"9",
    			"10",
    			"11",
    			"12",
    			"13",
    			"14",
    			"15",
    			"16",
    			"17",
    			"18",
    			"19",
    			"20",
    			"21",
    			"22",
    			"23",
    			"24",
    			"25",
    			"26",
    			"27",
    			"28",
    			"29",
    			"30",
    			"31"
    			);
    	
    	yearComboBox.getItems().addAll(
    			"2010",
    			"2011",
    			"2012",
    			"2013",
    			"2014",
    			"2015",
    			"2016",
    			"2017",
    			"2018",
    			"2019",
    			"2020"
    			);
    	
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    @FXML
    private void handleMonthComboBox() {
    	String month = monthComboBox.getSelectionModel().getSelectedItem().toString();
    }
    
    @FXML
    private void handleDayComboBox() {
    }
    
    @FXML
    private void handleYearComboBox() {
    }
}
