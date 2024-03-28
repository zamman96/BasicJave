package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample03 {
	public static void main(String[] args) {
		// 회원1 ~ 회원 10까지 입력
		List<String> list = new ArrayList();
		for(int i=1;i<=10;i++) {
			list.add("회원"+i);
		}
		
		// 전체 리스트 출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// index 값을 3입력해서 해당값을 삭제
		String remove = list.remove(3);
		// 삭제한 값을 출력 => ? 님이 탈퇴하셨습니다.
		System.out.println(remove+"님이 탈퇴하셨습니다.");
		
		if(list.contains("회원1")) {
			System.out.println("회원1이 있습니다.");
		}
		if(list.contains("회원4")) {
			System.out.println("회원4이 있습니다.");
		}
	}
}
