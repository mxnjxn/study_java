package com.naver.lecture.ch06exc;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator Calculator = new Calculator();
		
		Calculator.powerOn();
		
		int result1 = Calculator.plus(5,6);
		System.out.println("result: " + result1);
		
		byte x= 10;
		byte y= 4;
		double result2 = Calculator.devide(x,y);
		System.out.println("result2: " + result2);
		
		Calculator.powerOff();
	}

}
