package com.naver.lecture.cho4;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			if(i%2 != 0) { // 짝수가 아니라면, 홀 수라면. 
				continue;  // 혼자 쓰이기 어렵다. 무조ㅈ건 if 랑 같이 쓰인다. 
			}
			System.out.println(i);
		} 
	}

}
