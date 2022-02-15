package com.naver.lecture.cho5;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score; // 선언 * 선호
		
		int score2 []; // 선언
		
		int[] score3 = {1,2,3}; //객체 생성
		
		int score4 [] = {4,5,6}; //객체 생성
		
		double [] score6 = {1,2,3,4,5};
		
		String[] strArray = {"장원영", "전지현", "장동건", "고소영"};
		
		// 입력이 되는 데이터 타입이 동일해야 된다.
		//순서는 무조건 0 부터 시작한다. index
		// 총 갯수를 원할하게 늘릴 수 없다. 
		
		int [] score7 = {83, 90, 87, 89};
		
		System.out.println("score[0]: " + score7[0]);
		System.out.println("score[1]: " + score7[1]);
		System.out.println("score[2]: " + score7[2]);
		
		
		//총합 구하기
	//	int sum = 0;
	//	for(int i=0; i<4; i++) {
	//		sum += score7[i];
	//	}
	//	System.out.println("총합은: " + sum);
		//
		
		double avg=0;
		int sum2=0;
		for(int i=0; i<4; i++) {
			sum2 += score7[i];
		}
		avg= (double) sum2/4;  // 둘다 정수여서 정수 연산을 함.  
		System.out.println("평균은: " + avg);
		
	}

}
