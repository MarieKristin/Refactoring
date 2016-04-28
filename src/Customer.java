import java.util.*;

class Customer {
	private String name;
	public Vector rentals = new Vector();

	public Customer(String newname) {
		name = newname;
	};

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	};

	public String getName() {
		return name;
	};

	public String statement() {
		Enumeration enum_rentals = rentals.elements();
		String result = "Rental Record for " + this.getName() + "\n";
		result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

		while (enum_rentals.hasMoreElements()) {
			Rental each = (Rental) enum_rentals.nextElement();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t"
					+ String.valueOf(each.getAmount()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(this.getTotalAmount()) + "\n";
		result += "You earned " + String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int points = 0;
		Enumeration rentals = this.rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			points += each.getFrequentRenterPoints();
		}

		return points;
	}

	private double getTotalAmount() {
		double totalAmount = 0;
		Enumeration rentals = this.rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			totalAmount += each.getAmount();
		}

		return totalAmount;
	}

	public double amountFor(Rental each) {
		return each.getAmount();

	}
}