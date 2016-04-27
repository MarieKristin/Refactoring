import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class RentalTest {

	@Test
	public void testRental() {
		Movie movie = new Movie("TestMovie", 0);
		Rental rental = new Rental(movie, 5);
		
		assertThat("Movie should be 'movie'", rental.getMovie(), is(movie));
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
	public void testGetAmount_0() {
		Movie movie = new Movie("TestMovie", 0);
		Rental rental = new Rental(movie, 2);
		
		assertThat("amount should be 2.0", rental.getAmount(), is(2.0));		
	}
	
	@Test
	public void testGetAmount_1() {
		Movie movie = new Movie("TestMovie", 1);
		Rental rental = new Rental(movie, 2);
		
		assertThat("amount should be 6.0", rental.getAmount(), is(6.0));		
	}
	
	@Test
	public void testGetAmount_2() {
		Movie movie = new Movie("TestMovie", 2);
		Rental rental = new Rental(movie, 2);
		
		assertThat("amount should be 1.5", rental.getAmount(), is(1.5));		
	}

}
