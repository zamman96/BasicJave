package kr.or.ddit.study02.sec03;

public class CastExample01 {
	public static void main(String[] args) {
		// 국 영 수 점수 3개를 변수 선언 및 저장 후
		// 총점 평균을 구하시오.
		
		int kor = 87;
		int eng = 90;
		int math = 85;
		
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		// double avg = sum/3.0;				
		// (정수/정수)는 타입은 정수로 변하지 않음, int =>double 변환
		
		System.out.println("총점 : "+sum+" 평균 : "+avg);

		int i1 = (int) avg;
		System.out.println(i1);
	
//		//87.3
//		int i2 = (int)(avg*10);
//		
//		// int i2 = (int)avg*10; 
//		//870
//
//		avg = i2/10.0;
//		System.out.println(avg);
		
		//87.33
		int i2 = (int)(avg*100);
		avg = i2/100.00;
		System.out.println(avg);
				
	}
}
