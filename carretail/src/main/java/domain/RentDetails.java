package domain;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class RentDetails {

private String customername;
private String cardetails;
private String journeydate;
private String returndate;

public String getCustomerName() {
	return customername;
	
}
public void setCustomerName(String customername) {
	this.customername=customername;
}

public String getCarDetails() {
	return cardetails;
}
public void setCarDetails(String cardetails) {
	this.cardetails=cardetails;
}

public String getJourneyDate() {
	return journeydate;
}
public void setJourneyDate(String journeydate) {
	this.journeydate=journeydate;
}

public String getReturnDate() {
	return returndate;
}
public void setReturnDate(String returndate) {
	this.returndate=returndate;
}
}
