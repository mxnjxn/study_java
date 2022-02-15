package com.naver.lecture.cho5;

public class Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 부터 9 까지 정수형 배열 변수 2개를 만들고
		//for 문을 사용하여 구구단 출력을 하세요.
		
		int [] f_num= new int [8];
		
		for (int i=0; i<f_num.length; i++) {
			f_num[i]= i+1;
			int [] b_num= new int[8];
			for(int j=0; j<b_num.length; j++) {
				b_num[j]=j+1;
				int multi= f_num[i]*b_num[j];
				System.out.println(f_num[i] + "X" + b_num[j] + "=" + multi);
			}
		}
	}
}
