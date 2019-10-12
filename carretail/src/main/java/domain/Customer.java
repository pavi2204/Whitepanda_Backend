package domain;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class Customer 
{
  private String name;
  private String email;
  private String number;
  private int age;
  private String licensenumber;
	
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name=name;
  }
  
  public String getEmail() {
	  return email;
  }
  public void setEmail(String email) {
	  this.email=email;
  }
  
  public String getNumber() {
	  return number;
  }
  public void setNumber(String number) {
	  this.number=number;
  }
  public int getAge() {
	  return age;
  }
  public void setAge(int age) {
	  this.age=age;
	  }
  public String getLicenseNumber() {
	return licensenumber;
	  
  }
  public void setLicenseNumber(String licensenumber) {
	  this.licensenumber=licensenumber;
  }
}
