package co.mercadolibre.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.mercadolibre.rest.dao.SolarDAO;
import co.mercadolibre.rest.entity.Planet;

@Service
public class SolarServiceImpl implements SolarService {

	@Autowired
	private SolarDAO solarDAO;

	@Override
	public Planet getPlanet(String name) {
		return solarDAO.getPlanet(null);
	}

}
