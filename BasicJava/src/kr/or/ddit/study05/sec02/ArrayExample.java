package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample obj = new ArrayExample();
//		obj.method1();
		obj.method2();
	}
	
	public void method1() {
		//int 변수 5개 선언 및 저장 하기
		int[] arr = new int[5];
		arr[0] = 80;
		arr[1] = 81;
		arr[2] = 82;
		arr[3] = 83;
		arr[4] = 84;
		int sum = 0;
		System.out.println(arr); //주소값
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	
	public void method2() {
		// 정수 5개를 저장하고 역순으로 출력
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[arr.length-1-i]);
		}
		
	}
}
