package flyaway;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberanteUtil {
	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		return cfg.buildSessionFactory();
	}
}