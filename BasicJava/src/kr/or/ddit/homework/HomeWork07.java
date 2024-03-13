package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.process();
	}
	
	public void process() {
		/*
		 *   여러 단어가 제공되며  이중 임의의 단어가 선택된다. 
		 *   
		 *   사용자는 이를 보고 원래의 단어를 입력한다. 
		 *   사용자가 단어를 맞출때까지 반복하며 단어를 맞추었을때 시도 횟수 출력
		 */
		String[] words = 
					  { "deserve", "cart", "he", "jet", "fright", "frustrate", "blossom", "scrub", "choir", "amount",
						"mechanism", "long", "chip", "blink", "too", "chop", "pave", "flavor", "habitat", "neither",
						"slip", "paragraph", "apply", "pad", "role", "from", "peak", "happen", "blonde", "organ",
						"format", "assess", "laugh", "manipulat", "meat", "column", "jar", "undergo", "fan", "through",
						"tend", "consensus", "quit", "oblige", "mood", "resort", "knight", "hat", "broad", "theater",
						"versus", "against", "via", "quarter", "hundred", "decade", "teenage", "billion", "dozen",
						"century", "dose", "double", "may", "the", "could", "should", "would", "dare", "shall", "can",
						"ought", "bit", "whereas", "criteria", "protein", "notion", "without" };
                   
		int ran = new Random().nextInt(words.length);
		//랜덤 단어 설정
		String select = words[ran];
		
		/*
		 *  String -> char 배열로 바꿔줌
		 *  toCharArray
		 */
		char[] ch = select.toCharArray();
		
		/*
		 *  문자 섞기 
		 */		
		for(int i=0; i< ch.length-1; i++) {
			for(int j=0; j<ch.length-1; j++) {
				char temp = ch[j];
				ch[j]=ch[j+1];
				ch[j+1] =temp;
			}
		}

		
		// 문제 값 저장
		String que = "";
			for(int i=0; i< ch.length; i++) {
				que += ""+ ch[i];
			}
		
		int cnt = 0;
		System.out.println("올바른 단어 배열을 찾으시오.");
		System.out.println("힌트 : " + que);
		while(true) {
			/*
			 *   ch 배열 출력하기 
			 *   정답 : abort
			 *   섞인 단어 : bator
			 */
			System.out.println("답을 입력하세요.");
			String answer = sc.nextLine();
			if(answer.equals(select)) {
				break;
			} else {
				System.out.println("틀린 답입니다.");
				System.out.println("----------------");
				cnt++;
			}
		}
		System.out.println(cnt + "회 시행되었습니다.");
		System.out.println(" 정답입니다.");
	}
}
	
	
	
	
