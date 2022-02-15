package com.naver.lecture.cho5;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] score = {83,90,87,99};
		
		int [] arr1 = new int[3]; // 순서가 아니라 칸 수를 의미함. 3칸 . 0,1,2
		// int [] arr1 = new int {1,2,3}  // 데이터 넣기. 
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1 ["+i+"]:"  + arr1[i]);
		}
		//
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+ i + "]:" + arr1[i]);
		}
		
		//
		double[] arr2 = new double [3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+ i + "]:" + arr2[i]);
		}
		//
		arr2[0] = 1.0;
		arr2[1]=2.0;
		arr2[2]=3.0;
		
		for(int i= 0; i<3; i++) {
			System.out.println("arr2["+i+"]:" + arr2[i]);
			
		}
		//
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]:" + arr3[i] );
		}
		//
		arr3[0] = "장원영";
		arr3[1] = "장원영";
		arr3[2] = "장원영";
		
		for (int i=0; i<3; i++) {
			System.out.println("arr3[" +i+ "]: " + arr3[i]);
		}
		
	}

}
