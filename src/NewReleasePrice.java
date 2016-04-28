
public class NewReleasePrice extends Price{
	
	int getPriceCode() {
		 return Movie.NEW_RELEASE;
		 }
	
	public double getAmount(int daysrented) {
		return daysrented * 3;
	}

}
