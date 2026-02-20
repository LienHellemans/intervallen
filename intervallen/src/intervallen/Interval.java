package intervallen;

public class Interval {
	int ondergrens; 
	int lengte; 
	
	static int getOndergrens(Interval interval) {
		return interval.ondergrens;
	}
	static int getBovengrens(Interval interval) {
		return interval.ondergrens + interval.lengte;
	}
	static void setOndergrens(Interval interval, int ondergrens) {
		interval.ondergrens = ondergrens; 
	}
	static void setBovengrens(Interval interval, int bovengrens) {
		interval.lengte = bovengrens - interval.ondergrens;
	}
}
