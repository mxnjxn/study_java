package com.naver.lecture.cho2;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long var1 =10;
		long var2 =20L;  // int 값을 넘어가는 순간 부터는 L 를 넣지 않은면 error 가 난다. 
		// long var3 =100000000000000000; // compile error
		long var4 =100000000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
