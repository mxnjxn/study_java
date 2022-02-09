package com.naver.lecture.cho3;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println(" _________________________");
		x++; // 11
		++x; //12
		System.out.println(x++); //12 --> 13
		System.out.println(x); //13
		System.out.println(++x); //14
		System.out.println("x= " + x); // x = 12
		
		System.out.println(" _________________________");
		y--;
		--y;
		System.out.println("y= " + y); // y = 8
		
		System.out.println(" _________________________");
		z = x++;
		System.out.println("z= " + z); // x = 12
		System.out.println("x= " + x); // x = 13
		
		System.out.println(" _________________________");
		z = ++x; //14
		System.out.println("z= " + z); // z = 14
		System.out.println("x= " + x); // x = 14

		System.out.println(" _________________________");
		z = ++x + y++; // 15 + 8 
		System.out.println("z= " + z); // z =23
		System.out.println("x= " + x); // x = 15
		System.out.println("y= " + y); // y = 9
		
		
	}	

}
