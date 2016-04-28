
abstract class Price {
	abstract int getPriceCode();

	abstract double getAmount(int daysrented);

	public int getFrequentRenterPoints(int daysrented) {
		return 1;
	}
}
