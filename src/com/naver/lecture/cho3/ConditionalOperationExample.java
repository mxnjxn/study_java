package com.naver.lecture.cho3;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score= 85;
		
		char grade = (score > 90 ? 'A' : 'B');
		// char grade = (score > 90 ? 'A' : (score > 80 ? 'B' : 'C'));
		
		System.out.println("grade: " + grade); 
	}

}
