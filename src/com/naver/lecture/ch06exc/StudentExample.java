package com.naver.lecture.ch06exc;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 객체 생성 방법
		Student student = new Student();
		
		Student student1;
		student1 = new Student ();
//		int a;
//		int b = 1; ->
		
		// 객체는 참조형 변수라서 아래처럼 하면 알 수 없는 주소값이 보인다. 
		System.out.println("student: " + student);
		System.out.println("student: " + student1);
	}

}
