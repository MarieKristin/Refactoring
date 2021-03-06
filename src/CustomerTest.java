import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomer_withNoString() {
		String name = "";
		Customer customer = new Customer(name);

		assertThat("name should be ''.", customer.getName(), is(""));
	}

	@Test
	public void testCustomer_withString() {
		String name = "xy";
		Customer customer = new Customer(name);

		assertThat("name should be 'xy'.", customer.getName(), is("xy"));
	}

	@Test
	public void testAddRental() {
		Movie movie = new Movie("TestMovie", 0); // creates a Movie with name
													// TestMovie and the setting
													// Regular (0)
		Rental rental = new Rental(movie, 2); // creates a rental with movie
												// "movie" and days rented "2"
		Customer customer = new Customer("xy"); // creates a new Customer with
												// the name "xy"

		assertFalse(customer.rentals.contains(rental));

		customer.addRental(rental);

		assertTrue(customer.rentals.contains(rental));
	}

	@Test
	public void testGetName() {
		String result = "xy";
		Customer customer = new Customer(result);
		result = customer.getName();

		assertThat("result should be 'xy'.", result, is("xy"));
	}

	@Test
	public void testStatement() {
		Movie movie = new Movie("TestMovie", 0); // creates a Movie with name
													// TestMovie and the setting
													// Regular (0)
		Rental rental = new Rental(movie, 2); // creates a rental with movie
												// "movie" and days rented "2"
		Customer customer = new Customer("xy"); // creates a new Customer with
												// the name "xy"
		customer.addRental(rental);

		assertThat(
				"Rental Record for xy\n\tTitle\t\tDays\tAmount\n\tTestMovie\t\t2\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points",
				customer.statement(),
				is("Rental Record for xy\n\tTitle\t\tDays\tAmount\n\tTestMovie\t\t2\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points"));
	}

	@Test
	public void testAmountFor_0() {
		Movie movie = new Movie("TestMovie", 0);
		Rental rental = new Rental(movie, 2);
		Customer customer = new Customer("xy");

		assertThat("amount should be 2.0", customer.amountFor(rental), is(2.0));
	}

	@Test
	public void testAmountFor_1() {
		Movie movie = new Movie("TestMovie", 1);
		Rental rental = new Rental(movie, 2);
		Customer customer = new Customer("xy");

		assertThat("amount should be 6.0", customer.amountFor(rental), is(6.0));
	}

	@Test
	public void testAmountFor_2() {
		Movie movie = new Movie("TestMovie", 2);
		Rental rental = new Rental(movie, 2);
		Customer customer = new Customer("xy");

		assertThat("amount should be 1.5", customer.amountFor(rental), is(1.5));
	}
}
