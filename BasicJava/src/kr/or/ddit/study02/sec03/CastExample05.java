package kr.or.ddit.study02.sec03;

public class CastExample05 {
	public static void main(String[] args) {
		int i1 = 20;
		int i2 = 24;
		String s = ""+ i1 + i2;
		// String s = i1 + i2 + "" 
		// 44 왼쪽부터 오른쪽으로 진행되기 때문에 앞에 붙여야함
		System.out.println(s);
		
		// String -> double
		// 소숫점 한자리 표기
		String s3 = "314.123";
		double d0 = Double.parseDouble(s3);
		int i3 = (int)(d0*10);
		d0 = i3/10.0;
		System.out.println(d0);
		
		// String 8개 변수를 선언하고
		// 각각을 알맞는 기본타입으로 변환 해보기.
		String a = "1";
		int a1 = Integer.parseInt(a);
		
		String b = "2";
		byte b1 = Byte.parseByte(b);
		
		String c = "3";
		short c1 = Short.parseShort(c);
		
		String d = "4";
		long d1 = Long.parseLong(d);
		
		String e = "5";
		float e1 = Float.parseFloat(e);
		
		String f = "6";
		double f1 = Double.parseDouble(f);
		
		String g = "7";
		char g1 = g.charAt(0);
		
		String h = "true";
		boolean h1 = Boolean.parseBoolean(h);
		
		// int num1, num2 값을 선언한 후
		// num1 나누기 num2 값에 1000을 곱한 정수부분을 출력하시오.
		// 결과값 ex) 3 2 -> 1500
		
		int num1 = 3;
		int num2 = 2;
		
		double div = (double)num1/num2;
		int result = (int)(div*1000);
		System.out.println(result);
	    // int result = (int)(((double)num1/num2)*1000);
		//int result = 1000*num1/num2;

		
		
		
		

	}
}
