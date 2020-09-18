package practicetasks;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			// ask the user to enter the amount
			System.out.println("How many pounds you have?");
			String text = s.nextLine();
			Double amount = Double.parseDouble(text);
			// ask for the currency
			System.out.println("What currency do you want to convert it to? Enter EUR, USD or PLN");
			String currency = s.nextLine();
			// exchange rates
			double gbpToEur = 1.08;
			double gbpToUsd = 1.28;
			double gbpToPln = 4.81;
			
//			if (currency.equals("EUR")) {
//				Double convertedAmount = gbpToEur * amount;
//				System.out.println("This amount converted to EUR is " + convertedAmount);
//				
//			} else if (currency.equals("USD")) {
//				Double convertedAmount = gbpToUsd * amount;
//				System.out.println("This amount converted to USD is " + convertedAmount);
//			
//			} else if (currency.equals("PLN")) {
//				Double convertedAmount = gbpToPln * amount;
//				System.out.println("This amount converted to PLN is " + convertedAmount);
//			} else {
//				System.out.println("We don't support this currency");
//			}
			// calculate the converted amount
			Double convertedAmount = null;
			switch(currency) {
			case "EUR":
				convertedAmount = gbpToEur * amount;
			break;
			case "USD":
				convertedAmount = gbpToUsd * amount;
			break;
			case "PLN":
				convertedAmount = gbpToPln * amount;
			break;
			default:
				System.out.println("We don't support this currency");
			}
			// show the result
			if (convertedAmount != null) {
				System.out.println(amount + " GBP converted to " + currency + " is " + convertedAmount);
			}
		}
		
	}

}
