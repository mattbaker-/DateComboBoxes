package ch.makery.address.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private final StringProperty month;
	
	/**
     * Default constructor.
     */
    public Model() {
        this(null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Model(String Month) {
        this.month = new SimpleStringProperty(Month);
    }

	
	public String getMonth() {
        return month.get();
    }

    public void setMonth(String month) {
        this.month.set(month);
    }

    public StringProperty monthProperty() {
        return month;
    }
}
