package com.naver.lecture.cho4;

public class ForPrintForm1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기화식
		// 조건식
		// 증감식
		
	    //for(int i=1; i<=10; i++) { // 2,3 ... 11
			//System.out.println(i);
		//}
		
		//--------------------------------------------------------
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
			
		//-------------------------------------------------------
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			
			for(int j=1; j<=10; j++) {
				System.out.println(j);
			}
		}
	}

}
