package in.venkatesh;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

public class PeakCheck {

	public static void peak(double withGst1) {
		System.out.println("-----------------------------------------");
		System.out.println("peak hour calculation and booking details");
		System.out.println("-----------------------------------------");
		String UserDate = "2021-05-21";
		LocalDate date = LocalDate.now();
		LocalDate parsedate = LocalDate.parse(UserDate);
		System.out.println("---------pickup date and time---------");
		String time = "17:30";
		LocalTime pickUpTime = LocalTime.parse(time);
		int hour = pickUpTime.getHour();
		System.out.println("pickUp  date : " + UserDate);
		System.out.println("Pick Up Time : " + time);
		if (hour >= 17 && hour <= 19) {
			double peakcharge1 = (withGst1 * 0.125) + withGst1;
			System.out.println("it is a peak hour so the price is " + peakcharge1);
		} else {
			System.out.println(" It is not a peakhour so The price for your travel is " + withGst1);
		}

	}
}
