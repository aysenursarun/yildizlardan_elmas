package yildizlardan_elmas;

import java.util.Scanner;

public class yildizlardan_elmas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir sayı girin: ");
		int sayi = scan.nextInt();

		for (int i = 0; i <= sayi; i++) {

			for (int j = 0; j < (sayi - i); j++) {
				System.out.print(" ");
			}

			for (int x = 1; x <= (2 * i + 1); x++) {
				System.out.print("*");
			}

			System.out.println(" ");
		}

		for (int b = sayi-1; b >= 0; b--) {

			for (int c = sayi-b; c >= 1; c--) {
				System.out.print(" ");
			}

			for (int d = 2 * b + 1; d >= 1; d--) {
				System.out.print("*");
			}

			System.out.println(" ");

		}
	}

}
