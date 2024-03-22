package kr.or.ddit.study06.sec05;

public class SingleTon {
	private static SingleTon instance;
	
	private SingleTon() {
		// 클래스 생성은 자기 자신만 사용가능
	}
	
	public static SingleTon getInstance() {
		if(instance == null) {	
			instance = new SingleTon();	
			//singleton객체를 만들어서 힙메모리에 생성한 후에
			//메소드 영역에있는 instance에 힙영역의 주소값을 저장한다
		}
		return instance;
		// null값일 때만 만들어지므로
		// 이미 만들어진 상태면 기존 값을 리턴하기 때문에
		// 항상 객체는 하나만 만들어진다
	}

}
