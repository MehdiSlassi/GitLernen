package com.slassi.chapter1;

public class MyFirstClass {

	public static void main(String[] args) {
		System.out.println("This is my first class");
		System.out.println("java is funny");
		// while loop
		int x = 1;

		while (x < 4) {
			System.out.println("x ist: " + x);
			x = x + 1;
		}

		if (x == 1) {
			System.out.println("x muss 1 sein");
		} else {
			System.out.println("der Wert von x ist: " + x);
		}

	}

}
