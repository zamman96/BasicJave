package kr.or.ddit.study02.sec01;

//클래스 블록 시작
public class JavaVar2 {
	int c = 10;
	
	// 메인 메소드 블록 시작
	public static void main(String[] args) {
		int a = 10;
		
		// 1번 블록 시작
		{
			int b = 7;			//1번 블록 시작 전에 b라는 변수가 선언되었다면 불가능
			System.out.println(a);
		// 1번 블록 종료
		}
		
		int d = 8;
		// 2번 블록 시작
		{
			// 사용 가능한 변수 d
			int e = 10;
			{
				// 사용 가능한 변수 d e
				int f = 12;
				// 사용 가능한 변수 d e f
			}
			// 사용 가능한 변수 d e
		// 2번 블록 종료
		}
		// 사용 가능한 변수 d

		int b = 5;				//1번블록의 변수 b와 관계없는 변수
		System.out.println(b);
		// 메인 메소드 블록 종료
	}

	// 메소드1 블록 시작
	public void method1() {
		int a = 5;				//메인 메소드의 변수 a와는 관계없는 변수
		System.out.println(c);	//클래스 변수 c는 존재 가능
	// 메소드1 블록 종료
	}

//클래스 블록 종료
}
