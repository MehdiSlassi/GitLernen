package com.slassi.chapter1;

import java.util.Random;

public class PhraseOmatic {

	public static void main(String[] args) {
		Random rd = new Random();
		
		String[] name = { "Adam", "Ilyas", "Mariam" };
		String[] alter = { "7", "1", "3" };
		String[] geburtsort = { "Duiburg", "Stuttgar", "Groﬂ-Zimmern" };

		int x = (int) (rd.nextFloat() * name.length);
		int y = (int) (rd.nextFloat() * name.length);
		int z = (int) (rd.nextFloat() * name.length);

		String namerandom = name[x];
		String alterrandom = alter[y];
		String geburtsortrandom = geburtsort[z];

		String phraserandom = namerandom + " " + "ist" + " " + alterrandom + " " + "und geboren in " + geburtsortrandom;

		System.out.println("random phrase: " + phraserandom);

	}

}
