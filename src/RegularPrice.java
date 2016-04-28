
public class RegularPrice extends Price {

	int getPriceCode() {
		return Movie.REGULAR;
	}

	public double getAmount(int daysrented) {
		if (daysrented > 2)
			return 2.0 + ((daysrented - 2) * 1.5);
		else
			return 2.0;
	}
}
