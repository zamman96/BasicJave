package kr.or.ddit.study02.sec03;

public class CastExample02 {
	public static void main(String[] args) {
		// short -> int 변환하기
		short a = 10;			
		int b = a;				//자동 타입 변환
		
		// int - > short 변환하기
		int c = 5000000;		//short 범위 초과 (overflow)
		short d = (short) c;		
		
		// char -> int 변환하기
		char e = 'A';
		int f = e;				//int 값이 더 크기때문에 자동 타입 변환
		
		// int -> char 변환하기
		int g = 65;
		char h = (char)g;
		
		// byte -> char 변환
		byte i = 10;
		char j = (char)i;		//byte는 음수값을 포함하고 있기때문에 자동타입변환X
		
		// char -> byte 변환
		char k = 'a';
		byte l = (byte)k;		
	}
}
