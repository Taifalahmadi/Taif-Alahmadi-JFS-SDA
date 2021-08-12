package flyaway;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class flightDAO {
	
	
	public void store(flights f) {
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(f);
		tx.commit();
		session.close();
		factory.close();
	}
	public flights getById(int id) {
		flights  flight = null;
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
		flight = session.get(flights .class, id);
		if(flight != null) 
		return flight;
		else
			throw new RuntimeException("Sorry flight with an id "+id+" not found");
	}

}
