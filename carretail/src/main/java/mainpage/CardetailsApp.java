package mainpage;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import DAO.CarDAO;
import domain.Cardetails;

public class CardetailsApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new AnnotationConfigApplicationContext("SpringConfig.class");
       CarDAO cadao=(CarDAO)context.getBean("cardao");
       Cardetails c=new Cardetails();
       c.setCarName("Harrier");
       c.setCompany("TATA");
       c.setModel("XZ");
       c.setRent(7600);
       c.setSeatingCapacity(5);
       c.setVehicleNumber("KA02AS1599");
       c.setAvailableCars(8);
       cadao.save(c);
	}

}
