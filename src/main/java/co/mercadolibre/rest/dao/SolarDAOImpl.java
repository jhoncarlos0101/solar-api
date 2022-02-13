package co.mercadolibre.rest.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import co.mercadolibre.rest.entity.Planet;

//@Repository
public class SolarDAOImpl implements SolarDAO {

	@Autowired
	private EntityManager entityManager;

	public Planet getPlanet(String name) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.createQuery("from Planet", Planet.class).getSingleResult();
	}
}
