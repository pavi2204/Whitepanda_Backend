package domain;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class Cardetails {
	private String carname;
	private String company;
	private String model;
	private String vehicelnumber;
	private int seatingcapacity;
	private float rent;
	private int availablecars;

	public String getCarName() {
		return carname;
	}
	public void setCarName(String carname) {
		this.carname=carname;
	}
	
	public String getCompany() {
		return carname;
		}
    public void setCompany(String company) {
    	this.company=company;
    }
    
    public String getModel() {
    	return model;
    }
    public void setModel(String model) {
    	this.model=model;
    }
    
    public String getVehicleNumber()
    {
		return vehicelnumber;
    	}
    public void setVehicleNumber(String vehiclenumber) {
    	this.vehicelnumber=vehiclenumber;
    }
    
    public int getSeatingCapacity() {
		return seatingcapacity;
    	
    }
    public void setSeatingCapacity(int seatingcapacity) {
    	this.seatingcapacity=seatingcapacity;
    }
    
    public float getRent() {
		return rent;
    	
    }
    public void setRent(float rent) {
    	this.rent=rent;
    }
    
    public int getAvailableCars() {
		return availablecars;
    	
    }
    public void setAvailableCars(int availablecars) {
    	this.availablecars=availablecars;
    }
}
