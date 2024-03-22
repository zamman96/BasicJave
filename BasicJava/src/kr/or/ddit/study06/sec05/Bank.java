package kr.or.ddit.study06.sec05;

public class Bank {
	static int totalmoney = 1000000;	//공유하는 속성
	
	int money;
	
	
	public void loan(int loan) {
		if(totalmoney<loan) {
			System.out.println("보유금액 보다 많은 요청입니다.");
			System.out.println("보유 금액 : "+totalmoney);
			return;
		}
		System.out.println(loan+"금액을 대출해줍니다.");
		System.out.println("보유 금액 : "+totalmoney);
		totalmoney-=loan;
		money+=loan;
	}
	
	public void repayMent(int repay) {
		totalmoney+=repay;
	}
	
}