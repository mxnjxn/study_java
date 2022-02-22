package com.naver.lecture.ch06exc;

public class ForthCar {
	//field
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas =gas; // this(이 객체에 있는) gas(변수)에 대입해준다. 
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량: "+ gas +")");
				gas -=1;
			} else {
				System.out.println("멈춥니다. (gas 잔량:" + gas + ")");
				return;
			}
		}
	}
}
