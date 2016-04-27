import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class RentalTest {

	@Test
	public void testRental() {
		Movie movie = new Movie("TestMovie", 0);
		Rental rental = new Rental(movie, 5);
		
		assertThat("MovieName should be 'TestMovie'", rental.getMovie().getTitle(), is("TestMovie"));
		assertThat("DaysRented should be 5", rental.getDaysRented(), is(5));
	}

	@Test
	public void testGetDaysRented() {
		Movie movie = new Movie("TestMovie", 0);
		Rental rental = new Rental(movie, 5);
		
		assertThat("DaysRented should be 5", rental.getDaysRented(), is(5));
	}

	@Test
	public void testGetMovie() {
		Movie movie = new Movie("TestMovie", 0);
		Rental rental = new Rental(movie, 5);
		
		assertThat("Movie should be 'movie'", rental.getMovie(), is(movie));
	}

	@Test
	public void testGetCharge() {
		Movie movie = new Movie("TestMovie", 2); 
		Rental rental = new Rental(movie, 3);

		assertThat("Charge should be 1.5", rental.getCharge(), is(1.5));
	}

	@Test
	public void testGetFrequentRenterPoints() {
		Movie movie = new Movie("TestMovie", 2); 
		Rental rental = new Rental(movie, 3);

		assertThat("Should return 1", rental.getFrequentRenterPoints(), is(1));
	}

}
