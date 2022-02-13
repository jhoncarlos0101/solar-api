package co.mercadolibre.rest.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.mercadolibre.rest.entity.Planet;
import co.mercadolibre.rest.service.SolarService;

@Component
public class SolarFacade extends FacadeBase {

	@Autowired
	private SolarService solarService;

	public Planet getPlanet(String name) {
		validateHeaders();
		return solarService.getPlanet(name);
	}
}
