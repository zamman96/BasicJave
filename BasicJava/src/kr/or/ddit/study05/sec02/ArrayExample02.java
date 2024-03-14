package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}
	
	public void method1() {
		// 각 타입별 초기화값.
		// boolean : false
		// char : ' ', '\u0000'
		// byte, short, int, long : 0
		// float : 0.0f
		// double : 0.0
		
		// 참조 타입(reference type) : null
		
		char c = '\u0000';
		System.out.println(c);
	}
	
	public void method2() {
		// 배열복사
		// 깊은 복사, 얕은 복사
		
		
		// 얕은복사 (shallow copy)
		// 복사된 배열이나 원본 배열이 변경될 때 서로간의 값의 길이 변경됨.
		int[] source = {1,2,3,4,5};
		int[] target = source;
//		
//		System.out.println("변경 전");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : target) System.out.print(t+"\t");
//		System.out.println();	
//		
//		
//		target[2] = 10;
//		System.out.println("변경 후");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : target) System.out.print(t+"\t");
//		System.out.println();	
		
		//깊은 복사 : 배열 공간을 별도로 확보
		//1. 반복문 사용
		//2. System.arraycopy()
		//3. clone
//		1번째 방법
//		int[] des1 = new int[source.length];
//		for(int i=0; i<source.length; i++) {
//			des1[i] = source[i];
//		}
//
//		System.out.println("변경 전");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : des1) System.out.print(t+"\t");
//		System.out.println();	
//		
//		des1[2] = 10;
//		System.out.println("변경 후");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : des1) System.out.print(t+"\t");
//		System.out.println();	
		
		
//		2번째 방법
//		int[] des2 = new int[source.length];
//		System.arraycopy(source, 0, des2, 0, source.length);
//		
//		System.out.println("변경 전");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : des2) System.out.print(t+"\t");
//		System.out.println();	
//		
//		des2[2] = 10;
//		System.out.println("변경 후");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : des2) System.out.print(t+"\t");
//		System.out.println();
		
//		3번째 방법
//		int[] des3 = source.clone();
//		System.out.println("변경 전");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : des3) System.out.print(t+"\t");
//		System.out.println();	
//		
//		des3[2] = 10;
//		System.out.println("변경 후");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();	
//		
//		for(int t : des3) System.out.print(t+"\t");
//		System.out.println();
		
	}

	public void method3() {
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
	}
	
	public void method4() {
		// 3명의 국영수 점수를 저장
		// 각 학생의 이름을 a b c
		int[][] scores = {{94,87,93},{78,85,99},{87,88,67}};
		String a = "a";
		String b = "b";
		String c = "c";
		String[] arr = {a,b,c};
		String[] sub = {"국어", "영어", "수학"};
		
		// a학생의 국어 점수를 출력하시오
		System.out.println(a+"학생의 국어점수 : "+scores[0][0]);
		System.out.println("=====================");
		// c학생의 수학 점수를 출력하시오
		System.out.println(c+"학생의 수학점수 : "+scores[2][2]);
		System.out.println("=====================");
		// 3명의 학생의 국어 평균
		int sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			sum+=scores[i][0];
		}
		System.out.println("국어 평균 : "+(double)sum/scores.length);
		System.out.println("=====================");
		// b학생의 평균 점수
		sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[1][i];
		}
		System.out.println(b+"학생의 평균 점수 : "+(double)sum/3);
		System.out.println("=====================");
		// 전체 출력
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i=0; i<scores.length; i++) {
				sum=0;
				System.out.println(arr[i]+"의 성적");
				for(int j=0; j<scores[i].length;j++) {
				System.out.println(sub[j]+" : "+scores[i][j]);
				sum+=scores[i][j];
			}	
				sum1+=scores[i][0];
				sum2+=scores[i][1];
				sum3+=scores[i][2];
				System.out.println("전과목 평균 : "+(double)sum/3);
				System.out.println("---------------------");
		}
		System.out.println(sub[0]+" 평균 : "+(double)sum1/scores.length);
		System.out.println(sub[1]+" 평균 : "+(double)sum2/scores.length);
		System.out.println(sub[2]+" 평균 : "+(double)sum3/scores.length);
	}
}
