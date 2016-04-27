import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class MovieTest {

	@Test
	public void testMovie() {
		Movie movie = new Movie("xy", 0);
		
		assertThat("Title should be 'xy'", movie.getTitle(), is("xy"));
		assertThat("PriceCode should be '0'", movie.getPriceCode(), is(0));
	}

	@Test
	public void testGetPriceCode() {
		Movie movie = new Movie("xy",0);
		
		assertThat("PriceCode should be '0'", movie.getPriceCode(), is(0));
	}

	@Test
	public void testSetPriceCode() {
		Movie movie = new Movie("xy",0);
		movie.setPriceCode(1);
		
		assertThat("PriceCode should be '1'", movie.getPriceCode(), is(1));
	}

	@Test
	public void testGetTitle() {
		Movie movie = new Movie("xy", 2);
		
		assertThat("Title should be 'xy'", movie.getTitle(), is("xy"));
	}

}
