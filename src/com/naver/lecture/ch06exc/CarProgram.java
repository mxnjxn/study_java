package com.naver.lecture.ch06exc;

public class CarProgram { // 실제 프로그램 돌리는 class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		Car car = new Car(); // car라는 객체 |car라는 함수 를 실행 시키겠다.  // 객체 생성 new연사자를 씀. 
		
		Car car2;  // 선언
		car2 = new Car(); //생성
		
		//객체접근 연산자
		//car.company;
		
		System.out.println("car.compay: " + car.company);
		
		car.c = car.a + car.b;
		System.out.println("car.c: " + car.c);
		
		car.c = car.speedUp(10);
		System.out.println("car.c: " + car.c);
		  
		
		
	}

}
