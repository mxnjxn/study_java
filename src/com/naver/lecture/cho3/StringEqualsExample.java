package com.naver.lecture.cho3;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// literal 값이 같으면 java는 같은 주소 값을 씀
		
		String str1= "장원영";
		String str2= "장원영";
		String str3= new String("장원영"); // -> 새로운 메모리 자리 차지  //새로운 변수 선언이라고 보면 됨. 
		
		boolean result1 = (str1 == str2);
		System.out.println("result1= " + result1); // true
		
		boolean result2 = (str1 == str2);
		System.out.println("result2= " + result2); // false
		
		System.out.println("str1.equal(str2): " + str1.equals(str2)); // ==(x) true
		System.out.println("str1.equal(str3): " + str1.equals(str3)); // ==(x) true // 주소값이 아니라 문자열 자체를 비교함. 
		
		
		
		
		
		
	}

}
