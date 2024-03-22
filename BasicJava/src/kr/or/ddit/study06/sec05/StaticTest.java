package kr.or.ddit.study06.sec05;

public class StaticTest {

	int a = 0;	
	
	static int b = 20;
	
	static String c = "100";
	
	
	public void method1() {
		// static과 상관없이 다 불러올 수 있음
	}
	public void method2() {
		
	}
	public static void method3() {
		// 변수 a와 메소드 method1 method2를 호출할 수 없음
	}
	public static void method4() {
		
	}
}
