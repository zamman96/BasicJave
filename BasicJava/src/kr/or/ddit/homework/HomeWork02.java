package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		obj.method1();
		obj.mehtod2();
		obj.mehtod3();
		obj.mehtod4();
		obj.mehtod5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 버림  
		 *  ex ) 12.23123 - > 12.23
		 */
		System.out.println("실수 를 입력해주세요.");
		String str = sc.nextLine();
		
		double d1 = Double.parseDouble(str)*100;
		double result1 = (int)(d1)/100.0;
		System.out.println(result1);
		
	}
	
	public void mehtod2() {
		/*
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 
		 *  ex) A-> a  
		 */
		System.out.println("대문자를 입력 해주세요.");
		String str2 = sc.nextLine();
		
		char i1 = str2.charAt(0);
		char result2 = (char)(i1+32);
		//char result2 = (char)(str2.charAt(0)+32);
		//int add = 'a' - 'A';			//32대신 대입
		System.out.println(result2);
		
		
	}
	public void mehtod3() {
		/*
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 
		 *  ex) f-> F  
		 */
		System.out.println("소문자를 입력 해주세요.");
		String str3 = sc.nextLine();
	
		char i2 = str3.charAt(0);
		char result3 = (char)((int)i2-32);
		//char result3 = (char)(str3.charAt(0)-32);
		System.out.println(result3);		
	
	}
	
	
	public void mehtod4() {
		/*
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
		 *  ex) 123 -> 1+2+3
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String str4 = sc.nextLine();
		
		char num1 = str4.charAt(0);
		int num01 = Integer.parseInt(""+num1);
		char num2 = str4.charAt(1);
		int num02 = Integer.parseInt(""+num2);
		char num3 = str4.charAt(2);
		int num03 = Integer.parseInt(""+num3);
		int result4 = num01+num02+num03;
		//int num1 = str4.charAt(0)-'0';
		//int num2 = str4.charAt(0)-'0';
		//int num3 = str4.charAt(0)-'0';
		//int result4 = num1 + num2 + num3;
		
		/*풀이 2
		int num = Integer.parseInt(s);
		int num1 = num/100;
		int num2 = num/10 - num1*10;
		int num3 = num -num2*10 -num1*100;
		int result4 = num1+num2+num3;
		*/
		
		System.out.println(result4);

				
		
	}
	
	public void mehtod5() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 반올림  
		 *  ex ) 12.2623 - > 12.3
		 */
		System.out.println("실수를 입력해주세요.");
		String str5= sc.nextLine();
		
		double d2 = Double.parseDouble(str5)*10.0;
		int rou = (int)(2.0*(d2 - (int)(d2)));
		int i3 = (int)d2+ rou;
		double result5 = (i3/10.0) ;
		System.out.println(result5);
	
		/*	더하는 방법으로 계산하기
		 * double d2 = Double.parseDouble(str5);
		 * d2=d2+0.05;
		 * int result5 = ((int)(d2*10))/10.0;
		 */
		
	}
	
	
}
