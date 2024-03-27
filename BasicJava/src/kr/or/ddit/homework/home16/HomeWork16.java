package kr.or.ddit.homework.home16;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}
	
	public void process() {
		int money = 10000;
		int turn = 0;
		while(turn++<10) {
			// NationA, NationB
			// 각 게임마다 상금 1만원
			System.out.println("-------------------------------------");
			System.out.println("현재 턴 : "+turn);
			System.out.println("현재 돈 : "+money);
			System.out.println("1. A나라 (세금15% 생활비 4000, 가위바위보 게임)");
			System.out.println("2. B나라 (세금20% 생활비 5000, 홀짝 게임)");
			System.out.println("-------------------------------------");
			Nation n = null;
			int sel = sc.nextInt();
			if(sel==1) n= new NationA();
			if(sel==2) n= new NationB();
			
			money+=n.game();
			money-=n.tax(money);
		}
		System.out.println("결과");
		System.out.println("총 보유 잔액 :"+money);
	}
}
