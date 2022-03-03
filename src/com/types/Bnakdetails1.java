package com.types;

public class Bnakdetails1 extends Abstract_bankaccount_details {
	@Override
	public void Bank_Names() {
		System.out.println("Kotak Mahindra Bank");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Account_Holder_Name() {
		System.out.println("Karthik");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Account_Number() {
		System.out.println("12548756");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Branch() {
		System.out.println("West saidapet");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ISFC_Code() {
		System.out.println("KMB0B1874");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Phone_Number() {
		System.out.println("9677527091");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Bnakdetails1 customer=new Bnakdetails1();
		customer.Bank_Names();
		customer.Account_Holder_Name();
		customer.Account_Number();
		customer.Branch();
		customer.ISFC_Code();
		customer.Phone_Number();
	}
	 

}
