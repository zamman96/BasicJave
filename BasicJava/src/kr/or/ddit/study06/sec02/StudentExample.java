package kr.or.ddit.study06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.kor=90;
		s1.eng=80;
		s1.math=85;
		s1.sum=s1.kor+s1.eng+s1.math;
		s1.avg=s1.sum/3.0;
		
		Student s2 = new Student();
		s2.name = "김철수";
		s2.kor=87;
		s2.eng=80;
		s2.math=90;
		s2.sum=s2.kor+s2.eng+s2.math;
		s2.avg=s2.sum/3.0;
		
		System.out.println(s1.name);
		System.out.println(s1.kor+", "+s1.eng+", "+s1.math);
		System.out.println(s1.sum);
		System.out.println(s1.avg);
		System.out.println();
		System.out.println(s2.name);
		System.out.println(s2.kor+", "+s2.eng+", "+s2.math);
		System.out.println(s2.sum);
		System.out.println(s2.avg);
		
	}
}
