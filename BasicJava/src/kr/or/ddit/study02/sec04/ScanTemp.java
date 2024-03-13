package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScanTemp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScanTemp obj = new ScanTemp();
//		obj.method1();			//method1 호출
//		obj.method2();
		obj.method3();
	}

	public void method1() {
		System.out.println("메소드1");
	}

	public void method2() {
		System.out.print("문자를 입력하시오.");
		String str = sc.next();
		System.out.println("입력된 결과 값 : "+str);
	}
	
	public void method3() {
		System.out.println("정수를 입력하세요.");
		String str = sc.next();
		//입력 받은 문자열을 정수로 변환 후 10을 더해서 출력
		int result = Integer.parseInt(str)+10;
		System.out.println("출력된 결과 값 : "+result);
	}
}

