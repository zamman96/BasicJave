package kr.or.ddit.study08;

public class Mutal implements Unit {

	@Override
	public void attack() {
		System.out.println("스플래시 공격");

	}

	@Override
	public void move() {
		System.out.println("날아 갑니다.");
		
	}

}