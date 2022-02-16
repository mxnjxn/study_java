package com.naver.lecture.cho5;

public class TestMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] list= {{"필독","2022 대학별 추가합격 순위 결과! 과연 올해는?![4]","편입의 신", "2022.02.15", "404"},
							{"필독","[편입 합격기년 초대박 이벤트] 전원 5천원 증정 + 간식 대방출![37]","편입의 신", "2022.01.18", "1,497"},
							{"공지","편입 성적[3] new","광탈러", "01:30", "151"},
							{"공지","시험보면서 느꼈던 학교 캠퍼스 특징[1] new","alikj22", "11:30", "108"},
							{"공지","편입 영어 문법 핵심 노트+ 편입 수학 미적분 문제집 무료![4] new","편입의 신", "01:04", "29"}
							};  
		
		for (int i=0; i<list.length; i++) {
			for(String lists: list[i] ) {
				System.out.print(lists+ "\t");
			}
			
			System.out.println();
		}
	}

}
