import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class NewReleasePriceTest {

	@Test
	public void testGetPriceCode() {
		NewReleasePrice price = new NewReleasePrice();
		
		assertThat("PriceCode should be 1", price.getPriceCode(), is(1));
	}

	@Test
	public void testGetCharge() {
		NewReleasePrice price = new NewReleasePrice();
		
		assertThat("Charge should be 6.0", price.getCharge(2), is(6.0));
	}

	@Test
	public void testGetFrequentRenterPoints() {
		NewReleasePrice price = new NewReleasePrice();
		
		assertThat("FrequentRenterPoints should be 2", price.getFrequentRenterPoints(2), is(2));
	}

}
