package dao;

import javax.persistence.EntityManager;

import entidade.Relogio;
import util.JPAUtil;

public class RelogioDao {
	
	public static void salvar(Relogio r) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();
		em.close();
	}
	
}
