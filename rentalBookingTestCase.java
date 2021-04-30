package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class rentalBookingTestCase {

	@Test
	public void test() {
		long mobno = 9790430272l;
		String password="ragul";
		boolean output = loginPage.loginValidation(mobno,password);
		assertTrue(output);
	}

	@Test

	public void test1() {
		long mobno = 9790430262l;
		String password="ragul";
		boolean output = loginPage.loginValidation(mobno,password);
		assertFalse(output);
	}

}
