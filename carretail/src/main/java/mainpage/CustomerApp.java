package mainpage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.SpringConfig;
import DAO.CustomerDAO;
import domain.Customer;

public class CustomerApp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
CustomerDAO cdao=(CustomerDAO)context.getBean("customerdao");
Customer cus=new Customer();
cus.setName("Rakesh");
cus.setEmail("rakesh12@gmail.com");
cus.setNumber("9862615540");
cus.setAge(23);
cus.setLicenseNumber("AS3411009");
cdao.save(cus);
	}


}