package kr.or.ddit.study06.sec05;

import java.util.Random;

public class BankExample {
	public static void main(String[] args) {
		Bank[] people = new Bank[5];
	
		for(int i=0; i<people.length; i++) {
			people[i] = new Bank();
			int ran = new Random().nextInt(5)+1;
			people[i].loan(ran*100000);
		}
		
		for(Bank bank : people) {
			System.out.println("보유 금액 : "+bank.money);
		}
	
	
	
	}
}
