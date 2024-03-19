package kr.or.ddit.study06.sec03;

public class Rectangle {
	// 너비 높이 넓이
	int height;
	int width;
	int area;
	
	// 생성자 너비 높이 입력
	// 넓이 = 너비 *높이
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
		this.area=width*height;
	}
}
