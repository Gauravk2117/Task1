package Event;

import java.util.Scanner;

public class TradeFair {

	public static void main(String[] args) {
		int x;
		
		System.out.println("Enter the total number of People");
		Scanner sc = new Scanner(System.in);
		int TotalPeople = sc.nextInt();
		
		x= (TotalPeople*2)/7;
		
		System.out.println("Number of attendees on day 1:"+x);
		System.out.println("Number of attendees on day 2:"+x*2);
		System.out.println("Number of attendees on day 3:"+x/2);
		sc.close();
	}

}
