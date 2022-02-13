package co.mercadolibre.rest.dao;

import co.mercadolibre.rest.entity.Planet;

public interface SolarDAO {

	public Planet getPlanet(String name);
}
