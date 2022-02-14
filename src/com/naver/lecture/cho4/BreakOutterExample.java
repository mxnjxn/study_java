package com.naver.lecture.cho4;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outter: 
			for(char upper= 'A'; upper<='Z'; upper++) {
			for(char lower= 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter; // 상위의 루프를 벗어나고 싶을떼 루프에 이름 지정하고 break 이름 하기. 
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
