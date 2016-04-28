
abstract class Price {
	abstract int getPriceCode();
	
	public double getAmount(int daysrented) {
		double resultAmount = 0;
		switch (this.getPriceCode()) {
		case Movie.REGULAR:
			resultAmount += 2;
			if (daysrented > 2)
				resultAmount += (daysrented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			resultAmount += daysrented * 3;
			break;
		case Movie.CHILDRENS:
			resultAmount += 1.5;
			if (daysrented > 3)
				resultAmount += (daysrented - 3) * 1.5;
			break;
		}
		return resultAmount;
	}
}
