package com.day2.junit;
public class findCompoundInterest {

	public static double compoundInterest(double principle, double rate, int time) {
		double compoundInterest = principle * Math.pow((1+rate*0.01),time);
		return compoundInterest;
		// TODO Auto-generated method stub
	
	}

}