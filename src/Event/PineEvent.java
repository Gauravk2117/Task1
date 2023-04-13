package Event;

import java.util.Scanner;

public class PineEvent {

	public static void main(String[] args) {
		
		System.out.println("Enter the name of the event");
		
		Scanner sc = new Scanner(System.in);
		String EventName= sc.nextLine();
		
		System.out.println("Enter the type of the event");
		String EventType = sc.nextLine();
		
		System.out.println("enter the number of people expected");
		int NumberOfPeople = sc.nextInt();
		
		System.out.println("Is it a paid entry?(type Y or N)");
		String PaidOrUnpaid =sc.next();
		char ch=PaidOrUnpaid.charAt(0);
		sc.close();
	
		
		System.out.println("Enter the projected expenses(in lakhs) for this event");
		Double TotalExpenses = sc.nextDouble();
		
		System.out.println("Event Name:"+EventName);
		System.out.println("Event Type:"+EventType);
		System.out.println("Expected Count:"+NumberOfPeople);
		System.out.println("Paid Entry:"+PaidOrUnpaid);
		System.out.println("Projected Expenses:"+TotalExpenses+"L");
	}

}
