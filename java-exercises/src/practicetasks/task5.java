package practicetasks;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers to sum");
		double sum = 0.0;

		while(true) {
//			String text = s.nextLine();
//			Double number = Double.parseDouble(text);
			Double number = s.nextDouble();
			if (number == 0) {
				break;
			}
			sum += number;
		}
		System.out.println("The sum of your numbers is " + sum);

	}

}
