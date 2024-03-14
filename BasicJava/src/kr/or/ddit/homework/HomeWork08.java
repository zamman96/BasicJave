package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}
	
	public void process() {
		// 길이 45 배열 선언할 것.
		int[] temp = new int[45];
		//각 배열에 1~45값 입력
		for(int i=0;i<temp.length;i++) {
			temp[i]=i+1;
		}
		// 배열 섞기
		for(int i=0; i<temp.length;i++) {
			int r = new Random().nextInt(temp.length);
			int a = temp[i];
			temp[i]=temp[r];
			temp[r]=a;
		}
		
		// 길이 6 배열만들기
		int[] lotto = new int[6];
		
		// lotto 배열에 temp 값 복사
		int j =0;
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=temp[j];
			j++;
		}
		
		// lotto 배열 정렬
		for(int i=0; i<lotto.length-1; i++) {
			for(j=0;j<lotto.length-1;j++) {
				if(lotto[j]>lotto[j+1]) {
					int b = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = b;
				}
			}
		}
		// 출력
		for(int i=0; i<lotto.length-1; i++) {
			System.out.print(lotto[i]+"\t");
		}
	}
}
