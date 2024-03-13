package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork03 obj = new HomeWork03();
		obj.question1();
		obj.question2();
	}

	public void question2(){
		// 윤년인지 구하기
		// 4의 배수이면서 100의 배수가 아닌것
		// 혹은 400의 배수인것
		
		// ex) 윤년 : 1992 1996 2000 2004
		//	       평년 : 1800 1900 1993 1994 1995
		System.out.println("년도 입력");
		int year = sc.nextInt();
		
		// check 1992, 1993, 1600, 1700
		if(((year%4==0) && (year%100!=0)) || (year%400==0) ) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}

		//boolean four = year%4==0;
		//boolean hund = year%100==0;
		//boolean fhund = year%400==0;
		//if ( (four && !hund) || fhund )	
	}
	
	
	public void question1(){
		// 변수에 랜덤한 숫자 1~50 숫자가 들어있다.
		// if문 조건식을 완성하여 해당 숫자를 맞추는
		// 프로그램을 완성하시오.
		
		// 1번 시행시 cnt값이 1 증가 되어야함.
		Random random = new Random();
		int question = random.nextInt(50)+1;
		int cnt = 0;
		while(true) {
			System.out.println("정수를 입력하세요");
			cnt++;
			int ans = sc.nextInt();
			if(question < ans) {
				System.out.println("더 작은 수를 입력하세요");
			} if(question > ans) {
				System.out.println("더 큰 수를 입력하세요");
			} if(question == ans) {
				System.out.println("정답입니다");
				System.out.println(cnt+"회 시행되었습니다.");
				break;
			}
		}
	}
	 
}
