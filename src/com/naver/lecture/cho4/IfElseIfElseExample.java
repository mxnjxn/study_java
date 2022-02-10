package com.naver.lecture.cho4;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 100~90 사이 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80){
			System.out.println("점수가 89~80 사이 입니다.");
			System.out.println("등급은 B 입니다.");
		} else {
			System.out.println("점수가 80 미만 입니다.");
			System.out.println("등급은 C 입니다.");
		}
		System.out.println("******************");
		int score2= 89; 
		String grade ="";
	
		if (score2<=100 && score>=90) {
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

		System.out.println("**************");
	    int a= 35;
		int b= 45;
		
		if (a>b) {
			System.out.println(">");
		}else if (a<b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}

	}
}
	