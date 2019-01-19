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
 * Home object for domain model class Curso.
 * @see com.junior.Curso
 * @author Hibernate Tools
 */
public class CursoDAO {

	private static final Log log = LogFactory.getLog(CursoDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
				return sessionFactory; 
	}

	public void persist(Curso curso) {
		log.debug("persisting Curso instance");
		try {
			
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(curso);
			session.getTransaction().commit();
			
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(Curso curso) {
		log.debug("deleting Curso instance");
		try {
			
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.delete(curso);
			session.getTransaction().commit();
			log.debug("Delete Sucesso");
		} catch (RuntimeException re) {
			log.error("Delete failed", re);
			throw re;
		}
	}
	
	public void merge(Curso curso) {
		log.debug("merge Curso instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.merge(curso);
			session.getTransaction().commit();
			log.debug("Merge Sucesso");
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}
	}
	
	public List<Curso> findAll() {
		log.debug("get all Curso instance");
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
	
	public Curso find(long cdcurso) {
		log.debug("get Curso instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			
			Curso curso = (Curso) sessionFactory.getCurrentSession().get("com.junior.Curso", cdcurso);
			session.getTransaction().commit();
			if (curso == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return curso;			
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}
		
	}
}
