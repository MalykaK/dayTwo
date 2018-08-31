package com.day2.junit;

public class SubjectMarks {

	public static String findGrade(int maths, int science, int chemistry) {
		if(maths>60 && science>60 && chemistry>60)
			return ("Passed");
			else if((maths>60&&science>60)||(science>60&&chemistry>60)||(chemistry>60&&maths>60))
		 return ("Promoted");
			else 
				return ("Fail");
		// TODO Auto-generated method stub
	}

}
