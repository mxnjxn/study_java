package com.naver.lecture.function;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 함수의  사용
		
		int sum = add(3,4);
		System.out.println(sum);
		
		int sub = sub(5,2);
		System.out.println(sub);
		
		int multi = multi(33,23);
		System.out.println(multi);
		
		double devide = devide(22,4);
		System.out.println(devide);
	}
	
	//함수 선언 // 내용 밑에 선언. 
	public static int add(int a, int b) {
		int sum = a + (b+1);
		return sum;
	}
	
	// - * % / 대한 함수를 선언 우 사용하는 프로그래밍을 완성하시오
	public static int aaa (int a, int b, int c, String d, boolean e) {
		System.out.println(a);
		return 1;	
	}
	
	//빼기
	public static int sub (int a, int b) {
		int sub= a-b;
		return sub;
	}
	
	//곱하기
	public static int multi (int a, int b) {
		int multi = a*b;
		return multi;
	}
	
	public static double devide (int a, int b) {
		double devide = a/b;
		return devide; 
	}
}
