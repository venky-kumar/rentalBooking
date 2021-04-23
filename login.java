import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// level 1 (login page)
		Scanner input =new Scanner(System.in);
		System.out.println("ENTER THE MOBILE NO:");
		long number=input.nextLong();
		if (number==9790430272l ) {
			System.out.println("TQ ,NOW ENTER THE PASSWORD");}

		else {
			System.out.println("THE ENTERED NUMBER IS INVALID");

		}
		//PASSWORD
		System.out.println("ENTER THE PASSWORD:");
		long password=input.nextLong();
		if (password==19111999) {
			System.out.println("welcome,chief");
			cartype.cabtype();
			//cartype.seniorcitizen(password);
			//cartype.booking(null);
		}

	}
}

//car type
class cartype{
	public static void cabtype()  {
		System.out.println("1.MICRO (RS 10/KM)");
		System.out.println("2.MACRO (RS 15/KM)");
		System.out.println("3.PRIME (RS 20/KM)");


		Scanner input =new Scanner(System.in);
		System.out.println("Select your car type");
		int cartype = input.nextInt();

		switch (cartype) {
		case 1:
			System.out.println("you have selected micro");
			String type1 ="micro";
			System.out.println("Enter the km to travel");
			int kilometer1 =input.nextInt();
			int totalkm1 = 10*kilometer1;
			System.out.println("The cost for "+kilometer1+" is "+ totalkm1);
			int gst1 =( totalkm1*7/100);
			double withGst = (totalkm1+gst1);
			System.out.println("THE ESTIMATED COST IS :"+totalkm1+" THE ESTIMATED COST WITH GST: "+ withGst);
			booking(type1);
			peak(kilometer1,withGst,totalkm1);
			//seniorcitizen(gst1,gst1);
			break;
			
			
			
		case 2:
			System.out.println("you have selected micro");
			String type2 ="micro";
			System.out.println("Enter the km to travel");
			int kilometer2 =input.nextInt();
			int totalkm2 = 10*kilometer2;
			System.out.println("The cost for "+kilometer2+" is "+ totalkm2);
			int gst2 =( totalkm2*7/100);
			double withGst2 = (totalkm2+gst2);
			System.out.println("THE ESTIMATED COST IS :"+totalkm2+" THE ESTIMATED COST WITH GST: "+ withGst2);
			booking(type2);
			peak(kilometer2,withGst2,totalkm2);
			//seniorcitizen(gst2,gst2);
			break;
		case 3:
			System.out.println("you have selected micro");
			String type3 ="micro";
			System.out.println("Enter the km to travel");
			int kilometer3 =input.nextInt();
			int totalkm3 = 10*kilometer3;
			System.out.println("The cost for "+kilometer3+" is "+ totalkm3);
			int gst3 =( totalkm3*7/100);
			double withGst3 = (totalkm3+gst3);
			System.out.println("THE ESTIMATED COST IS :"+totalkm3+" THE ESTIMATED COST WITH GST: "+ withGst3);
			booking(type3);
			peak(kilometer3,withGst3,totalkm3);
			//seniorcitizen(gst3,gst3);
			break;
			
		}
	}
	public static void peak(double kilometer1, double gst1, double totalkm1) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the time of journey to check peak hour");
		String time1 = input.next();
		LocalTime peakcheck1=LocalTime.parse(time1);
		int onlyhour1=peakcheck1.getHour();			
		if(onlyhour1>=5 && onlyhour1<=7) {
			double peakcharge1=(kilometer1*0.0125)+gst1+totalkm1;
			System.out.println("it is a peak hour so the price is "+peakcharge1);
			seniorcitizen(gst1,peakcharge1);	
		}
		else {
			System.out.println("The price for your travel is "+gst1);
			seniorcitizen(gst1,gst1);
			
		}
}

	public static void seniorcitizen(double finalcharge3, double peakcharge1){
				LocalDate date = LocalDate.now();
				int cond1= date.getYear();
				//System.out.println("current year"+cond1);
				//System.out.println("date will be displayed"+date);
				Scanner input = new Scanner(System.in);
				System.out.println("enter the date of birth:");
				String dob =input.next();
				LocalDate today = LocalDate.parse(dob);
				int cond2 = today.getYear();
				//System.out.println("yearborn"+cond2);
				int age = cond1-cond2;
				//System.out.println("date of birth"+dob);
				//System.out.println("today"+date);
				System.out.println("age"+age);
				if (age>60) {
					System.out.println("you have 50% discount");
					double afterdiscount = finalcharge3/2;
					System.out.println("After discount the price is"+ afterdiscount );				 
				}
				else {
					System.out.println("no discount"+finalcharge3);
				}
			}
	public static void booking(String type) {
		Scanner input = new Scanner(System.in);
		System.out.println("journey details for "+type);
		System.out.println("Enter the journey date in YYYY-MM-DD");
		String date = input.next();
		LocalDate  journeydate = LocalDate.parse(date);
		System.out.println("Enter the Time for journey in HH:MM:SS");
		String time = input.next();
		LocalTime journeytime = LocalTime.parse(time);
		System.out.println("your journey date and time is "+ journeydate + "and time is " + journeytime);
		
		
	}
	






}
	













