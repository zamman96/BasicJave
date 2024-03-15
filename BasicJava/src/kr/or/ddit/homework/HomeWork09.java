package kr.or.ddit.homework;

import java.util.Arrays;

public class HomeWork09 {
	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}

	public void process() {
		//5명의 3과목 (국, 영, 수) 성적과 이름을 배열에 저장하고
		//총점과 평균, 등수를 구하여 출력하시오.
		
		String[] stu = {"김정석","김민구","조하연","이병훈","서성배"};
		// 국 영 수 총점/평균/등수
		int[][] score = {{80,70,80,0,0,1},{90,85,90,0,0,1},
						{90,70,75,0,0,1}, {65,75,70,0,0,1},
						{80,80,70,0,0,1}};
		String[] subject = {"국어", "영어", "수학","총점","평균","등 수"};
		
		// 총점 계산하기 + 평균 계산
		for(int i=0; i<score.length;i++) {
			int sum = 0;
			for(int j=0; j<3;j++) {
				sum+=score[i][j];
			}
			score[i][3]=sum;
			score[i][4]=sum/3;
		}
		
		// 등수구하기
		int[] avg = new int[score.length];
		for(int i=0; i<score.length;i++) {
			avg[i] = score[i][4];
		}
		Arrays.sort(avg); // 70 76 76 78 88
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<avg.length;j++) {
				if(score[i][4]==avg[j]) {
					score[i][5]=5-j;
				}
			}
		}
		
		// 출력하기
		for(int i=0; i<score.length;i++) {
			System.out.println(stu[i]+"의 성적");
			for(int j=0; j<score[i].length;j++) {
				System.out.println(subject[j]+" : "+score[i][j]);
			}
		System.out.println();
		}
		// 정렬하기
		int a[] = new int[6];
		String name ="";
		for(int i=0; i<score.length-1;i++) {
			boolean change = false;
			for(int j=0; j<score[i].length;j++) {
				if(score[i][5]>score[i+1][5]) {
					a[j]=score[i][j];
					score[i][j]=score[i+1][j];
					score[i+1][j]=a[j];
					change = true;
				}
			}
			// 정렬이 바뀌었을 경우 자리 바꿈
			if(change) {
				name = stu[i];
				stu[i]= stu[i+1];
				stu[i+1]=name;
			}
		}

		// 출력하기
		System.out.println("-----------------------------");
		for(int i=0; i<score.length;i++) {
			System.out.println(stu[i]+"의 성적");
			for(int j=0; j<score[i].length;j++) {
				System.out.println(subject[j]+" : "+score[i][j]);
			}
		System.out.println();
		}
	

	
	}
}
