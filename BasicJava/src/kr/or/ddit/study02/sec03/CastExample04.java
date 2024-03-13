package kr.or.ddit.study02.sec03;

public class CastExample04 {
	public static void main(String[] args) {
		// String -> int
		String s1 = "1234";
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.valueOf(s1);
		
		String s2 = "122";
		byte b1 = Byte.parseByte(s1);
		byte b2 = Byte.valueOf(s1);		
	}
}
