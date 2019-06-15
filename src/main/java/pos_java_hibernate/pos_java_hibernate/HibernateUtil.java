package pos_java_hibernate.pos_java_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	public static void init() {
		try {
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("pos-java-hibernate");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public static Object getPrimaryKey(Object entity) { // Retorna a primary key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
}
