package kr.or.ddit.study07.pen;
public class FountainPen extends Pen {
	public void refill (int amount) {
		// 부모 클래스의 필드값도 가져올 수 있다
		this.amount += amount;
	}
}
