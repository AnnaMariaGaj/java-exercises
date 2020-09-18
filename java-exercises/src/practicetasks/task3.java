package practicetasks;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers to sum");
		String text1 = s.nextLine();
		Integer number1 = Integer.parseInt(text1);
		System.out.println("Choose another integer number");
		String text2 = s.nextLine();
		Integer number2 = Integer.parseInt(text2);
		Integer sum = number1 + number2;
		System.out.println("The sum of your numbers is " + sum);

	}

}
