package kr.or.ddit.study06.sec02;

public class TvExample {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.company="LG";
		tv1.year=2024;
		tv1.size=50;
		
		Tv tv2 = new Tv();
		tv2.company="삼성";
		tv2.year=2023;
		tv2.size=85;
		
		System.out.println(tv1.company+" "+tv1.year+" "+tv1.size);
		
		System.out.println(tv2);
	}
}
