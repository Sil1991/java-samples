package net.lshimokawa.ejemplos.apachecxf.jaxws;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test de integraci�n del Web Service, requiere que el Web Service est�
 * levantado.
 * 
 * @author lshimokawa
 */
@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloWorldIntegrationTest {

	/**
	 * Interface del Web Service a probar. La implementaci�n es el proxy de
	 * Apache CXF que se inyecta mediante Spring. La configuraci�n se encuentra
	 * en el applicationContext-test.xml
	 */
	@Autowired
	private HelloWorld helloWorld;

	/**
	 * Test de integraci�n, este test prueba el Web Service desplegado.
	 */
	@Test
	public void testSaludar() {
		Assert.assertEquals("Hola Lennon", helloWorld.saludar("Lennon"));
	}
}
