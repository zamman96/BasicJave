package kr.or.ddit.study06.sec04;

public class MethodExample1 {

	public static void main(String[] args) {
		MethodExample1 me = new MethodExample1();
		me.method1();
		me.method2(10);
		me.method3("문자열");
		me.method4("문자열",20);
	}
	
	public void method1() {
		System.out.println("파라미터 없는 메소드");
	}

	public void method2(int num) {
		System.out.println("int num을 파라미터로 가지는 메소드");
		System.out.println("외부에서 받은 값 : "+num);
	}
	
	public void method3(String str) {
		System.out.println("String str을 파라미터로 가지는 메소드");
		System.out.println("외부에서 받은 값 : "+str);		
	}

	public void method4(String str, int num) {
		System.out.println("String str, int num을 파라미터로 가지는 메소드");
		System.out.println("외부에서 받은 값 : "+str+", "+num);		
	}

}
