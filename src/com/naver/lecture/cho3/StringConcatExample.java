package com.naver.lecture.cho3;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK 1.8";  // "JDK" + 1.8 
		String str2 = str1 + "입니다";
		
		System.out.println("str2: " + str2);
		
		String strA = "이름";
		String strB = "최민준";
		String strC = "전화번호";
		String strD=  "010-2817-5791";
		
		System.out.println(strA+ ":" + strB);
		System.out.println(strC +":"  + strD);
	}

}
