package kr.or.ddit.study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int add1 = cal.add(1, 4);
		System.out.println(add1);
		double add2 = cal.add(2.1, 3.4);
		System.out.println(add2);
		int sub = cal.sub(1, 4);
		System.out.println(sub);
		double div = cal.div(7, 3);
		System.out.println(div);
		int mul = cal.mul(4, 4);
		System.out.println(mul);
	}
	
	public void method1() {
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 종료");
			int sel=2;
			if(sel==2) return;
		}
	}
	
	// a b 값을 매개변수로 결과값을 a+b로 하는 메소드 만들기
	public int add(int a, int b) {
		return a+b;
	}
	// 오버로딩
	public double add(double a, double b) {
		return a+b;
	}
	// a b 값을 매개변수로 결과값을 a-b로 하는 메소드 만들기
	public int sub(int a, int b) {
		return a-b;
	}
	// a b 값을 매개변수로 결과값을 a/b로 하는 메소드 만들기
	public double div(int a, int b) {
		if(b==0) {
		return 0;
		}
		return (double)a/b;
	}
	// a b 값을 매개변수로 결과값을 a*b로 하는 메소드 만들기
	public int mul(int a, int b) {
		return a*b;
	}
}
