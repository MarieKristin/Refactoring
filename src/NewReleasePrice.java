
public class NewReleasePrice extends Price {

	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	public double getAmount(int daysrented) {
		return daysrented * 3;
	}

	public int getFrequentRenterPoints(int daysrented) {
		// add bonus for a two day new release rental
		return (daysrented > 1) ? 2 : 1;
	}

}
