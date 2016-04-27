import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class MovieTest {

	@Test
	public void testMovie_0() {
		Movie movie = new Movie("x", 0);
		
		assertThat("Title should be 'x'", movie.getTitle(), is("x"));
		assertThat("PriceCode should be '0'", movie.getPriceCode(), is(0));
	}
	
	@Test
	public void testMovie_1() {
		Movie movie = new Movie("y", 1);
		
		assertThat("Title should be 'y'", movie.getTitle(), is("y"));
		assertThat("PriceCode should be '1'", movie.getPriceCode(), is(1));
	}
	
	@Test
	public void testMovie_2() {
		Movie movie = new Movie("z", 2);
		
		assertThat("Title should be 'z'", movie.getTitle(), is("z"));
		assertThat("PriceCode should be '2'", movie.getPriceCode(), is(2));
	}

	@Test
	public void testGetPriceCode_0() {
		Movie movie = new Movie("xy",0);
		
		assertThat("PriceCode should be '0'", movie.getPriceCode(), is(0));
	}
	
	@Test
	public void testGetPriceCode_1() {
		Movie movie = new Movie("xy",1);
		
		assertThat("PriceCode should be '1'", movie.getPriceCode(), is(1));
	}
	
	@Test
	public void testGetPriceCode_2() {
		Movie movie = new Movie("xy",2);
		
		assertThat("PriceCode should be '2'", movie.getPriceCode(), is(2));
	}

	@Test
	public void testSetPriceCode_0() {
		Movie movie = new Movie("xy",0);
		
		assertThat("PriceCode should be '0'", movie.getPriceCode(), is(0));
	}
	
	@Test
	public void testSetPriceCode_1() {
		Movie movie = new Movie("xy",1);
		
		assertThat("PriceCode should be '1'", movie.getPriceCode(), is(1));
	}
	
	@Test
	public void testSetPriceCode_2() {
		Movie movie = new Movie("xy",2);
		
		assertThat("PriceCode should be '2'", movie.getPriceCode(), is(2));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetPriceCode_default() {
		Movie movie = new Movie("xy",3);
	}

	@Test
	public void testGetTitle() {
		Movie movie = new Movie("xy", 2);
		
		assertThat("Title should be 'xy'", movie.getTitle(), is("xy"));
	}

	@Test
	public void testGetCharge() {
		Movie movie = new Movie("xy", 0);
		
		assertThat("Charge should be 4.5", movie.getCharge(5), is(4.5));
	}

	@Test
	public void testGetFrequentRenterPoints() {
		Movie movie = new Movie("xy", 0);
		
		assertThat("FrequentRenterPoints should be 1", movie.getFrequentRenterPoints(5), is(1));
	}

}
