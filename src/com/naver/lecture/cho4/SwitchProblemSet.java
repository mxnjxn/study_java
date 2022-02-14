package com.naver.lecture.cho4;

public class SwitchProblemSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
		
		switch (num1) {
		
		case 1:
			num1=1;
			System.out.println("첫번째 주사위는 1번");
			break;
		case 2:
			num1=2;
			System.out.println("첫번째 주사위는  2번");
			break;
		case 3:
			num1=3;
			System.out.println("첫번째 주사위는  3번");
			break;
		case 4:
			num1=4;
			System.out.println("첫번째 주사위는 4번");
			break;
		case 5:
			num1=5;
			System.out.println("첫번째 주사위는  5번");
			break;
		default:
			num1=6;
			System.out.println("첫번째 주사위는  6번");
			break;
		}
			
		switch(num2) {
		case 1:
			num2=1;
			System.out.println("첫번째 주사위는 1번");
			break;
		case 2:
			num2=2;
			System.out.println("첫번째 주사위는  2번");
			break;
		case 3:
			num2=3;
			System.out.println("첫번째 주사위는  3번");
			break;
		case 4:
			num2=4;
			System.out.println("첫번째 주사위는 4번");
			break;
		case 5:
			num2=5;
			System.out.println("첫번째 주사위는  5번");
			break;
		default:
			System.out.println("첫번째 주사위는  6번");
			break;	
		}
		
		System.out.println("두수의 합은 " + (num1 + num2));
	}
}

