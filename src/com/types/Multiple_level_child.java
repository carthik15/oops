package com.types;

public class Multiple_level_child extends Multiple_level_parents {
	public void my_property() {
		System.out.println("moblies,gold chain");
	}

	public static void main(String[] args) {
		Multiple_level_child family_properties2=new Multiple_level_child();
		family_properties2.property_by_grandparents();
		family_properties2.property_parents();
		family_properties2.my_property();
	

}
}