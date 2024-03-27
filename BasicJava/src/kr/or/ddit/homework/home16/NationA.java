package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class NationA extends Nation {
	Scanner sc = new Scanner(System.in);

	// 가위바위보
	@Override
	public int game() {
		while(true) {
		int ran = new Random().nextInt(2) + 1;
		System.out.println("1. 가위, 2. 바위, 3. 보");
		int sel = sc.nextInt();
		System.out.println("당신 : "+result(sel));
		System.out.println("컴퓨터 : "+result(ran));
		if (sel - ran == 2) {
			System.out.println("졌습니다");
			return 0;
			}
		if (sel - ran == 1) {
			System.out.println("이겼습니다");
			return 10000;
			}
		if (sel - ran == 0) {
			System.out.println("비겼습니다");
		    continue;
			// 비긴경우
		}
		if (sel - ran == -1) {
			System.out.println("졌습니다");
			return 0;}
		if (sel - ran == -2) {
			System.out.println("이겼습니다");
			return 10000;}
		return 0;
		}
	}
	
	public String result(int sel) {
		if(sel ==1) return "가위";
		if(sel==2) return "바위";
		if(sel==3) return "보";
		return null;
	}

	@Override
	public int tax(int money) {
		return (int) (money * 0.15 + 4000);
	}

}
