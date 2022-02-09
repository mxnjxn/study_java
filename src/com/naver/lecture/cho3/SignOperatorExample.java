package com.naver.lecture.cho3;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// + 
		// - 
		
		int x = -100;
		
		int result1= +x;
		
		int result2=-x;
		
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		short s= 100;
		// short result3 = -s; //compile error, when operating byte, short it convert into "int" type
		int result3 = -s; // int 로 형 변환. 
		System.out.println("result3: " + result3);
	}

}
