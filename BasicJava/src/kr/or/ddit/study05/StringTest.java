package kr.or.ddit.study05;

import java.util.Scanner;

public class StringTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringTest obj = new StringTest();
		obj.method1();
	}

	public void method1() {
		String a1 = "자바";
		String a2 = "자바";
		String a3 = "오라클";
		String a4 =  new String("오라클");
		String a5 =  new String("오라클");
	
		System.out.println(a1==a2); 
		System.out.println(a2==a3);  
		System.out.println(a3==a4); 
		System.out.println(a4==a5); 
		System.out.println(a4.equals(a5));
	}
}
