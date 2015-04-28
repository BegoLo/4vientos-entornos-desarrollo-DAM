/**
 * 
 */
package org.cuatrovientos.ips.junit_generateIps;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author BegoLo
 *
 */
public class GeneradorIpTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void generarNumerotest() {
		GeneradorIp num = new GeneradorIp();
		int numAl=0;
		int TIMES = 10000;
		for (int i = 0 ; i < TIMES; i++){
			numAl = num.generarNumero(0, 255);
			assertTrue("Between 0 and 254",numAl>=0 && numAl<=255);
		}
	}
	
	@Test
	public void generarIptest() {
		GeneradorIp num = new GeneradorIp();
		String ip = num.generarIp();
		String[] partesIP = ip.split("/./"); //para que haga bien el split deberemos ponerle las barras
		assertFalse("It is not 0", partesIP[0].equals("0"));
	}
	

}
