package com.naver.lecture.cho2;

public class Variable {

	public static void main(String[] args) {
		// 변수 명명 법
		// 첫글자 소문자, 다음 문자열 부터는 대문자
		// 모든 변수명은 띄어쓰기 없이 붙여서
		
		
		int roomNumber = 1; // 두 변수는 서로 다름 변수임 
		// 대소문자 구분함
		int roomnumber =2;
		
		//변수, 선언, 대입, 연산
		
		int a; //declaration
		a=1; // assigning
		int b=1;
		int c=0;
		c = a + b;
		
		// 변수를 초기화 하는 습관을 들이자. 
		// 정수는 0;
		// 실수형은 0.0;
		//문자형은 '' 또는 ""
		
		boolean defaultNy = false;
		
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		
		float ee = 0.0f; // float는 뒤애 f 가 붙어야 한다 
		double ff = 0.0;
		
		char gg = ' '; // char는 공으로 
		String hh =""; 
		
		
		String fullName= "Minjun Choi";
		String name= "Minjun";
		
		System.out.println("roomNumber:"+ roomNumber);
		System.out.println("roomnumber:" + roomnumber);
		
		System.out.println("Full name is " + fullName);
		System.out.println("First name is " + name);
		
		// 변수 사용 (변수 값 저장 & 변수값 읽음)
		
		// 리터럴 = 데이터이다
		// ex) 정수형 리터럴 = 정수형 데이터
		
		//이스케이프 문자
		System.out.println(c);
		System.out.println("Tony Choi");
		System.out.println("Tony Choi : " + c + " coldhearted!");
		//한 칸 들여쓰기
		System.out.println("한 칸 들여쓰기");
		System.out.println("\t 한 칸 들여쓰기");
		
		System.out.println("한 중 띄기"); // println 이 기본적으로 한 줄 띄기를 함. 
		System.out.println("\n 한 중 띄기");
		
		System.out.println("한 중 띄기2");
		System.out.println("\r 한 중 띄기");
		
		System.out.println(" \' 나는 생각한다 \' ");
		System.out.println(" 소크라테스가 말했다 \"나는 존재한다.\"");
		System.out.println(" \\ ");
		
		
		//변수의 범위
		//변수는 선언된 블럭 내에서만 사용 가능하다. 
		if(a==1) {
			int aaa= 10;
			int bbb= aaa+a;
		 System.out.println("bbb: "+ bbb);
			
		} else {
			// System.out.println("bbb:" + bbb); //error
		}
	}

}
