package practicetasks;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers to sum");
		int sum = 0;

		while(true) {
			String text = s.nextLine();
//			if (text.equals("0")) {
//				break;
//			}
			Integer number = Integer.parseInt(text);
			if (number == 0) {
				break;
			}
			sum += number;
		}
		System.out.println("The sum of your numbers is " + sum);
		
	}

}
