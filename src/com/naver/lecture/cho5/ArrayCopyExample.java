package com.naver.lecture.cho5;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,2,3};
		int[] arr2= new int[5];
		
		for(int i=0; i<arr2.length; i++) {// 3바뀌 돌리고 나머지 2개는 직접 넣어주기. 
			System.out.println(arr2[i]);
		}
		
		System.out.println();
		
		System.arraycopy(arr1, 1, arr2, 0, arr1.length);
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
