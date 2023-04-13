package Event;

import java.util.Scanner;

public class EventManagement {

	public static void main(String[] args) {
		
		System.out.println("Enter branding expenses");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter travel expenses");
		int b = sc.nextInt();
		
		System.out.println("Enter food expenses");
		int c = sc.nextInt();
		
		System.out.println("Enter logistic expenses");
		int d = sc.nextInt();
		
		int t = a+b+c+d;
		System.out.println("Total Expenses:"+t);
		
		float BrandingExpenses=(a*100)/t;
		System.out.println("Branding Expenses percentage:"+BrandingExpenses+"%");
		
		float TravelExpenses=(b*100)/t;
		System.out.println("Travel Expenses percentage:"+TravelExpenses+"%");
		
		float FoodExpenses=(c*100)/t;
		System.out.println("Food Expenses percentage:"+FoodExpenses+"%");
		
		float LogisticExpenses=(d*100)/t;
		System.out.println("Logistic Expenses percentage:"+LogisticExpenses+"%");
		sc.close();

	}

}
