package com.day2.junit;

public class IncomeTax {

	public static double checkIncomeTax(int a) {
		if(a>=0 && a<=180000)
			return(0);
		if(a>=0 && a<=180000)
			return(20000);
		else if(a>=300001 && a<=500000)
			return(80000);
		else if(a>=500001 && a<=1000000) 
			return(180000);
			return a;
	}
	

}
