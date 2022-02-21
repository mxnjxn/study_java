package com.naver.lecture.ch06exc;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 car1 = new Car1();
		
		// 객체 접근 연산자(.)를 사용하며 car 객체 변수 값을 참조
		System.out.println("company: " + car1.company);
		System.out.println("model: " + car1.model);
		System.out.println("color: " + car1.color);
		System.out.println("maxSpeed: " + car1.maxSpeed);
		System.out.println("speed: " + car1.speed);
		
		car1.speed = 100; 
		System.out.println("speed: " + car1.speed); //100
		
		
		
		
		
		// speed 가 maxspeed보다 속도사 높은지 낮은지 출력해주는 함수를 만들어서 출력하세요	
		limit(car1.speed,car1.maxSpeed);
		
	}
	public static void limit(int speed, int maxSpeed) {		
		if (speed> maxSpeed) {
			System.out.println("속도가 최대 속도를 넘었습니다. 감속 해주세요.");
		} else if (speed<maxSpeed){
			System.out.println("속도가 최대 속도보다 낮습니다. ");			
		}
		else {
			System.out.println("속도가 최대 속도와 비슷합니다. ");
		}
	}
}
