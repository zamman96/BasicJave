package kr.or.ddit.study02.sec04;

public class PrintExample {
	public static void main(String[] args) {
//		System.out.println();	줄바꿈 기능 있음
		System.out.println("홍길동");
		System.out.println("34061");
		System.out.println("대전시 중구 계릉로");
		
//		System.out.print();		줄바꿈 기능 없음
		System.out.print("홍길동");
		System.out.print(" 34061");
		System.out.print(" 대전시 중구 계릉로\n");
		
//		System.out.printf("형식지정문자열", 변수리스트);
		//"형식지정문자열"
		//"%[[-/0]n]d 10진 정수
		// - : 완쪽 정렬
		// 0 : 남은 왼쪽 빈공간에 0채움
		// 실수 %f, 문자열 %s
		
		System.out.printf("%8d\n",1000);
		System.out.printf("%-8d\n",1000);
		System.out.printf("%08d\n",1000);
		
		System.out.printf("자바 점수 : %d, 오라클점수 : %d\n", 90, 70);
		
		String format = "SELECT * FROM %s";
		String query = String.format(format, "MEMBER");
		System.out.println(query);
		
		
		
	}
}
