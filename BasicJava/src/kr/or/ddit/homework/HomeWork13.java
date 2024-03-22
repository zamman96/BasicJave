package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork13 {
	// 로또 길이
	int length = 8;
	// 당첨되는 숫자 범위-1 (1부터 시작하므로 -1한 값)
	int selNum = 44;
	// 당첨되야되는 숫자 갯수
	int winNum = 6; 
	
	Scanner sc = new Scanner(System.in);
	int money = 100000;

	public static void main(String[] args) {
		HomeWork13 hw = new HomeWork13();
		hw.process();
	}

	public void process() {
		int[] round = round();
		while (true) {
			System.out.println("1. 로또 구매");
			System.out.println("2. 종료");

			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("현재 잔액 : "+money);
				System.out.println("구입할 로또 금액");
				int buy = sc.nextInt();
				// buy > money 값보다 클 경우 구매 못한다는 메세지
				if (buy > money) {
					System.out.println("잔액이 부족합니다.");
					// 구매할 경우 money에서 금액 차감.
				} else {
					money -= buy + buy % 1000;
					System.out.println("거스름돈 : " + buy % 1000);
					System.out.println("구입한 로또");
					int[][][] bundle = lottoBundle(buy);
					printLotto(bundle);

					System.out.println("이번 회차 당첨번호");
					System.out.println(Arrays.toString(round));
					System.out.println("-----------------------------------");
					// 비교 (for문 / equals사용)
					// 총 당첨번호 갯수 배열 전체를 파악하고싶어서 추가
					ArrayList <Integer> count = new ArrayList<>();
					
					for (int k = 0; k < bundle.length; k++) {
						for (int j = 0; j < bundle[k].length; j++) {
							int sum = 0;
							for (int i = 0; i < round.length; i++) {
								if (round[i] == bundle[k][j][i]) {
									sum++;
								}
								}
							if(sum==winNum) {
								System.out.println("당첨되었습니다.");
								System.out.println("당첨금 100000원 입금되었습니다");
								money+=100000;
							}
							//Arraylist 배열 추가
							count.add(sum);
						}
					}
					//Arraylist 배열 출력
					System.out.println("일치하는 숫자");
					for(int num : count) {
						System.out.print(num+" ");
					}
					System.out.println();
				}
				// 구매한 로또와 이번회차 당첨 번호가 일치할 시 상금 지급
				// 상금 100000
				// 로또 번호는 총 8개
			}
			if (sel == 2) {
				break;
			}
		}

	}

	// 이번 회차 로또 당첨 번호
	public int[] round() {
		int[] round = lottoNum();
		return round;
	}

	// 번호 1줄 출력
	public int[] lottoNum() {
		int[] lotto = new int[length];
		for (int num = 0; num < lotto.length; num++) {
			//1~45번 출력
			int r = new Random().nextInt(selNum)+1;
			lotto[num] = r;
			for (int i = 0; i < num; i++) {
				if (lotto[num] == lotto[i]) {
					num--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

	// num줄 출력
	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][length];
		for (int row = 0; row < num; row++) {
			paper[row] = lottoNum();
		}
		return paper;
	}

	// 5줄 출력
	public int[][] lottoPaper() {
		return lottoPaper(5);
	}

	// 1장 출력
	public int[][][] lottoBundle(int buy) {
		int papers = buy / 5000;
		if (buy % 5000 != 0)
			papers++;
		int[][][] bundle = new int[papers][5][length];
		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		// 나머지가 있는경우 마지막장 재생성
		if (buy % 5000 != 0) {
			bundle[bundle.length - 1] = lottoPaper((buy % 5000) / 1000);
		}
		return bundle;
	}

	// 로또 출력
	public void printLotto(int[][][] bundle) {
		for (int i = 0; i < bundle.length; i++) {
			System.out.println("==================================");
			int[][] paper = bundle[i];
			for (int j = 0; j < paper.length; j++) {
				int[] lotto = paper[j];
				System.out.println(Arrays.toString(lotto));
			}
			System.out.println("==================================");
		}
	}

}
