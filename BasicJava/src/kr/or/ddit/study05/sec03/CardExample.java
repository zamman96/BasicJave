package kr.or.ddit.study05.sec03;

public class CardExample {
	
	public static void main(String[] args) {
		CardExample ce = new CardExample();
		ce.card("국민");
		ce.card(Card.HANA);
		// String 타입은 여러가지 선택을 할 수 있지만
		// enum을 설정함으로 써 선택 제한을 두어 오류를 줄일 수 있음
	}
	
	
	public void card(String card) {
		if(card.equals("hana")) hana();
		if(card.equals("shinhan")) shinhan();
	}
	
	public void card(Card card) {
		if(card == Card.HANA) hana();
		if(card == Card.SHINHAN) shinhan();	
	}
	
	private void hana() {
		System.out.println("하나 카드 연동");
	}
	
	private void shinhan() {
		System.out.println("신한 카드 연동");
	}
}
