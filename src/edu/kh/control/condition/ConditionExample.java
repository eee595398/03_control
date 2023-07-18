package edu.kh.control.condition;
import java.util.Scanner;
public class ConditionExample {
	 Scanner sc = new Scanner(System.in);
	
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
		
		 System.out.println("정수 입력 :");
		 int input = sc.nextInt();
		 if(input >0) { //input 양수
			 System.out.println("양수입니다");
		 }
		 else if(input <0) {
			 System.out.println("음수입니다");
		 }
		 else { System.out.println("0입니다");
		 
		 }
	 }

	 public void ex4() {
		// 달을 입력받아 해당 달에 맞는 계절 출력
		// 단, 온도가 -15도이하 "한파경보" 
		// -12이하 "한파 주의보" 
		 // 여름일때 온도가 35이상 "폭염경보", 33도이상 "폭염주의보"
		 // 1~12 사이가 아닐때 " 해당하는 계절이 없습니다 출력

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
	
		 System.out.println("점수 : ");
		 int input1 = sc.nextInt();
		 String result;
		 if(input1>=90&&input1<=100) {
			 result ="A"; 
	 }
		 else if(input1<0||input1>100) {
			 result = "잘못입력하셨습니다"; 
	         }
		 else if(input1>=80) {
			 result ="B";	
			 }
		 else if(input1>=70) {
			 result ="C";	
			 }
		 else if(input1>=60) {
			 result ="D";	
			 }
		 else result = "F";	
		 System.out.println(result);
	 }
	 public void ex7() {
		
		 System.out.println("나이 : ");
//		 int input1 = sc.nextInt();
//		 String result;
//		 if(input1<0||input1>100) {
//		     result = "잘못 입력 하셨습니다.";
//			}
//		 else { System.out.println("키 입력 : ");
//		 		double height = sc.nextDouble();
//		 if (age<12) {
//			 result = "적정 연령이 아닙니다.";
//		 }
//		 }
//		
//		 else if(height<140) {		 
//			 result = "적정 키가 아닙니다.";
//		 }
//		 else {
//			 result = "탑승 가능";
//		 }
//		
	 }
	 public void ex8() {
//		 System.out.println("나이 : ");	
//		 int age = sc.nextInt();
//		 String result;
//		 if(input1<0||input1>100) {
//		     result = "나이를 잘못 입력 하셨습니다.";
//			}
//		 else { System.out.println("키 입력 : ");
//	 		double height = sc.nextDouble();
//		 if(height<0 || height >250) {
//			 result = "키를 잘못 입력 하셨습니다.";
//			 
//		 }else {
//			 if(age<12&&height>=140.0) {
//				 result = "키는 적절하나, 나이가 적절치 않음.";
//			 }
//			 else if(age>=12&&height<140.0) {
//				 result = "나이는 적절하나, 키가 적절치 않음.";
//			 }
//			 else if(age<12&&height<140.0) {
//				 result = "나이 키 모두적절치 않음.";
//			 }
//			 else {
//				 result = "탑승가능";
//			 }
//			 System.out.println(result);	
//		 } 
//		 
//		 
		 
	 
		
	 }
 }
