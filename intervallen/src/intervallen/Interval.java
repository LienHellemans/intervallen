package intervallen;

/**
 * Elke instantie van deze klasse slaat een interval 
 * met gehele ondergrens en bovengrens op. 
 * 
 * @invar De bovengrens is groter dan of gelijk aan de ondergrens
 *    | getOndergrens() <= getBovengrens()
 * @invar De lengte is gelijk aan de bovengrens min de ondergrens
 *    | getLengte() == getBovengrens() - getOndergrens()
 */

public class Interval {
	/**
	 * @invar | 0 <= lengte
	 */
	private int ondergrens; 
	private int lengte; 
	
	public int getOndergrens() {
		return ondergrens;
	}
	public int getBovengrens() {
		return ondergrens + lengte;
	}
	
	public int getLengte() {
		return lengte;
	}
	/**
	 * Stelt het object in met de gegeven waarden.
	 * @pre | ondergrens <= bovengrens 
	 * @post | getOndergrens() == ondergrens
	 * @post | getBovengrens() == bovengrens
	 */
	public Interval(int ondergrens, int bovengrens){
		this.ondergrens = ondergrens; 
		lengte = bovengrens - ondergrens;
	}
	/**
	 * @mutates | this
	 * @post | getOndergrens() == ondergrens
	 * @post | getLengte() == old(getLengte())
	 */
	public void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens; 
	}
	// bij deze set ondergrens moet je geen preconditie toevoegen 
	// omdat de bovengrens gewoon meebeweegt om wille van de lengte die
	// ongewijzigd blijft. Als we hier schrijven dat de bovengrens ongewijzigd
	// bleef dan moesten we wel een preconditie schrijven.
	/**
	 * @pre | getOndergrens() <= bovengrens
	 * @mutates | this 
	 * @post | getBovengrens() == bovengrens
	 * @post | getOndergrens() == old(getOndergrens())
	 */
	public void setBovengrens(int bovengrens) {
		lengte = bovengrens - ondergrens;
	}
}
