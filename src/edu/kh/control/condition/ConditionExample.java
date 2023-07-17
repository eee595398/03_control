package edu.kh.control.condition;
import java.util.Scanner;
public class ConditionExample {
	
	
	public void ex1(){
		// if문 
		// 조건식이 true일때만 내부코드 수행
		/*
		 * 
		 * [작성법]
		 * if(조건식){
		 * 조건식이 true일때 수행 할 코드
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		//입력된 정수가 양수인지 검사
		if(input>0) {
			System.out.println("양수입니다");
		
		}
		if(input<0) {
			System.out.println("양수가 아니다");
		}
		}
	
	 public void ex2() {
		 // if - else문 
		 // 조건식결과가 ture면 if문
		 // false면 else 구문이 수행됨
		 
		 /*if(조건식 { 
		  * 조건식이 true일때 수행될 코드
		  * 
		  * }
		  * 
		  */
		Scanner sc = new Scanner(System.in);
		//홀짝입력
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
				if(input%2 !=0) {
		System.out.println("홀수 입니다 ");
					}
				else {// 짝수 또는 0입력시 수행
					// 중첩 if문
			if(input ==0) {
			System.out.println("0입니다 ");
			}else {
		System.out.println("짝수 입니다 ");
			}
					
				}
		 
	 }
	 
	 public void ex3() {
		 
		 // 양수,음수, 0 판별
		 // if - else if -else
		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수 입력 :");
		 int input = sc.nextInt();
		 if(input >0) { //input 양수
			 System.out.println("양수입니다");
		 }
		 else if(input <0) {
			 System.out.println("음수입니다");
		 }
		 else {System.out.println("0입니다");
		 
		 }
	 }

	 public void ex4() {
		// 달을 입력받아 해당 달에 맞는 계절 출력
		// 단, 온도가 -15도이하 "한파경보" 
		// -12이하 "한파 주의보" 
		 // 여름일때 온도가 35이상 "폭염경보", 33도이상 "폭염주의보"
		 // 1~12 사이가 아닐때 " 해당하는 계절이 없습니다 출력
	  Scanner sc = new Scanner(System.in);
	  System.out.println("달 입력: ");
	  int input1 = sc.nextInt();
	  if (input1<=-15) { System.out.println("한파경보");
	  }
	  else if (input1<=-12) { System.out.println("한파 주의보");
	  }
	  else if (input1>35) {System.out.println("폭염경보");
	  }
	  else if (input1>33) {System.out.println("폭염주의보");
	  }
	  else{System.out.println("해당하는 계절이 없습니다");
	  }
		 
	 }
	 
	 public void ex5() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("나이 : ");
		 int input1 = sc.nextInt();
		 if(input1<=13) {
	     System.out.println("어린이입니다."); 
		 }
		 else if(input1>19) {
		 System.out.println("성인입니다.");	 
		 }
		 else System.out.println("청소년입니다.");
	 }
	 public void ex6() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("점수 : ");
		 int input1 = sc.nextInt();
		 if(input1>=90&&input1<=100) {
	         System.out.println("A"); 
	 }
		 else if(input1<0||input1>100) {
	         System.out.println("잘못입력하셨습니다"); 
	         }
		 else if(input1>=80) {
			 System.out.println("B");	
			 }
		 else if(input1>=70) {
			 System.out.println("C");	
			 }
		 else if(input1>=60) {
			 System.out.println("D");	
			 }
		 else System.out.println("F");	
	 }
	 public void ex7() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("나이 : ");
		 int input1 = sc.nextInt();
		 System.out.println("키 : ");
		 int input2 = sc.nextInt();
		 if(input1<12&&input1>0) {
			 System.out.println("적정 연령이 아닙니다.");
		 }
		 else if(input1<0||input1>100) {
		     System.out.println("잘못 입력 하셨습니다.");
			}
		
		 else if(input2<140) {		 
			 System.out.println("적정 키가 아닙니다. ");
		 }
		
	 }
}
