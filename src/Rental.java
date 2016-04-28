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
        return movie.getAmount(this.getDaysRented());
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