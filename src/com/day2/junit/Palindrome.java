package com.day2.junit;
public class Palindrome {

	public static boolean checkPalindrome(int i) {
		int revint=0,rem;
		int num = 0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			revint=(revint*10)+rem;
			num=num/10;
		}
		if(temp==revint)
			return true;
		else
			return false;
		// TODO Auto-generated method stub
		
	}

}

