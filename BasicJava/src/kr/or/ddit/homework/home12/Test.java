package kr.or.ddit.homework.home12;

import java.util.Scanner;

public class Test {
	String userList = "a";
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Test obj = new Test();
		obj.process();
	}

	public void process() {
		String id = sc.next();
		duplication(id);
	}
	
	public String duplication(String id) {
		boolean dup = true;
		while (dup) {
			// 첫회원일땐 중복검사할 항목이 없으므로 바로 저장
			if (userList.equals(id)) {
				System.out.println("중복된 아이디입니다.");
				System.out.println("다시 입력해주세요");
			}
			id = sc.next();
		}
		return id;
	}

}
