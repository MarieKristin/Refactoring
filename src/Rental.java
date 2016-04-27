class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    
    public double getAmount() {
        double resultAmount = 0;
        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                resultAmount += 2;
                if (this.getDaysRented() > 2)
                    resultAmount += (this.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                resultAmount += this.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                resultAmount += 1.5;
                if (this.getDaysRented() > 3)
                    resultAmount += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return resultAmount;
    }
    
    public int getFrequentRenterPoints() {
		int points=0;
		
		// add frequent renter points
		points ++;
		// add bonus for a two day new release rental
		if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() > 1) 
		    points ++;
		
		return points;
	}
}