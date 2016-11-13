package java_air.main;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Xu Wu
 *
 */

public class AircraftTest {

	@Test
	public void newAircraft_TestNegativePassengerCapacity() {
		try{ 
			Aircraft aircraft = new Aircraft("ABC",-2);
			fail();
			}catch (Exception e){
				assertTrue(true);
			}
	}

	@Test
	public void setFlightRange_TestNegative() {
		Aircraft aircraft = new Aircraft("ABC",58);
		try{ 
			aircraft.setFlightRange(-554);
			fail();
			}catch (Exception e){
				assertTrue(true);
			}
	}

	@Test
	public void setSpeed_TestNegative() {
		Aircraft aircraft = new Aircraft("ABC",58);
		try{ 
			aircraft.setSpeed(-787);
			fail();
			}catch (Exception e){
				assertTrue(true);
			}
	}

	@Test
	public void setPurchasePrice_TestNegative() {
		Aircraft aircraft = new Aircraft("ABC",58);
		try{ 
			aircraft.setPurchasePrice(-70);
			fail();
			}catch (Exception e){
				assertTrue(true);
			}
	}
}