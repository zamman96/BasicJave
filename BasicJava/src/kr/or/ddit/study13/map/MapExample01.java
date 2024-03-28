package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 *	- key와 value로 이루어짐
 *  - key 값은 중복을 허용하지 않고 순서가 보장되지 않음.

 *  
 *  Map 타입의 대표 컬렉션
 *  
 *  주요 메소드
 *   .put		: 데이터 입력 key 값은 중복되지 않음.
 *   .get		: 입력받은 value 값을 key값을 통해 꺼내올 수 있음.
 *   .keySet	: key 로 이루어진 hashSet 값을 가져옴
 *   .remove	: value 값을 리턴 받고 삭제
 *   .size		: 크기 반환
 *   .containsKey	: 키값이 존재하는지 확인.
 *   
 */
public class MapExample01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("홍길동", 95);
		map.put("이순신", 85);
		map.put("정몽주", 75);
		map.put("이성계", 87);
		
		// 홍길동 점수
		if(map.containsKey("홍길동2")) {
		int hScore = map.get("홍길동2");
		System.out.println(hScore);
		} else {
			System.out.println("해당값이 존재하지 않습니다.");
		}
	}
}
