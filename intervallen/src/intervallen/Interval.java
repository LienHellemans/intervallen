package intervallen;

public class Interval {
	private int ondergrens; 
	private int lengte; 
	
	int getOndergrens() {
		return this.ondergrens;
	}
	int getBovengrens() {
		return this.ondergrens + this.lengte;
	}
	void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens; 
	}
	void setBovengrens(int bovengrens) {
		this.lengte = bovengrens - this.ondergrens;
	}
}
