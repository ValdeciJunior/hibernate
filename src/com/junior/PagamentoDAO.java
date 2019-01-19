package com.junior;
// Generated 18/jan/2019 22:29:22 by Hibernate Tools 4.3.1

import java.io.File;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Pagamento.
 * @see com.junior.Pagamento
 * @author Hibernate Tools
 */
public class PagamentoDAO {

	private static final Log log = LogFactory.getLog(PagamentoDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
				return sessionFactory; 
	}

	public void persist(Pagamento pagamento) {
		log.debug("persisting Pagamento instance");
		try {
			
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(pagamento);
			session.getTransaction().commit();
			
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(Pagamento pagamento) {
		log.debug("deleting Pagamento instance");
		try {
			
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.delete(pagamento);
			session.getTransaction().commit();
			log.debug("Delete Sucesso");
		} catch (RuntimeException re) {
			log.error("Delete failed", re);
			throw re;
		}
	}
	
	public void merge(Pagamento pagamento) {
		log.debug("merge Pagamento instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.merge(pagamento);
			session.getTransaction().commit();
			log.debug("Merge Sucesso");
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}
	}
	
	public List<Pagamento> findAll() {
		log.debug("get all Pagamento instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			//HQL
			session.getTransaction().commit();
			log.debug("Merge Sucesso");
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}
		return null;
	}
	
	public Pagamento find(PagamentoId id) {
		log.debug("get Pagamento instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			
			Pagamento pagamento = (Pagamento) sessionFactory.getCurrentSession().get("com.junior.Pagamento", id);
			session.getTransaction().commit();
			if (pagamento == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return pagamento;			
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}
		
	}
}
