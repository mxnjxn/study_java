package com.naver.lecture.cho4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2; i<10; i++) {
			
			for(int j=1; j<10; j++) {
				int result = i*j; 
				System.out.println(i + "X" + j + "=" + result ); 
			
			}
			if( result % 2==0) {
				int addEven=0;
				addEven =+ result;
				System.out.println("짝수의 합은"+ addEven);
			}
			
			else {
				int addOdd=0;
				addOdd =+ result;
				System.out.println("홀 수의 합은 " + addOdd);
			}
			
		}
	}

}
