package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();

	}


	public void method1() {
		// 영어에 포함된 모음의 수를 구하시오.
		System.out.println("소문자만 입력해주세요.");
		String s = sc.next();
		int cnt = 0;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				cnt++;
			}
		}
		System.out.println("모음의 갯수 : "+cnt+"개");
	}	

	public void method2() {
		//구구단 출력
		for(int i=2; i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
//				System.out.println(i + " * "+ j + " = "+ (i*j));
				System.out.printf("%d*%d=%d\t",i,j,i*j);
				//%s : 문자열 / %f : 실수 / %d : 정수
			}
			System.out.println();
		}
	}

	public void method3() {
		//홀수의 합을 구하시오
		int result = 0;
//		for(int i=1; i<=10; i+=2) {
//			result+=i;
//		}
		for(int i=1; i<=10; i++) {
			if (i%2==0) continue; //짝수일때 다시 루프로 돌아간다
			result+=i;
		}
		System.out.println(result);
	}
	
	public void method4() {
		int num = sc.nextInt();
		LOOP1 : for(int i=0; i<100000; i++) {
			LOOP2 : for(int j=0; j<10000; j++) {
			if(num==j) break LOOP1;
			System.out.println(j);
			}
		}
	}
	
	public void method5() {

	}
	
}