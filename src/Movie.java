public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    
    public double getAmount(int daysrented) {
    	double resultAmount = 0;
        switch (this.getPriceCode()) {
            case REGULAR:
                resultAmount += 2;
                if (daysrented > 2)
                    resultAmount += (daysrented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                resultAmount += daysrented * 3;
                break;
            case CHILDRENS:
                resultAmount += 1.5;
                if (daysrented > 3)
                    resultAmount += (daysrented - 3) * 1.5;
                break;
        }
        return resultAmount;
    }
    
    public int getFrequentRenterPoints(int daysrented) {
    	int points=0;
		
		// add frequent renter points
		points ++;
		// add bonus for a two day new release rental
		if ((this.getPriceCode() == NEW_RELEASE) && daysrented > 1) 
		    points ++;
		
		return points;
    }
    
    public String getTitle (){
        return title;
    };
}