package kr.or.ddit.study02.sec01;

public class JavaVar3 {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		int result = a+b;
		
		a = a+b;			//식은 오른쪽 부터 시작 a=8 덮어씌워짐
		b = b+a;			//바뀐 변수 값 적용 b=13 
		
		System.out.println(b);
		
		
	}
}
