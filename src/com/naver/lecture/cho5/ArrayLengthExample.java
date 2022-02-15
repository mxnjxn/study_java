package com.naver.lecture.cho5;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {83,90,87};
		
		int sum = 0;
		
		
		System.out.println("score.length: " + score.length);
		
		for (int i=0; i<score.length; i++) { // 3을 score.length 로 씀
			sum += score [i];
		}
		
		System.out.println("총합은 : " + sum);
		
		
	}

}
