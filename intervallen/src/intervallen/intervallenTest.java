package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervallenTest {

	class Interval {
		// REPRESENTATIE
		int ondergrens; 
		int lengte; 
	}
	
	
	@Test
	void test() {
		Interval myInterval = new Interval() ;
		Interval.setOndergrens(myInterval, 3); 
		Interval.setBovengrens(myInterval, 7); 
		int lengte = Interval.getBovengrens(myInterval) - interval.getOndergrens(myInterval);
		assertEquals(4, lengte);
	}

}
