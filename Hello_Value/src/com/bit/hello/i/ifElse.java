package com.bit.hello.i;
  public class ifElse {
 	public static void main(String[] args) {
		boolean booValue = true ;// false
		// 10하고 1이 같냐?
		//같으면 true가 저장 다르면 false가 저장
		booValue = (10 == 1) ; //false
		
		//if는 괄호 안의 값,식, 문장이 true 인가 ,false인가
		//{} 내의 문장들을 실행할것인가, 안할 것인가 결정
		if(booValue) {
			System.out.println("10과 1은 같습니다");
		// if 괄호 안의 값,식,문장이 false이면 실행되는
		}else {
			System.out.println("10과 1은 다릅니다");
		}
		

	}

}
