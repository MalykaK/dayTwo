package com.day2.junit;

public class ArmstrongNumber {

	public static boolean checkArmstrongNumber(int number) {
		int originalNumber = number;
		int sum=0,digit;
		while(number!=0)
			
		{
			digit=number%10;
			sum=sum+digit*digit*digit;
			number=number/10;
		}
		if(originalNumber==sum)
		return true;
		else
			return false;
	}

}
