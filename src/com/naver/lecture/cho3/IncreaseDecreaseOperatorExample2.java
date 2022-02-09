package com.naver.lecture.cho3;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++: 1 증감
		// --: 1 감소
		// ++x; : 피연산자를 1증가 시키고 다른 연산 수행
		// x++; :다른 연산 수행 후 피연산자 1 증가
		//**** 다른 연산자가 없으면 앞에 있나 뒤에 있나 결과는 동일 ****
		
		int x= 10;
		int y= 10;
		int a =0;
		int b= 0;
		
		++x;  // 다른 연산자가 없다. 결과는 동일
		System.out.println(x);
		
		y++;                     // x 12
		System.out.println(y);   // x 12
		
		a= ++x; 				// 12
		b= x++;					//13
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		
		
	}

}
