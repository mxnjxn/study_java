package com.naver.lecture.cho5;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = {95,71,84,93,87};
		
		int a = 0;
		for (int score: scores) { // 배열안에 데이터가 있는 만큼 뽑는다. 
			System.out.println(a + ":score:" + score);
			System.out.println(a + "score");
			// 배열의 데이터 에 접근 하고 싶으면 index를 써야 한다. 
			
			a++;
		}
		
	//	for (int i=0; i<scores.length; i++) {
	//		System.out.println(scores[i]);
			
	}
}
