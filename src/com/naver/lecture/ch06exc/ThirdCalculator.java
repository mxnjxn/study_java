package com.naver.lecture.ch06exc;

public class ThirdCalculator {
	//override??
	// 다향성 ==> 변수의 형태도 달라도 다르게 인식
	
	public double areaRectangle (double a) {
		return a*a;
	}
	
	public double areaRectangle (double a, double b) {
		return a*b;
	}
}
