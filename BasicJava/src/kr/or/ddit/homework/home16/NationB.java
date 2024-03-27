package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class NationB extends Nation{
	Scanner sc = new Scanner(System.in);
	@Override
	public int game() {
		int ran = new Random().nextInt(9)+1;
		System.out.println("1. 홀 , 2. 짝");
		int sel = sc.nextInt();
		System.out.println("결과 : "+ran);
		if(sel==1) {
			if(ran%2!=0) {
				System.out.println("맞췄습니다");
				return 10000;
			} else {
				System.out.println("틀렸습니다");
				return 0;
			}
		}
		if(sel==2) {
			if(ran%2==0) {
				System.out.println("맞췄습니다");
				return 10000;
			} else {
				System.out.println("틀렸습니다");
				return 0;
			}
		}
		return 0;
	}
	
	@Override
	public int tax(int money) {
		return (int) (money*0.2+5000);
	}
	
}
