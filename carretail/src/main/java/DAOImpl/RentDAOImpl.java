package DAOImpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.RentDAO;
import domain.RentDetails;
@Repository(value="rentdao")
public class RentDAOImpl implements RentDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void save(RentDetails rd) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(rd);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(RentDetails rd) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(rd);
		session.getTransaction().commit();
		session.close();
	}

	public void update(RentDetails rd) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(rd);
		session.getTransaction().commit();
		session.close();
	}

}
