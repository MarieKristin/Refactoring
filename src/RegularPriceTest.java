import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class RegularPriceTest {

	@Test
	public void testGetPriceCode() {
		RegularPrice price = new RegularPrice();
		
		assertThat("PriceCode should be 0", price.getPriceCode(), is(0));
	}

	@Test
	public void testGetCharge_mit5() {
		RegularPrice price = new RegularPrice();
		
		assertThat("Charge should be 4.5", price.getCharge(5), is(4.5));
	}
	
	@Test
	public void testGetCharge_mit1() {
		RegularPrice price = new RegularPrice();
		
		assertThat("Charge should be 2.0", price.getCharge(1), is(2.0));
	}

	@Test
	public void testGetFrequentRenterPoints() {
		RegularPrice price = new RegularPrice();
		
		assertThat("FrequentRenterPoints should be 1", price.getFrequentRenterPoints(2), is(1));
	}

}
