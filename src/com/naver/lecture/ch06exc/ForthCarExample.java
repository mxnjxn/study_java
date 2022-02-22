package com.naver.lecture.ch06exc;

public class ForthCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForthCar fourthCar = new ForthCar();
		
		fourthCar.setGas(3); //Car의 setGas() 메소드 호출
		
		boolean gasState = fourthCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다. ");
			fourthCar.run(); //Car의 run()메소드 출력
		}
		
		if(fourthCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
