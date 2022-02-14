package com.naver.lecture.cho4;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q")); //조건 판단. // equal 
		
		System.out.println();
		System.out.println("프로그램 종료");
	
		
	}

}
