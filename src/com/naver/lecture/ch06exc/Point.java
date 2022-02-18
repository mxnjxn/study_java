package com.naver.lecture.ch06exc;

import java.util.Date;

public class Point {
	//field
	String coupon_name = "";
	int bundle_coupon = 4;
	int n_coupon = 0;
	Date date_coupon;
	Date date_coupoun_exp;
	
	//method
	
	// 사용가능 쿠폰 수 조회
	public int useable_coupon(int a) {
		int useable_coupon = n_coupon/ bundle_coupon ;
		return useable_coupon;
	}
	
	//쿠폰 사용기간 조회
	public String remainday (String a, String b) {
		String remain = a+ "~"+ b;
		return remain;
	}
	
	//포인트 충전
	public int addPoint (int a) {
		int finalPoint= 0;
		return finalPoint+a;
	}
	
	
	//포인트 사용
	
	
	
	//포인트 확인
}
