package bridgelabz;

import java.util.Scanner;

public class Generics {
	static Float max;

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st num:");
		Float x = sc.nextFloat();

		System.out.print("Enter 2nd num:");
		Float y = sc.nextFloat();

		System.out.print("Enter 3rd num:");
		Float z = sc.nextFloat();

		if (x.compareTo(y) > 0) {
			max = x;
		} else {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Max number is " + max);

	}
}
