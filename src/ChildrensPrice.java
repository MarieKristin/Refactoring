
public class ChildrensPrice extends Price {

	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	public double getAmount(int daysrented) {

		if (daysrented > 3)
			return 1.5 + ((daysrented - 3) * 1.5);
		else
			return 1.5;
	}
}
