package com.naver.lecture.cho5;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,2,3};
		int[] arr2= new int[5];
		
		for(int i=0; i<arr1.length; i++) {// 3바뀌 돌리고 나머지 2개는 직접 넣어주기. 
			arr2[i] = arr1[i];
		}
		
		arr2[3] = 4;
		arr2[4] = 5;
		
		
		/////////////////////////////////////////
		for(int i = 0; i< arr2.length; i++) {  //5 바퀴 돌리게 됨. // 3바퀴 넘어가면 arr1이 4,5 번째 할장하는 값이 없어서 error 남. 
			arr2[i] = arr1[i];
			System.out.println(arr2[i]);
		}
	}	

}
