package intervallen;

import intervallen.intervallenTest.Interval;
/**
 * Elke instantie van deze klasse slaat een interval met gehele ondergrens en bovengrens op. 
 * 
 * @invar De bovengrens is groter dan of gelijk aan de ondergrens
 *    | getOndergrens() <= getBovengrens()
 * @invat De lengte is gelijk aan de bovengrens min de ondergrens 
 *    | getLengte() == getBovengrens() -
 *    |     getOndergrens()
 */
public class interval {
	private int ondergrens; 
	private int lengte;
	public int getOndergrens() { return ondergrens;}
	public int getBovengrens() { return ondergrens + lengte;}
	public int getLengte() {return lengte;}
	/**
	 * Stelt het object in met de gegeven waarden. 
	 * @pre | ondergrens <= bovengrens
	 * @post | getOndergrens() == ondergrens
	 * @post | getBovengrens() == bovengrens
	 * 
	 */
	public interval(int ondergrens, int bovengrens) {
		this.ondergrens = ondergrens ; 
		lengte = bovengrens - ondergrens; 
	}
	/**
	 * @mutates | this 
	 * @post |getOndergrens() == ondergrens
	 * @post |getLengte() == old(getLengte())
	 */
	public void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens;
	}
	/**
	 * @mutates | this
	 * @post | getBovengrens() == bovengrens
	 * @post | getOndergrens() == old(getOndergrens())
	 */
	static void setBovengrens(int bovengrens) {
		lengte = bovengrens - ondergrens;
	}
}
