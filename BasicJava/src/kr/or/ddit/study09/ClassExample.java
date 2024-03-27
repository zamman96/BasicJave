package kr.or.ddit.study09;

public class ClassExample {
	public static void main(String[] args) {
		// classB에 field b 값 가져와보기
//		ClassA c1 = new ClassA();
//		ClassA.ClassB c2 = c1.new ClassB();
//		System.out.println(c2.b);
		
		int b = new ClassA().new ClassB().b;
		
		// classC에 field c 값 가져와보기
//		ClassA.ClassC c3 = new ClassA.ClassC();
//		System.out.println(c3.c);
		
		int c = new ClassA.ClassC().c;
	}
}
