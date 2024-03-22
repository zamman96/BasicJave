package kr.or.ddit.study06.sec05;

import java.util.Random;

public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "오리";		// 힙영역에 저장
		person.year = 2023;		// 메소드 영역에서 2023값 저장
		
		Person person2 = new Person();
		person2.name = "거위";	// 힙영역에 저장
		person2.year = 2024;	// 메소드 영역에서 2023년값이 삭제되고 2024값 저장
		
		System.out.println(person);
		System.out.println(person2);
		
		StaticTest.method3();
		
		new Random().nextInt(50);
	}
}
