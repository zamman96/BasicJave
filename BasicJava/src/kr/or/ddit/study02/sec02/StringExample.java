package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		// 문자와 문자열
		// 문자 : 한글자데이터로 ''로 묶어 선언 => char
		// 문자열 : 복수개의 글자로 구성된 자료 (기본타입 x)
		//		  ""로 묶어 선언 => String
		
		char c1 = 'a';
		
		String s1 = "abcdef";
		
		// 제어 문자 : 인쇄할 수 없거나 키보드로 표현할 수 없는 특별한 문자를
		// 가르키며 역슬래시(\)와 한개의 문자와 결합하여 작성
		
		//	\n		: 개행
		//	\r		: 개행
		//	\r\n	: 개행
		//	\t		: 수평탭
		//	\\		: 역슬래시 문자 출력시
		//	\"		: 큰따옴표를 출력시
		//	\'		: 작은따옴표를 출력시
		
		String s2 ="강감찬";
		String s3 ="이순신";
		System.out.println(s2+"\t"+s3);

		System.out.println(s2+"\n"+s3);
		System.out.println(s2+"\r\n\\\""+s3);

		System.out.println("\""+s2+"\"\t\""+s3+"\"");
		
	}
}
