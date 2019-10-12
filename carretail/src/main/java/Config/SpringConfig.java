package Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import domain.Cardetails;
import domain.Customer;
import domain.RentDetails;

@Configuration
@ComponentScan
public class SpringConfig {

	public DataSource getdatasource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/Information");
		dataSource.setUsername("root");
		dataSource.setPassword("pavi2101");
		return dataSource;
		
	}
		@Bean
		public SessionFactory sessionFactory()
		{
			LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getdatasource());
			Properties p=new Properties();
			p.put("hibernate.show_sql","true");
		    p.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		    
		    p.put("hibernate.hbm2ddl.auto", "update");
		    builder.addProperties(p);
		    builder.addAnnotatedClass(Customer.class);
		    builder.addAnnotatedClass(Cardetails.class);
		    builder.addAnnotatedClass(RentDetails.class);
			return builder.buildSessionFactory();
	}

}
