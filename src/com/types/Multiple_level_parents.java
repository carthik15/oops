package com.types;

public class Multiple_level_parents extends Mutliple_level_grandparents {
	public void property_parents() {
		System.out.println("bike,car");
	}
public static void main(String[] args) {
	Multiple_level_parents family_properties= new Multiple_level_parents();
	family_properties.property_by_grandparents();
	family_properties.property_parents();
}
}
