package kr.or.ddit.study11;

import java.util.Scanner;

public class StringLang {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringLang obj = new StringLang();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
	}
	
	public void method1() {
		String test = "문자열 test 입니다.";
		
		String search = "test";
		
		if(test.contains(search)) {
			System.out.println(search+"값이 포함되어 있습니다.");
		}
	}
	
	public void method2() {
		String test = "문자열 test 입니다.";
		
		String start = "문자열";
		
		if(test.startsWith(start)) {
			System.out.println(start+"로 시작합니다.");
		}
		
		String end = "입니다.";
		
		if(test.endsWith(end)) {
			System.out.println(end+"로 끝납니다.");
		}
	}

	public void method3() {
		String test = "소문자 abcd";
		
		test = test.toUpperCase();
		System.out.println(test);
	}

	public void method4() {
		String test = "			문자열 테스트				";
		test = test.trim();
		
		System.out.println(test);
	}

	public void method5() {
		String s = "abcdbabo2024";
		s.replace("babo","***");
		System.out.println(s);
		s=s.replaceAll("\\d","");
//		s=s.replaceAll("/[0-9]/","");
		System.out.println(s);
	}

	public void method6() {
		String test = "test1, test2, test3, test4";
		String[] tokens = test.split(",");
		for(String token : tokens) {
			token = token.trim();
			System.out.println(token);
		}
	}

	public void method7() {
		while(true) {
			System.out.println("계속하시겠습니까(y/n)");
			
			String yn = sc.next();
			
			if(yn.contentEquals("n")) {
				break;
			}
			
			if(yn.equalsIgnoreCase("n")) {
				break;
			}
		}
		
	}


}
