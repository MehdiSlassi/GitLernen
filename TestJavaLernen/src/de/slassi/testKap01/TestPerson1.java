package de.slassi.testKap01;

import de.slassi.kap01.Person1;

public class TestPerson1 {

	public static void main(String[] args) {
		Person1 p1 = new Person1(20);
		System.out.println("Erste Person hat " + p1.getGeld(p1) + " " + "Euro");
		Person1 p2 = new Person1(35);
		System.out.println("Erste Person schaut in der Tasche der zweiten Person: " + p1.getGeld(p2) + " " + "Euro");

	}

}
