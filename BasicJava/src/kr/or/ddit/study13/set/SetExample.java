package kr.or.ddit.study13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * HashSet
 *  - Set 대표 컬렉션
 *  - key 로 이루어짐
 *  - key 값은 중복을 허용하지 않고 순서가 보장되지 않음.
 *  
 *  주요 메소드
 *  .add		: 값 추가
 *  .remove		: 값 삭제
 *  .contains	: 포함여부
 *  .iterator	: 전체 출력을 위한 메소드
 *
 */
public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("가");
		set.add("a");
		set.add("b");
		set.add(1);
		set.add(10.5);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Integer> lotto = new HashSet<Integer>();
		while(lotto.size()<6) {
			lotto.add(new Random().nextInt(45)+1);
		}
		System.out.println(lotto);
	}
}
