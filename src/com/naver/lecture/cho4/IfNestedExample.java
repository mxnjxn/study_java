package com.naver.lecture.cho4;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score= 93;
		String grade = "";
		
		if(score >=90) {
			if(score >=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}
		
		System.out.println("학점은: " + grade);
	}

}
