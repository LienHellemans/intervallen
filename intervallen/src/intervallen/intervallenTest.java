package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervallenTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval() ;
		myInterval.setOndergrens(3); 
		myInterval.setBovengrens(7); 
		int lengte = myInterval.getBovengrens() - myInterval.getOndergrens();
		assertEquals(4,lengte); 
	}

}
