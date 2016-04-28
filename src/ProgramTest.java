import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;


public class ProgramTest {
	
	@Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void testMain() {
		String[] args = {"",""};
		Program.main(args);
		
		assertEquals("Welcome to the Movie Store\nLet's get the Statement\nRental Record for joe\n\tTitle\t\tDays\tAmount\n\tmovie1\t\t10\t14.0\n\tmovie2\t\t5\t6.5\nAmount owed is 20.5\nYou earned 2 frequent renter points\n", systemOutRule.getLogWithNormalizedLineSeparator());
	}

}
