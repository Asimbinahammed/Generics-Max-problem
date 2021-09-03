package bridgelabz;

import java.util.Scanner;

public class Generics {
	static String max;

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string ");
		String x = sc.nextLine();

		System.out.print("Enter string ");
		String y = sc.nextLine();

		System.out.print("Enter string ");
		String z = sc.nextLine();

		if (x.compareTo(y) > 0) {
			max = x;
		} else {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Max string is : " + max);

	}
}
