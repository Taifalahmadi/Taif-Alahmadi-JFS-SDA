package flyaway;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDAO {
	public void store(users user) {
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		factory.close();
	}
	public users getByusername(String username) {
		users user = null;
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
	user = session.get(users.class, username);
		if(user != null) 
		return user;
		else
			throw new RuntimeException("Sorry user with an id "+username+" not found");
	}
}
