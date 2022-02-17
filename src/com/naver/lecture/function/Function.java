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
	
	public static double devide (int a, int b) { //return 형이 int 면 return= 1; 놓고 시작.  // output 데이타형을 public static "____" 함수 이름 (변수, 변수) 에 넣어 준다. 
		double devide = a/b;
		return devide; 
	}
	
	// 두 문자열을 합치는 함수.
	public static String add (String a, String b) {
		String add = a + b;
		return add;
		// string 이면 return: "" 찍고 시작. 
	}
	
	//오늘 뭐 먹지 프로그램
	//배열 사용
	//함수 사용
	// 출력을 위한 함수도 별도로 제직
	
	//중식, 한식, 양식, 일식
	//output: 오늘 추천 드리는 메뉴는 ?? 입니다. 
	
	public static String[][] menu (String a,  String b) {
		String[][] menu = {{"중식", "짜장면"}, {"한식", "비빔면"}, {"일식", "라면"}, {"양식", "스테이크"}};
		return menu;
	}
	
	public static void println(String str) {
		if (str == "중식") {
				System.out.println( menu[1][1]);
		}
	}
	
	
	public static dict[:] menu ()
}
