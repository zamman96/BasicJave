package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample obj = new ArrayExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
		obj.method8();
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
		int[] arr = new int[5];
		arr[0] = 80;
		arr[1] = 81;
		arr[2] = 82;
		arr[3] = 83;
		arr[4] = 84;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[arr.length-1-i]);
		}
	}
	
	public void method3() {
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method4() {
		// 반복문을 통해 학생 3명의 점수를 입력받으시오
		// 입력 받은 값의 총합, 평균을 구하시오.
		int[] arr = new int[3];
		int sum = 0;
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번 학생의 점수를 입력하세요.");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+(double)sum/3);
	}

	public void method5() {
		int a = 10;
		int b = 7;
		// a 값과 b값 바꾸기
		int temp = a;
		a = b;
		b = temp;
	}

	public void method6() {
		int[] score = {75,80,62,90,85};
		int max = score[0];
		for(int i=0; i<score.length;i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
		System.out.println("최대값은 : "+max);
		
		int min = score[0];
		for(int i=0; i<score.length;i++) {
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최소값은 : "+min);
	}
	
	public void method7() {
		// 버블 정렬
		// 원본자료가 n개일 때 n-1차 운행한다
		// 각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은값을 앞에 위치시킴
		int[] score = {75, 80, 62, 90, 85};
		for(int i =0; i<score.length-1;i++) {
			for(int j=0; j<score.length-1;j++) {
				if(score[j]>score[j+1]) { //부등호를 바꾸면 ASC DESC
					int temp = score[j];
					score[j]= score[j+1];
					score[j+1]=temp;
				}
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}
	}

	public void method8() {
		// 버블 정렬
		// 원본자료가 n개일 때 n-1차 운행한다
		// 각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은값을 앞에 위치시킴
		int[] score = {75, 80, 62, 90, 85};
		for(int i =0; i<score.length-1;i++) {
			boolean flag = true;
			for(int j=0; j<score.length-1;j++) {
				if(score[j]>score[j+1]) { //부등호를 바꾸면 ASC DESC
					int temp = score[j];
					score[j]= score[j+1];
					score[j+1]=temp;
					flag = false;
				}
			}
			if(flag) break;
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}
	}
		
	public void method9() {
		//버블 정렬
		int[] score = {75, 80, 62, 90, 85};
		for(int i=0; i<score.length-1;i++) {
			for(int j=0; j<score.length-1;j++) {
				if(score[j]>score[j+1]) {
					int temp = score[j];
					score[j]= score[j+1];
					score[j+1]=temp;
				}
			}
		}
		for(int i=0; i<score.length;i++) {
			System.out.println(score[i]+"\t");
		}
	}
}

