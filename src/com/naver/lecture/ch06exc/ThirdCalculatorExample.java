package com.naver.lecture.ch06exc;

public class ThirdCalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThirdCalculator thirdCalculator = new ThirdCalculator();
		
		double result1 = thirdCalculator.areaRectangle(10); //정사각형
		
		double result2 = thirdCalculator.areaRectangle(10,20); // 직사각형
		
		System.out.println("정사각형의 넓이: "+ result1);
		System.out.println("직사각형의 넓이: "+ result2);
	}

}
