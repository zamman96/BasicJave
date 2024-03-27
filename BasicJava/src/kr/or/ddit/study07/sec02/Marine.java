package kr.or.ddit.study07.sec02;

public class Marine extends Unit{
	@Override
	public void attack() {
		System.out.println("데미지 5를 줍니다.");
	}
	
	@Override
	public void move() {
		System.out.println("걸어 갑니다");
	}
}
