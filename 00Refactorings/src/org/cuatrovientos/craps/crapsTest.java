/**
 * 
 */
package org.cuatrovientos.craps;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author BegoLo
 *
 */
public class crapsTest {

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
	public void testConstructor() {
		craps myCraps = new craps(66.6d);
		double expected = 66.6d;
		double target = myCraps.getMoney();
		assertTrue("Money ok", expected == target);

	}

	@Test
	public void putBetTest() {
		craps myCraps = new craps(66.6d);
		double target = myCraps.putBet(1d);
		assertTrue("", myCraps.getPlayerLastBet() < target);
	}
	@Test
	public void rollTest(){
		int d1 = 0;
		int d2 = 0;
		craps myCraps = new craps(66.6d);
		for (int i = 0; i<100;i++) {
			myCraps.roll();
			d1 = myCraps.getD1();
			d2 = myCraps.getD2();
			assertTrue("ramdom d1 ok", d1 >=0 && d1 <=5);
			assertTrue("random d2 ok", d2 >=0 && d2 <=5);}
		}
	
	@Test
	public void winOrwhatTest(){
		int d1 = 0;
		int d2 = 0;
		craps myCraps = new craps(66.6d);
		for (int i = 0; i<100;i++) {
			myCraps.roll();
			d1 = myCraps.getD1();
			d2 = myCraps.getD2();
			boolean target = myCraps.winOrwhat();
			boolean expected;
			if (d1 == d2){
				expected = true;
			}else{
				expected = false;
			}
			assertTrue("", target == expected);
		}
	}
}
