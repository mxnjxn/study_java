package com.naver.lecture.cho4;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		
		if(score> 90) {
			System.out.println("점수가 90 보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		// 블럭을 구성하지 않으면 바로 다음줄까지만 블럭내의 문장으로 이해하고 실행한다. 
		// 한중 일때는 그냥 붙여서 쓰기도 한다. if(score < 90) System.out.println()....
		if(score<90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B ");
		}
}
