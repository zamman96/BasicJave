package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class LottoMethod {
	public static void main(String[] args) {
		LottoMethod lm = new LottoMethod();
		lm.process();
	}
	// 실행하는 메소드
	public void process() {
//		int[][][] bundle = lottoBundle(14000);
//		printBundle(bundle);
		
		int[][] paper=lottoPaper();
		print(paper);
	}
	
	// 로또 한 줄 생성 리턴메소드
	public int[] generateLotto() {
		int[] lotto = new int[6];

		for (int num = 0; num < lotto.length; num++) {
			int ran = new Random().nextInt(45) + 1;
			lotto[num] = ran;
			for (int j = 0; j < num; j++) {
				if (lotto[num] == lotto[j]) {
					num--;
					break;
				}
			}
		}
		sort(lotto);
		return lotto;
	}
	// 5줄짜리 로또 1장을 생성 리턴하는 메소드
	public int[][] lottoPaper() {
//		int[][] papar = new int[5][6];
//		for(int row=0; row<papar.length;row++) {
//			papar[row]=generateLotto();
//		}
		return lottoPaper(5);
	}
	//num줄짜리 로또 1장을 생성 (오버로딩)
	public int[][] lottoPaper(int num){
		int[][] papar = new int[num][6];
		for(int row=0; row<papar.length;row++) {
			papar[row]=generateLotto();
		}
		return papar;
	}
	// 로또 여러 장의 로또를 생성 리턴
	public int[][][] lottoBundle(int money){
		int papers = money/5000;
		if(money%5000!=0) papers++;
		int[][][] bundle = new int[papers][5][6];
		for(int i=0; i<bundle.length;i++) {
			bundle[i]=lottoPaper();
		}
		//나머지가 있는경우 마지막장 재생성
		if(money%5000!=0) {
			bundle[bundle.length-1] = lottoPaper((money%5000)/1000);
		}
		return bundle;
	}

	
	// 버블 정렬 메소드
	public void sort(int[] lotto) {
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
	}
	// Arrays.ToString 메소드
	public String arrayToString(int[] lotto) {
		String result = "";
		System.out.print("[");
		for(int num=0; num<lotto.length;num++) {
			result+=lotto[num];
			if(num==lotto.length-1) {
				result+="]";
			} else {
				result+=", ";
			}
			
		}
		
		return result;
	}
	// 다차원 배열의 로또 출력 메소드
	// Arrays.deepToString(papar) 2차원 배열 출력
	public void print(int[][] paper) {
//		for(int i=0; i<paper.length;i++) {
//			for(int j=0;j<paper[i].length;j++) {
//				System.out.print(paper[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i = 0; i<paper.length;i++) {
			int[]lotto=paper[i];
			arrayToString(lotto);
		}
	}
	// 종이 전체 출력
	public void printBundle(int[][][] bundle) {
		for(int i=0; i<bundle.length;i++) {
			System.out.println("=========================");
			int[][] paper = bundle[i];
			for(int j=0; j<paper.length;j++) {
				int[] lotto = paper[j];
				System.out.println(Arrays.toString(lotto));
//				System.out.println(Arrays.toString(paper[j]));
			}
			System.out.println("=========================");
		}
	}


}
