package kr.or.ddit.homework;

import java.util.Arrays;

public class HomeWork10 {
	public static void main(String[] args) {
		Student[] scores = new Student[5];
	
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;
		scores[3] = s4;
		scores[4] = s5;
		
		// 정보 입력
		s1.name = "김정석";
		s1.kor = 80;
		s1.eng = 73;
		s1.math = 80;
		s1.sum=s1.kor+s1.eng+s1.math;
		s1.avg=s1.sum/3.0;
		
		s2.name = "김민구";
		s2.kor = 90;
		s2.eng = 85;
		s2.math = 90;
		s2.sum=s2.kor+s2.eng+s2.math;
		s2.avg=s2.sum/3.0;
		
		s3.name = "조하연";
		s3.kor = 90;
		s3.eng = 70;
		s3.math = 75;
		s3.sum=s3.kor+s3.eng+s3.math;
		s3.avg=s3.sum/3.0;
		
		s4.name = "이병훈";
		s4.kor = 70;
		s4.eng = 75;
		s4.math = 70;
		s4.sum=s4.kor+s4.eng+s4.math;
		s4.avg=s4.sum/3.0;
		
		s5.name = "서성배";
		s5.kor = 80;
		s5.eng = 80;
		s5.math = 70;
		s5.sum=s5.kor+s5.eng+s5.math;
		s5.avg=s5.sum/3.0;
		
		// 총점 평균 랭킹 구하기
		int sum[] = new int[5];
		for(int i=0; i<scores.length;i++) {
			sum[i] = scores[i].sum;
		}
		Arrays.sort(sum); // 70 76 76 78 88
				
		for(int i=0; i<scores.length;i++) {
			for(int j=0; j<sum.length;j++) {
				if(scores[i].sum==sum[j]) {
					scores[i].rank=5-j;
				}
			}
		}
		
		
		// 정렬 
		Student[] temp = new Student[1];
		
		for(int i=0;i<scores.length-1;i++) {
			for(int j=0;j<scores.length;j++) {
				if(scores[i].rank>scores[i+1].rank) {
					temp[0]=scores[i];
					scores[i]=scores[i+1];
					scores[i+1]=temp[0];
				}
			}
		}
		
		//출력
		for(int i=0; i<scores.length;i++) {
			System.out.println(scores[i]);
		}
	}
	
}

class Student{
	// 이름, 국, 영, 수, 총점, 평균, 랭킹
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	@Override
	public String toString() {
		return "Student [이름 : " + name + ", 국어 점수 : " + kor + ", 영어 점수 : " + eng + ", 수학 점수 : " + math + ", 총점 : " + sum + ", 평균 : "
				+ avg + ", 등수 : " + rank + "]";
	}
	
	
	
}