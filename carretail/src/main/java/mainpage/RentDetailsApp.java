package mainpage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import DAO.RentDAO;
import domain.RentDetails;

public class RentDetailsApp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext("SpringConfig.class");
RentDAO rdao=(RentDAO)context.getBean("rentdao");
RentDetails rd=new RentDetails();
rd.setCustomerName("Rakesh");
rd.setCarDetails("TATA Harrier XZ");
rd.setJourneyDate("22 Oct 2019");
rd.setReturnDate("26th Oct 2019");
rdao.save(rd);
	}

}
