package com.naver.lecture.cho3;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// operator: * / - + % ....... 
		//피 연산자: 데이터 
		
		// 연산의 방향
		// <-- : right to left: 증감, 부호, 비트, 논리, 대입
		// --> : left to right: 산술, 쉬프트, 비교, 논리, 조선 (일반적방법)
		
		// 연산의 우선 순위
			// 증감 연산자 (++, --), 부호(+,-) 비트(~) 논리(|)
			// 산술 연산자(* / - +)
			// 쉬프트 연산자(>>, >>, >>>)
			// 비교 연산자 (<,>, <=, >=, instance of)
			// 비교 연산자(==, !=)
			// 논리 연산자(&)
			// 논리(^)
			// 논리(|)
			// 논리(&&)
			// 논리(||)
			//조건(?)
			// 대입 연산자(=, +=, *=, /=, %=,&=, ^=, |=, <<=, >>=, >>>=)
		
		// *********** () 로 적절히 우선 순위를 잡아서 사용하는 것이 중요 **************
		
		// 항 = 피연산자 = 데이터
		// 단항 연산자 
			//부호 연산자(+,-)
			
			//증감 연산자(++,--) *************
			
			//논리 부정 연산자(!) *************
		
			//비트반전연산자(~)
				//비트의 제일 앞자리는 부호
				//부호를 변경시켜주는 연산
		
		
		// 이항 연산자 (피 연산자가 두개) 
		//산술 연산자(+,-,*,/,%)
			// --int 보다 작은 타입들은 int로 형 변환 되어 연산이 됨.
			// -- 연산 중에 큰 타입이 있으면 작은 타입은 큰타입으로 변환되어 연산이 됨
			// -- 오버플로우 : 연산 후 산출 값이 산출 타입에 충분히 저장이 가능한지 겈토가 필요하며 이범위 를 벗어나면 가장 근사치 값 또는 쓰레기 값이 저장 되어 연산이 부정확하게 됨.  
			// 나눗셈: 몫, 나머지, 몫과 나머지 계산을 별도로 함. 
 		//문자열 연결 연산자(+) *************
		
		//비교 연산자() ****************
			//동등비교(==,!=)
			//크기 비교(<, >, <=, >=)
			//string 비교
		
		//논리 연산자(&&, ||, &, |, ^, !) ************
		
		//비트 연산자 (<<,>>, >>>)
		
		// 대입 연산자 
			//단순 대입 (=) *********
			//복합 대입 연산자(+=, -=, *=, /=, %=, ...ETC) **
		
		//삼항 연산자 (? 'when true'  : 'when false'  ) ***
		
	}

}
