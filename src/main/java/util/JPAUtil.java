package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
	
	public static EntityManager criarEntityManager() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
}