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
		return movie.getFrequentRenterPoints(this.getDaysRented());
	}
}