package com.naver.lecture.cho5;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVar1= "최민준";
		String strVar2= "최민준";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1 과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음.");
		}
		
		String strVar3= "최민준";
		String strVar4= "최민준";
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3 과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3 과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음.");
		}
		
		
		
	}

}
