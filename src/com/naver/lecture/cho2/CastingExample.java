package com.naver.lecture.cho2;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte < short < int < long
		// float < double
		
		// 큰 형에서 작은 형으로 역행 할때.
		//  강제 형 변환 : casting : (원하는 형) 변수명 
		int intValue = 44032;
		System.out.println("intValue: " + intValue);
		
		char charValue = (char)intValue;
		System.out.println(charValue); 
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
