package com.naver.lecture.cho2;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 작은 놈이 큰놈으로 변환은 문제가 발생하지 않는다. 
		// 큰 형이 작은 형으로 변환이 되려면 문제가 생긴다. 
		
		//byte < short < int < long
		// float < double
		// 형 변환 방법: (바꿀려고 한 형) 변수 이름= 바꾸기전 변수 이름  // 자동으로 됨. 
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		int intValue = byteValue; // int 로 형 변환
		System.out.println("byteValue: " + intValue);
		
		char charValue = '가'; 
		System.out.println("byteValue: " + charValue);
		
		intValue = charValue;  //유니코드로 변환
		System.out.println("가의 유니코드= " + intValue);
		
		intValue = 500; 
		long longValue = intValue; // long 으로 형 변환
		System.out.println("long value: "+ longValue);
		
		intValue = 200; 
		float floatValue = intValue; // float로 형 변환
		System.out.println("floatValue: " + floatValue);
		
		intValue = 200;  
		double doubleValue = intValue; // double로 형 변환
		System.out.println("floatValue: " + doubleValue);
	}

}
