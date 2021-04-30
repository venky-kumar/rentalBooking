package in.venkatesh;

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.Scanner;

public class rentalBooking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long mobNo = 9790430272l;
		String password = "ragul";

		if (loginPage.loginValidation(mobNo, password) == true) {
			System.out.println("logged in successfully");
			loginArray.arraylogin();
			selectionPage.selecttype();
			int vehicleType = 1;
			String type = "basic";
			int rentalHour = 8;
			double cycleCost = 100;

			rentalCalculation.calculationOfCase(vehicleType, type, rentalHour, cycleCost);
		}

		else {
			System.out.println("Invalid Credentials");
		}

	}

}
