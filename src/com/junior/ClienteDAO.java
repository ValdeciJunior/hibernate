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
import org.hibernate.query.Query;

/**
 * Home object for domain model class Cliente.
 * 
 * @see com.junior.Cliente
 * @author Hibernate Tools
 */
public class ClienteDAO {

	private static final Log log = LogFactory.getLog(ClienteDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
		return sessionFactory;
	}

	public void persist(Cliente cliente) {
		log.debug("persisting Cliente instance");
		try {

			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(cliente);
			session.getTransaction().commit();

		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(Cliente cliente) {
		log.debug("deleting Cliente instance");
		try {

			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.delete(cliente);
			session.getTransaction().commit();
			log.debug("Delete Sucesso");
		} catch (RuntimeException re) {
			log.error("Delete failed", re);
			throw re;
		}
	}

	public void merge(Cliente cliente) {
		log.debug("merge Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.merge(cliente);
			session.getTransaction().commit();
			log.debug("Merge Sucesso");
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}
	}

	public List<Cliente> findAll() {
		log.debug("get all Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			// HQL
			String hql = "from Cliente";
			Query query = session.createQuery(hql);
			List<Cliente> clientes = query.list();
			session.getTransaction().commit();
			return clientes;
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}

	}

	public Cliente find(long id) {
		log.debug("get Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			Cliente cliente = (Cliente) sessionFactory.getCurrentSession().get("com.junior.Cliente", id);
			session.getTransaction().commit();
			if (cliente == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return cliente;
		} catch (RuntimeException re) {
			log.error("Merge failed", re);
			throw re;
		}

	}

}
