package co.mercadolibre.rest.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.mercadolibre.rest.entity.Planet;
import co.mercadolibre.rest.enums.EnumDirection;
import co.mercadolibre.rest.facade.SolarFacade;

@RestController
@RequestMapping(path = "/getws")
public class SolarController {
	private static Logger logger = Logger.getLogger(SolarController.class);

	@Autowired
	private SolarFacade solarFacade;

	@PostMapping(path = "/planet", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })

//	@RequestMapping(method = RequestMethod.POST, value = "/planet")
	public Planet getPlanet(@RequestBody Planet planet, HttpServletRequest httpServletRequest) {
		if (planet == null) {
			planet = new Planet("Default", BigDecimal.ZERO, EnumDirection.CLOCKWISE, BigDecimal.ZERO);
			planet = solarFacade.getPlanet(planet.getName());
		}
		logger.info(planet);
		return planet;
	}
}
