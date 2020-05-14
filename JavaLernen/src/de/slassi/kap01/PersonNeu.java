package de.slassi.kap01;

public class PersonNeu {
	private String name; 
	private String vorname; 
	private int alter;
	
	public PersonNeu(String name, String vorname, int alter) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}
	public void print() {
		System.out.println("Name : " + name);
		System.out.println("Vorname : " + vorname);
		System.out.println("Alter : " + alter);
	}
}
