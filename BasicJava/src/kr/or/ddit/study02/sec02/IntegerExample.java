package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
		// 정수형
		// 1. byte	: 1byte(-128 ~ 127)
		// 2. short : 2byte(-32768 ~ 32767)
		// 3. int	: 4byte(-2^31~2^31-1)
		/* 4. long	: 8byte(-2^61~2^61-1)
					    데이터 끝에 L(l)을 추가 		*/
		
		byte b1 = 127;
		System.out.println("b1 = "+b1);
//		byte b2 = 128;				범위 초과

		short s1 = 100;
		System.out.println("s1 = "+s1);
		short s2 = (short)(s1 + 10);		//캐스팅
		System.out.println("s2 = "+s2);
		
		int i1 = 100;
		System.out.println("i1 = " + i1);
		int var1 = 200;					//10진법
		int var2 = 0203;				//8진수 0- 
		int var3 = 0x74a;				//16진수 0x-
		int var4 = 0b11011;				//2진수 0b-
		System.out.println("var1="+var1);
		System.out.println("var2="+var2);
		System.out.println("var3="+var3);
		System.out.println("var4="+var4);
		
		long l1 = 10000;
		System.out.println("l1="+l1);
		long l2 = 100000000000L; 		//길이가 길면 L표시
		System.out.println("l2="+l2);
		long l3 = l1+1000;
		System.out.println("l3="+l3);
		
	}
}
