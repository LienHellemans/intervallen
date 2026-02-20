package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervallenTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval() ;
		Interval.setOndergrens(myInterval, 3); 
		Interval.setBovengrens(myInterval, 7); 
		int lengte = Interval.getBovengrens(myInterval) - Interval.getOndergrens(myInterval);
		assertEquals(4,lengte); 
	}

}
