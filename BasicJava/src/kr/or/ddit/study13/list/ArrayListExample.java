package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList	
 * 	- 1차원 배열구조
 *  - 중복을 허용하고 순서화 제공
 *  - List 타입의 대표 컬렉션
 *
 *  주요 메소드
 *  . add 		: 데이터 삽입
 *  . clear 	: 초기화
 *  . contains 	: 포함 여부 확인
 *  . get 		: idx 자료 변환
 *  . remove 	: idx 자료 반환 후 삭제
 *  . size		: 배열 길이
 */
public class ArrayListExample {
	public static void main(String[] args) {
//		Array a = new Array();
//		for(int i=0; i<30; i++) {
//			a.add("회원"+i);
//		}
//		
//		for(int i=0; i<a.size(); i++) {
//			System.out.println(a.get(i));		
//		}
		
		List list = new ArrayList();
		list.add(10);
		list.add(10.5);
		list.add("test");
		list.add(new Test());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}

class Test{
	String a = "t";
	String b = "e";
	String c = "s";
	String d = "t";
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
}
