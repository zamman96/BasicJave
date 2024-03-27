package kr.or.ddit.study07.phone;

public class HandPhone extends Phone {
	
	private void move() {
		System.out.println("이동 기능");
	}
	
	@Override
	public void call() {
		move();
		super.call();
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString(); //super 부모클래스
	}

}


