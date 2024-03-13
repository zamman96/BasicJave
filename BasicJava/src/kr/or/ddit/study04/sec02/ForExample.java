package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
//		obj.method8();
		obj.method9();
	}
	
	public void method1() {
		// 1~ 5까지의 합을 구하시오.
		int n = 5;
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 합 : "+sum);
	}

	public void method2() {
		// 5~10까지 숫자를 출력하시오
		for(int i=5; i<=10; i++) {
			System.out.println(i);
		}
	}

	public void method3() {
		// 1~20까지 숫자를 더한 결과를 출력하시오
		int sum = 0;
		for(int i=1; i<=20; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void method4() {
		// 1~20까지 짝수만 더한 결과를 출력하시오
		int sum=0;
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	public void method5() {
		// 1~20 홀수의 합
		int sum = 0;
		
		// if문 활용
//		for(int i=1;i<=20;i++) {
//			if(i%2!=0) {
//				sum+=i;
//			}
		
		// 증감식 활용
		for(int i=1;i<=20;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}

	public void method6() {
		// 스캐너로 입력받은 숫자만큼 출력하기
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("출력.");
		}
	}
	
	public void method7() {
		// a ~ z 까지 출력하기
		char result = 'a';
		int eng = 'z'-'a';
		//풀이 1
		for(int i=0; i<=eng;i++) {
			System.out.println(result);
			result++;
		}
		//풀이 2
		for (char i='a';i<='z';i++) {
			System.out.println(i);
		}
		
		//풀이3
		for (int i= 'a'; i<='z';i++) {
			char ch = (char)(i);
			System.out.println(ch);
		}
	}

	public void method8() {
		// 입력받은 소문자 부터 ~ z 까지 출력
		System.out.println("소문자를 입력하시오.");
		char a = sc.nextLine().charAt(0);
		
		for (int i = 0; i <= 'z' - a; i++) {
			char b = (char) (i + a);
			System.out.println(b);
		}

//		for(; a<='z'; a++){
//		System.out.println(a);
//		}
	}

	public void method9() {
		//입력받은 소문자를 ~z까지 대문자로 변환
		System.out.println("소문자를 입력하시오.");
		char ch = (char)(sc.next().charAt(0)-32);
		for(; ch<='Z'; ch++) {
		System.out.println(ch);
		}
	}
	
}
