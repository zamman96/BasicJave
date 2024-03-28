package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExample02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();

		// 랜덤으로 5개 값을 입력하고 출력하시오
		// 5개 값의 총합을 구하시오.
		for (int i = 0; i < 5; i++) {
			int ran = new Random().nextInt(49) + 1;
			list.add(ran);
		}
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			System.out.print(list.get(i));
			if(i!=list.size()-1) System.out.print("+");
		}
		
		System.out.println(" = "+sum);
	}
}
