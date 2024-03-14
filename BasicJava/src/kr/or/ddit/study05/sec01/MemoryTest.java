package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class MemoryTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MemoryTest obj = new MemoryTest();
//		obj.method1();
		obj.method2();
	}
	public void method1() {
		int a = 10;
		
		int b = 20;
		// 1.
		{
			String c = "자바";
			// 2.
			if(a==10) {
				String f = new String("자바");
				//3.
			}
		}
		String d = "자바";
		// 4.
		int e = 8;
		// 5.
	}
	
	public void method2() {
		int a = 5;
		// 1. stack에 저장
		if(a==3) {
			int b = 10;
			// 2. false이므로 저장 X
		} else {
			int[] c = new int[10];
			// 3. stack에 저장되며 배열은 힙에 저장 주소값100 (if문이 끝나면 stack에서 사라짐)
			c[1] = 10;
			// 4. 힙 메모리에 있던 값 c[1]에 저장 
			// [0,1,0,0,0,0,0,0,0,0]
		}
		
		String[] d = {"a","b","c"};
		// 5. stack에 저장되며 배열값은 힙메모리에 저장 
		// 주소값 200 [주소값300,주소값400,주소값500] | 주소값300 a | 주소값400 b | 주소값500 c
		if(a==5) {
			int e = 100;
			String f = d[0];
			// 6. e f stack에 저장 f값은 주소값300을 참조 (if문이 끝나면 stack에서 사라짐)
		}
		String g = d[2];
		// 7. stack에 저장하며 주소값 500을 참조
	}
}
