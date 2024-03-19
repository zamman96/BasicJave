package kr.or.ddit.study06.sec03;

public class Circle {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		System.out.println(c1);
	}
	
	
	// 반지름, 넓이, 원의 둘레
	double PI = Math.PI;
	int r;
	double area;
	double round;
	
	
	// 생성자 반지름만 입력받고
	// 넓이랑 둘레는 자동 생성
	// 넓이 = pi*r*r
	// 둘레= pi*2*r
	public Circle(int r){
		this.r=r;
		this.area=PI*r*r;
		this.round=PI*2*r;
	}


	@Override
	public String toString() {
		return "Circle [rad=" + r + ", area=" + area + ", round=" + round + "]";
	}

}
