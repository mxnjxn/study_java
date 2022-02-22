package com.naver.lecture.ch06exc;

public class Calculator {
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	public double devide(int x,int y) {
		double result = (double)x/ (double)y;
		return result;
	}
	
	public void powerOff() {
		System.out.print("전원을 큽니다. ");
	}
}
