package kr.or.ddit.study06.sec04;

public class MethodExample3 {
	int a = 10;
	int b = 5;
	
	public static void main(String[] args) {
		MethodExample3 m1 = new MethodExample3();
		m1.callA();
		m1.callB();
		m1.b = 7;
		m1.sum();
		
		MethodExample3 m2 = new MethodExample3();	
		m2.a = 8;
		m2.b = 5;
		m1.sum();
		m2.callA();
		m2.sum();
	}

	public int callA() {
		System.out.println(a);
		return a;
	}
	public int callB() {
		System.out.println(b);
		return b;
	}
	public void sum() {
		System.out.println(callA()+callB());
	}
}
