package com.naver.lecture.cho2;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 128;
		
		System.out.println("Byte.MIN_VAlUE: " + Byte.MIN_VALUE); // 상수
		System.out.println("Byte.MAX_VAlUE: " + Byte.MAX_VALUE); // 상수
		System.out.println("Short.MIN_VAlUE: " + Short.MIN_VALUE); // 상수
		System.out.println("Short.MAX_VAlUE: " + Short.MAX_VALUE); // 상수
		System.out.println("Integer.MIN_VAlUE: " + Integer.MIN_VALUE); // 상수
		System.out.println("Integer.MAX_VAlUE: " + Integer.MAX_VALUE); // 상수
		System.out.println("Float.MIN_VAlUE: " + Float.MIN_VALUE); // 상수
		System.out.println("Float.MAX_VAlUE: " + Float.MAX_VALUE); // 상수
		System.out.println("Double.MIN_VAlUE: " + Double.MIN_VALUE); // 상수
		System.out.println("Double.MAX_VAlUE: " + Double.MAX_VALUE); // 상수
		
		
		
		
		if ((i < Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요");
		}
		else {
			byte b= (byte) i;
			System.out.println(b);
			System.out.println("정상적으로 캐스팅 되었습니다.");
		}
	}

}
