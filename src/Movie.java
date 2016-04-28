public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private Price price;

	public Movie(String newtitle, int newpriceCode) {
		title = newtitle;
		setPriceCode(newpriceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}

	}

	public double getAmount(int daysrented) {
		return price.getAmount(daysrented);
	}

	public int getFrequentRenterPoints(int daysrented) {
		int points = 0;

		// add frequent renter points
		points++;
		// add bonus for a two day new release rental
		if ((this.getPriceCode() == NEW_RELEASE) && daysrented > 1)
			points++;

		return points;
	}

	public String getTitle() {
		return title;
	};
}