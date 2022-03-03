package com.types;

public class Hierarchical_my extends   Hierarchical_my_parents{
	public void my_name() {
		System.out.println("karthik");
	}
	public static void main(String[] args) {
		Hierarchical_my family= new Hierarchical_my();
		family.names();
		family.my_name();
	}

}
