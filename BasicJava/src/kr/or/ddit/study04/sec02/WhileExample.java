package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	
	public void method1() {
		// while 반복문 무한 루프 등을 사용할 때 주로 사용
		//				(끝나는 지점을 알기 힘들 때)
		
		// while(조건식){
		//  실행문
		// }
		
		int num=1;
		while(num<10) {
			System.out.println(num+"번");
			num++;
		}
		System.out.println(num+"번 찍어 안넘어가는 나무 없다");
	}
	
	public void method2() {
		int num = 1;
		while(num>0) {
			num+=100;
			System.out.println(num);
		}
		System.out.println(num);
	}
	
	public void method3() {
		String menu = "";
		menu += "=======커피메뉴=======\n";
		menu += "1. 아메리카노       : 1000\n";
		menu += "2. 카페라떼          : 2000\n";
		menu += "3. 카라멜마키야또 : 3000\n";
		menu += "4. 종료";
		//for(;;) { 과 동일
		int sum = 0;
		String bill ="";
		while(true) {
			System.out.println(menu);
			System.out.println("메뉴를  번호로 선택하세요");
			int sel = sc.nextInt();
			if(sel==1) { sum+=1000; bill+="아메리카노\n";}
			else if(sel==2) {sum+=2000; bill+="카페라떼\n";}
			else if(sel==3) {sum+=3000; bill+="카라멜마끼야또\n";}
			else if(sel==4) break;
			else System.out.println("잘못된 입력입니다.\n");
		}
		System.out.println("============================");
		System.out.print("[주문한 내역]\n"+bill);
		System.out.println("----------------------------");
		System.out.println("총 결제할 금액은 : "+sum+"원 입니다.");
		System.out.println("============================");
	}
	
	public void method4() {
		do {
			System.out.println("???");
		} while(false);
		
	}
	
	public void method5() {
		// 각 자리수의 합을 구하시오.
		// ex) 123 => 1+2+3
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum+= num%10;
			num/=10;
		}
		System.out.println(sum);
	}
}

