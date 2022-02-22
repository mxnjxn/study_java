package com.naver.lecture.ch06exc;

public class FifthCar {
	//필드
	int speed; //50
	
	//생성자
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 올립니다.");
	}
	
	void run() {
		for(int i = 10; i<=50 ; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}
