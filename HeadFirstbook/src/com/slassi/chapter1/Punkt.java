package com.slassi.chapter1;

public class Punkt {
	private int x;
	private int y;
	private static int punktanzahl = 0;

	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
		punktanzahl++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int getPunktanzahl() {

		return punktanzahl;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void print() {
		System.out.println("Die Werte von x und y sind:" + x + "; " + y);
	}

	public void printpunktzahl() {
		System.out.println("Die anzahl der Punkte:" + Punkt.getPunktanzahl());

	}

}
