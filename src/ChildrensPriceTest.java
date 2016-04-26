import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class ChildrensPriceTest {

	@Test
	public void testGetPriceCode() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		int result = childrensPrice.getPriceCode();
		
		assertThat("Should be giving back 2", result, is(2));
	}

	@Test
	public void testGetCharge_mitZwei() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		double result = childrensPrice.getCharge(2);
		
		assertThat("Should be giving back 1.5", result, is(1.5));
	}
	
	@Test
	public void testGetCharge_mitNeun() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		double result = childrensPrice.getCharge(9);
		
		assertThat("Should be giving back 9.0", result, is(9.0));
	}

	@Test
	public void testGetFrequentRenterPoints() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		int result = childrensPrice.getFrequentRenterPoints(5);
		
		assertThat("Should be giving back 1.", result, is(1));
	}

}
