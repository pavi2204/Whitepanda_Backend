package DAOImpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.CustomerDAO;
import domain.Customer;
@Repository(value="customerdao")
public class CustomerDAOImpl implements CustomerDAO
{
	@Autowired
	SessionFactory sessionfactory;


	public void save(Customer cus) {
		// TODO Auto-generated method stub
    Session session=sessionfactory.openSession();
    session.beginTransaction();
    session.save(cus);
    session.getTransaction().commit();
    session.close();
	}

	public void delete(Customer cus) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.delete(cus);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Customer cus) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.update(cus);
		session.getTransaction().commit();
		session.close();
	}

}
