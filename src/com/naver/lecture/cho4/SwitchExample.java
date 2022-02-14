package com.naver.lecture.cho4;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int num = 2;
		// Math. random () : 0.0 ~ 1.0 에 가까운 double 형 값 보내줌. 
		// int num = Math.random() * (max - min+1) + min;
		
		//double num=Math.random();
		// System.out.println(num);
		
		int num = (int)(Math.random()* (6 - 1 + 1) + 1); 
		
		switch (num) {
		
			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			case 3:
				System.out.println("2번");
				break;
			case 4:
				System.out.println("2번");
				break;
			case 5:
				System.out.println("2번");
				break;
			case 6:
				System.out.println("2번");
				break;
			default:
				System.out.println("0");
				break;
		}
	}

}
