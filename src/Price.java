
abstract class Price {
	abstract int getPriceCode();
	
	abstract double getAmount(int daysrented);
	
	public int getFrequentRenterPoints(int daysrented) {
		int points = 0;

		// add frequent renter points
		points++;
		// add bonus for a two day new release rental
		if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysrented > 1)
			points++;

		return points;
	}
}
