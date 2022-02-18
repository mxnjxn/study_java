package com.naver.lecture.ch06;

public class Book {
	String Company_name= "";
	int n_book = 324230;
	int total_Genre= 0;
	String Genre_name [] = {};
	
	
	
	//method
	
	//도서 추가
	public int addBook(int a) {
		int total_book = n_book + a;
		return total_book;
	}
	
	//장르 추가
	public String[] addGenreArray(String a) { 
		String Genre_name [] = {a};
		return Genre_name;
	}
	
	//책 총 개수 추가
	
	// 책 이름 조회
	
	
	
}
