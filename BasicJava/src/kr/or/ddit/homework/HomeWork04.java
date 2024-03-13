package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	String set = "";
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.method1();
	}
	
public void method1() {
		// 0 : 가위, 1: 바위, 2: 보 를 입력하고
		// 컴퓨터의 결과값에 따라 승패를 출력하시오.
	System.out.println("숫자를 입력해 주세요.");
	System.out.println("0 : 가위, 1: 바위, 2: 보");
		Random random = new Random();
		int user = sc.nextInt();
		if (user >=0 && user<=2) {
		int com = random.nextInt(3);
		String result = "";
		
		int fight = user - com;
		String usre = "";
		String core = "";

		
		method2(user);
		usre = set;
		
		method2(com);
		core = set;
		
		if(user == com) {
			result = "비겼다.";
		} else if (fight==1) {
			result = "이겼다.";
		} else if (fight==2) {
			result = "졌다.";
		} else if (fight==-1) {
			result = "졌다.";
		} else {
			result = "이겼다.";
		}
		// ex) user : 가위, com : 보 이겼다.
		System.out.println("user : "+usre+", com : "+core+"\t"+result);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method2(int num){
		if(num == 0) {
			set = "가위";
		} else if (num ==1) {
			set ="바위";
		} else {
			set="보";
		}
	}
}

