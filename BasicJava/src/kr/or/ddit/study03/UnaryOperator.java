package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		// 단항 연산자
		// 부호연산자, 증감연산자, 논리연산자 (!)
//		obj.method1();
		obj.method2();
	}
	
	// 부호연산자
	public void method1() {
		int a = 10;
		int num = -a;
		System.out.println(num);
	}

	// 증감연산자
	public void method2() {
		// ++변수 : 다른 연산을 수행하기 전에 1을 증가 시킴
		// 변수++ : 다른 연산을 수행한 후에 1을 증가 시킴
		// --변수 : 다른 연산을 수행하기 전에 1을 감소 시킴
		// 변수-- : 다른 연산을 수행한 후에 1을 증가 시킴
		
		int val;
		int res;
		
		val =10;
		res = ++val;
		//val+=1;							// val = val +1
		//res = val;
		System.out.println("val : "+val);	// val = 11
		System.out.println("res : "+res);	// res = 10+1 (더해진 후에 대입)
		val =10;
		res = val++;
		//res = val;
		//val+=1;
		System.out.println("val : "+val);	// val = 11
		System.out.println("res : "+res);	// res = 10 (대입한 후에 더해짐)
		
		val =10;
		res = --val;
		//val-=1;							// val = val -1
		//res = val;
		System.out.println("val : "+val);	// val = 9
		System.out.println("res : "+res);	// res = 9 (빼진 후에 대입)
		val =10;
		res = val--;
		//res = val;
		//val-=1;
		System.out.println("val : "+val);	// val = 9
		System.out.println("res : "+res);	// res = 10 (대입한 후에 빼짐)	
	}
}
