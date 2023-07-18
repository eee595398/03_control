package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	/*for 문 
	 * - 끝이 정해져 있는 횟수가 지정되어 있는 반복문
	 * 
	 * 작성법
	 * for(초기식; 조건식; 증감식){
	 * 반복 수행할 코드
	 * }
	 * 
	 * -초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 *- 조건식 : for문의 반복 여부를 지정하는 식.
	 *			보통 초기식에 사용된 변수를 이용하여 조건식을 작성함
	 *
	 *- 증감식 : 초기식에 사용된 변수를 for문이 끝날때 마다 증가 또는 감소시켜
	 *			for문이 끝날때 마다 증가 또는 감소시켜 조석의 결과를 변하게하는 식
	 * 
	 * 
	 */
	
	public void ex1() {
		//for 문 기초 사용법1
		// 1~10출력하기 
		// 1부터 10까지 1싹 증가하며 출력
		//* 반복문은 조건식이 true일때만 반복한다
		
		for(int i= 1; i<=10; i++) {
			
			
		//반복수행할 코드
			System.out.println(i);
		}
		
	}
	
	public void ex3() {
			
		for(int i= 2; i<16; i++) {
			
			
			System.out.println(i);
		}
			
			
	}
	
	public void ex4() {
		//1부터 입력받은 수까지 1씩 증가하며 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		for(int i=1; i<=input; i++) {
			System.out.println(i);
		}
	}
	
}
