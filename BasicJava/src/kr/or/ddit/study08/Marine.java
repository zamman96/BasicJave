package kr.or.ddit.study08;

public class Marine implements Unit {

	@Override
	public void attack() {
		System.out.println("데미지 5를 줍니다.");
		
	}

	@Override
	public void move() {
		System.out.println("걸어 갑니다");
		
	}

}
