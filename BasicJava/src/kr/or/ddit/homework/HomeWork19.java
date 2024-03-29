package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HomeWork19 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.process();
	}

	public void process() {
		// 주사위 2개를 던졌을 때 나오는 분포도를 출력
		// 2 **
		// 3 ***
		// 4 *****
		// 5 *******
		// 6 *********
		// 7 ***********
		// 퍼센트당 1개
		// 2~12
		System.out.print("시행횟수 : ");
		int num = sc.nextInt();
		Map<Integer, Integer> map = rollDice(num);
		
		System.out.println("====== 주사위 2개 결과 분포도 ======");
		print(map,num);
		System.out.println("============================");
	}

	// 주사위 2개 던지기
	public int throwDice() {
		int sum = 0;
		// 2번 던지기 반복문
		for (int i = 0; i < 2; i++) {
			// Random은 0~5범위므로 +1
			int num = new Random().nextInt(6) + 1;
			sum += num;
		}
		return sum;
	}

	/**
	 * @param num 주사위 2개 던지는 시행 횟수
	 * @return 각 시행 결과 총합
	 */
	public Map<Integer, Integer> rollDice(int num) {
		Map<Integer, Integer> map = new HashMap();
		// 반복문 num번 시행
		for (int i = 0; i < num; i++) {
			int sum = throwDice();
			// 던진 값이 이미 map에 있을 때
			if (map.containsKey(sum)) {
				// 원래 있던 값에 +1하고 저장
				int value = map.get(sum) + 1;
				map.put(sum, value);
			} else {
				// 없는 경우 1부터 저장
				map.put(sum, 1);
			}
		}
		// 시행횟수 확인 
//		System.out.println(map);
		return map;
	}

	/**
	 * 주사위 시행결과를 출력 3% -> *** 5% -> *****
	 * 
	 * @param map
	 */
	public void print(Map<Integer, Integer> map,int num) {
		//주사위 2번 던진 값 범위 2~12까지 반복문
		for(int i=2; i<=12;i++) {
			// 총합이 i와 같은 map 검색
			if(map.containsKey(i)) {
				// 퍼센트로 반복횟수 지정
				int repeat = map.get(i)*100/num;
				System.out.print(i+"\t");
				// 분포도 출력
				for(int j=0;j<repeat;j++) {
					System.out.print("■");
				}
				// 다음으로 넘어가기 위해 엔터 출력
				System.out.println();
			}
		}
	}
}
