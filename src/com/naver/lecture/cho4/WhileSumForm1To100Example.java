package com.naver.lecture.cho4;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;  //초기화도 해주고 
		int sum=0;
		while(i<=10) {  //조건식은 여기에 
			sum+=i;
			i++;  // 증감식은 여기에. 
		}
		System.out.println("합은 " + sum);
			
	}

}
