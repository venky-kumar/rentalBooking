package in.venkatesh;

import java.util.ArrayList;

public class selectionPage {
	public static void selecttype() {
		ArrayList<String> cycle = new ArrayList<String>();
		System.out.println("-----------cycles-----------");
		cycle.add("1.cycle:basic 50Rs/hr");
		cycle.add("2.gear cycle 100Rs/hr");
		cycle.add("3.electric cycle 150Rs/hr");
		for (String a : cycle) {
			System.out.println(a);

		}
		System.out.println("the available no of cycle are = " + cycle.size());
		cycle.remove("1.cycle:basic 50Rs/hr");
		System.out.println("now the no of cycles avilable are" + cycle.size());

		ArrayList<String> bike = new ArrayList<String>();
		System.out.println("-----------bikes-----------");
		bike.add("1.Scooter 100Rs/hr");
		bike.add("2.Gear Bike 150Rs/hr");
		bike.add("3.Super Bike 400/hr");
		for (String b : bike) {
			System.out.println(b);

		}
		System.out.println("the available no of bikes are = " + bike.size());
		cycle.remove("1.Scooter 100Rs/hr");
		System.out.println("now the no of bikes avilable are" + bike.size());

		ArrayList<String> cars = new ArrayList<String>();
		System.out.println("-----------cars-----------");
		cars.add("1.without A/C");
		cars.add("2.with A/C");
		for (String c : cars) {
			System.out.println(c);
		}
		System.out.println("the available no of cars are = " + cars.size());
		cars.remove("1.without A/C");
		System.out.println("now the no of cars avilable are = " + cars.size());

	}

}