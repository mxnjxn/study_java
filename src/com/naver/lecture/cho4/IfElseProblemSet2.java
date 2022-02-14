package com.naver.lecture.cho4;

public class IfElseProblemSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x = 55;
		float y= 2000;		
		
			if (x > 1000) {
				if(y>1000) {
					System.out.println("x, y 값 모두 1000을 넘었습니다. x,y 에 허용되는 최대 값은 1000입니다.바르게 입력해주세요.");
					System.out.println("좌표는 " + "(" + x + "," + y + ")");
				}
				
				else if(y<-1000) {
					System.out.println("x값이 최대 허용범위를 넘고 y 값이 최소 허용범위를 넘었습니다.바르게 입력해주세요.");
					System.out.println("좌표는 " + "(" + x + "," + y + ")");
				}
				
				else {
					if(y==0) {
						System.out.println("좌표가 양의 x 축 위에 있습니다. 허용 범위 밖");
					}
					System.out.println("x값이 허용되는 최대 값을 넘었습니다. y값은 허용 범위내에 있습니다. 바르게 입력해주세요.");
					System.out.println("좌표는 " + "(" + x + "," + y + ")");
					
					else { // y>=-1000 && y<=1000
						if(y>0 && y<=1000) {
							System.out.println("");
							
						}
					}
				}
			}
			
			else if (x<-1000) {
				if(y>1000) {
					System.out.println("x, y 값 모두 1000을 넘었습니다. x,y 에 허용되는 최대 값은 1000입니다.바르게 입력해주세요.");
					System.out.println("좌표는 " + "(" + x + "," + y + ")");
				}
				
				else if(y<-1000) {
					System.out.println("x값이 최대 허용범위를 넘고 y 값이 최소 허용범위를 넘었습니다.바르게 입력해주세요.");
					System.out.println("좌표는 " + "(" + x + "," + y + ")");
				}
				
				else {
					if(y==0) {
						System.out.println("좌표가 음의 x 축 위에 있습니다. 허용범위 밖");
						System.out.println("좌표는 " + "(" + x + "," + y + ")");
					}
					System.out.println("x값이 허용되는 최솟 값을 넘었습니다. y값은 허용 범위내에 있습니다. 바르게 입력해주세요.");
				}
			}
			
			else {
				if(x==0) {
					if(y<=1000 && y>=-1000) {
						if(y==0) {
							System.out.println("원점입니다.");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
						else if(y<=1000 && y>0) {
							System.out.println("양의 y축에 있습니다. y축 허용 범위 안");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
						else {
							System.out.println("음의 y축에 있습니다. y축 허용 범위 안");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
					}
					
					else {
						if(y<-1000){
							System.out.println("좌표가 음의 y 축 위에 있습니다. 허용하는 최소 y값을 넘었습니다.");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
						else {
							System.out.println("좌표가 음의 y 축 위에 있습니다. 허용하는 최대 y값을 넘었습니다.");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
					}
				}
			
				else {
					if (x>0 && x<=1000) {
						if(y>1000) {
							// System.out.println("1사분면");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
							
						}
		
						else if (y<-1000) {
							// System.out.println("3사분면");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
						
						else {
							if ()
							System.out.println("양의 x축 위에 있다. x값 허용범위 안.");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
							
							
						}
					}
					else  {
						if(y>0 && y<=1000) {
							System.out.println("2사분면");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
						
						else if(y<0 && y>=-1000) {
							System.out.println("4사분면");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
						
						else {
							System.out.println("음의 x축 위에 있다. x값 허용범위 안.");
							System.out.println("좌표는 " + "(" + x + "," + y + ")");
						}
						
					}
				}
			}
		}
	}

