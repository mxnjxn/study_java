package com.naver.lecture.cho4;

public class IfElseProblemSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score2= 99; 
		String grade ="";
	
		if (score2<=100 && score2>=90) {
			if (score2 >=95) {
				grade="A+";
			} else {
				grade="A";
			}
			System.out.println(grade);
		} else if (score2<90 && score2>=80) {
			if(score2>=85) {
				grade="B+";
			} else {
				grade= "B";
			}
			System.out.println(grade);
			
		} else if (score2<80 && score2>=70) {
			if (score2 >= 75) {
				grade="c+";
			} else {
				grade="c";
			}
			System.out.println(grade);
			
		}else if (score2<70 && score2>=60) {
			if (score2>=65) {
				grade="D+";
			}else {
				grade="D";
			}
			System.out.println(grade);
		
		} else {
			grade="F";
			System.out.println(grade);
		}
	}

}
