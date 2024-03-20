package kr.or.ddit.study06.sec04;

public class Circle {
	double Pi = Math.PI;
	public static void main(String[] args) {
		Circle c = new Circle();
		double area = c.area(10);
		double round = c.round(10);
		System.out.println("원의 넓이 : "+area+", 원의 둘레 : "+round);
	}
	
	// 파라미터 r 입력 받아 넓이를 리턴하는 메소드 완성
	public double area(int r) {
		return r*r*Pi;
	}
	
	// 파라미터 r 입력 받아 둘레를 리턴하는 메소드 완성
	public double round(int r) {
		return 2*r*Pi;
	}
}
