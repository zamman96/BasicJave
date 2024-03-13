package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
		
	}

	public void method1() {
		int a = 10;
		switch (a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("그 외 값");
			break;
		}
		
		if(a==1) System.out.println("1");
		if(a==2) System.out.println("2");
		if(a==3) System.out.println("3");
		if(a==4) System.out.println("4");
		if(a==5) System.out.println("5");
		else System.out.println("그 외 값");
		if(true) System.out.println("1");
	}
	
	public void method2() {
		// 회원 등급 코드를 입력 받고
		// 등급을 출력하시오.
		// 1: VIP, 2:우수회원, 3:일반회원
		
		int code = sc.nextInt();
		switch (code) {
		case 1:
			System.out.println("VIP");
			break;
		case 2:
			System.out.println("우수회원");
			break;
		case 3:
			System.out.println("일반회원");
			break;
		default:
			break;
		}
	}

	public void method3() {
		// 달을 입력하고 끝자리를 출력하시오
		// 1, 3, 5, 7, 8, 10 ,12 -> 31
		// 4, 6, 9, 11 -> 30
		// 2 -> 28, 29
		
		int month = sc.nextInt();
		switch (month) {
		case 1: case 3: case 5: case 7: case 8 : case 10 : case 12 : 
			System.out.println("31");
			break;
		case 4 : case 6: case 9: case 11 :
			System.out.println("30");
			break;
		case 2 :
			System.out.println("28, 29");
			break;
		default:
			System.out.println("잘못 입력되었습니다.");
			break;
		}
	}

	public void method4() {
		//KOR, JPN, CHN 입력 시 각 국가명 (한글) 출력하기
		String nation = sc.nextLine();
		switch (nation) {
		case "KOR" :
			System.out.println("한국");
			break;
		case "JPN" :
			System.out.println("일본");
			break;
		case "CHN" :
			System.out.println("중국");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
	
	public void method5() {
		// 학점 나타내기
		// A~F
		int score = sc.nextInt();
		switch (score/10) {
		case 10 :
			System.out.println("A");
			break;
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;

			
			
		}
	


	}
	
}
