package com.naver.lecture.ch06exc;

public class ThirdCar {
	//field
	
	String company= "KIA";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	ThirdCar() {
	}
	
	ThirdCar(String model){
		this(model,null, 0);
	}
	
	ThirdCar(String model, String color){
		this(model, color, 0);
	}
	
	ThirdCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
