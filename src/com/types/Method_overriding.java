package com.types;

public class Method_overriding extends Polymorphism_method_overriding {
	@Override
	public void cricket_career(String Virat_kholi_career) {
		// TODO Auto-generated method stub
		super.cricket_career(Virat_kholi_career);
	}
	@Override
	public void Matches(int a) {
		// TODO Auto-generated method stub
		super.Matches(a);
	}
	@Override
	public void Runs(double a) {
		// TODO Auto-generated method stub
		super.Runs(a);
	}
	@Override
	public void Batting_Avg(float a) {
		// TODO Auto-generated method stub
		super.Batting_Avg(a);
	}
	@Override
	public void Hundreds(int c) {
		// TODO Auto-generated method stub
		super.Hundreds(c);
	}
	@Override
	public void ICC_Rank(int b) {
		// TODO Auto-generated method stub
		super.ICC_Rank(b);
	}
	public static void main(String[] args) {
		Method_overriding Virat= new Method_overriding();
		Virat.cricket_career("Virat_kohli_ODI_career");
		Virat.Matches(254);
		Virat.Runs(12169);
		Virat.Batting_Avg(59.07f);
		Virat.Hundreds(43);
		Virat.ICC_Rank(2);
	}

}
