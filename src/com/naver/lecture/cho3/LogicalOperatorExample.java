package com.naver.lecture.cho3;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A'; //65
		
		System.out.println("charCode: " + charCode);
		
		//&& = &: and 연산
		//|| = |: or 연산

		if ((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요.");
		}
		
		if((charCode>=97)&&(charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		if(!(charCode<48)&&!(charCode>57)) {
			System.out.println("0~9 숫자 이군요");
		}
	
		
		
		if((charCode>=65)|(charCode<=90)) { // 하나만 true여도 true, false | false 여야지 false.
			System.out.println("대문자 이군요");
		}
		if((charCode>=97)||(charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		if(!(charCode<48)|| !(charCode>57)) {
			System.out.println("0~9 이군요");
		}
		
		int value = 6;
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}
	}

}
