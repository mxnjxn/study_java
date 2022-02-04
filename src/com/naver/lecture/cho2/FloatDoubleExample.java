package com.naver.lecture.cho2;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double var1= 3.14;
		// float var2= 3.14;  // compile error 
		float var3= 3.14F; // float 는 f를 넣어주기
		
		
		// 정밀도 테스츠
		double var4= 0.1234567890123456789;
		float var5= 0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4); // double 이 더 정확성이 좋음. 
		System.out.println("var5: " + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6; // 소숫점 첫째 짜리 까지 표시됨. 
		float var8 = 3e6F;  // 소숫점 첫째 짜리 까지 표시됨. 
		double var9 = 2e-3;  // 소숫점 첫째 짜리 까지 표시됨. 
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}

}
