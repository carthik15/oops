package com.types;

public class Polymorphism_method_overloading {
	public void  RTPCR_TEST(String name, String sex, String specimentype) {
		System.out.println("patient name:" + name);
		System.out.println("sex :" + sex);
		System.out.println("specimrtype :"+ specimentype);
		}
	public void  RTPCR_TEST(int a) {
		System.out.println("Report Id :" + "MMC"+a);
		
	}
	public void  RTPCR_TEST(float a) {
		System.out.println("AGE :"+ a);
		
	}
	public void  RTPCR_TEST(String Result) {
		System.out.println("2019-nCov" + Result);
	}
	public static void main(String[] args) {
		Polymorphism_method_overloading test_result =new Polymorphism_method_overloading();
		test_result.RTPCR_TEST("Karthik", "Male", "NP SWAB");
		test_result.RTPCR_TEST(1541488);
		test_result.RTPCR_TEST(24);
		test_result.RTPCR_TEST("NEGATIVE");
		
	}
	

}
