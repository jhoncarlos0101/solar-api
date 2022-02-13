package co.mercadolibre.rest.facade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.mercadolibre.rest.app.Api;
import co.mercadolibre.rest.entity.Planet;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Api.class)
public class SolarFacadeTest {

	@Autowired
	private SolarFacade solarFacade;

	@Test
	public void getPlanetTestAssertEquals() {
		Planet planet = new Planet();
		planet.setName("Default");
		assertEquals(planet, solarFacade.getPlanet(null));
	}

	@Test
	public void getPlanetTestAssertNullName() {
		Planet planet = new Planet();
		assertNotEquals(planet, solarFacade.getPlanet(null));
	}

	@Test
	public void getPlanetTestAssertNonNull() {
		Planet planet = new Planet();
		planet.setName("Default2");
		assertEquals(planet, solarFacade.getPlanet(planet.getName()));
	}
}