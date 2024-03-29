package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MapExample04 obj = new MapExample04();
		obj.process();
	}

	List<Map<String, String>> list;

	public void process() {
		// 주차요금 계산
		list = dataInput();
		// 주차요금 전체 정산
		allPay(list);

		// 풀이 2 생성자로 set
		Map<String, Integer> car = new HashMap();
		for (Map<String, String> map : list) {
			String carNum = map.get("차량번호");
			car.put(carNum, 0);
		}
		Set keySet = car.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String carNo = it.next();
			System.out.println(carNo + " : " + result(carNo) + "원");
		}

	}

	// 방법 2 차량번호 > 주차요금 리턴 메소드로 만들어 저장
	public int result(String carNum) {
		int min = getMin(carNum);
		return pay(min);
	}

	// 전체 정산 메소드
	public Map<String, Integer> allPay(List<Map<String, String>> list) {
		Map<String, Integer> car = new HashMap();
		for (Map<String, String> map : list) {
			String carNum = map.get("차량번호");
			car.put(carNum, pay(getMin(carNum)));
//			car.put(carNum, result(carNum));
		}
		System.out.println(car);
		return car;
	}

	public int pay(int min) {
		// 기본 요금 5000, 기본시간 180
		// 단위 시간 10분, 단위 요금 600
		int pay = 5000;
		if (min > 180) {
			pay += 600 * (min - 180) / 10;
		}
		return pay;
	}

	// carNum와 같은 차량번호를 찾아서 입차시 값을 저장하고 출차시 값을 빼서 총합하는 메소드
	public int getMin(String carNum) {
		int sum = 0;
		int temp = 0;
		for (Map<String, String> map : list) {
			String cn = map.get("차량번호");
			String time = map.get("시각");
			String inout = map.get("내역");
			// 차량번호가 다르면 처음으로 돌아가 다시 검색
			if (!carNum.equals(cn))
				continue;
//			System.out.println(map);
			if (inout.equals("입차")) {
				temp = time2Int(time);
			}
			if (inout.equals("출차")) {
				int park = time2Int(time) - temp;
				sum += park;
			}

		}
		return sum;
	}

	// split로 시간과 분을 쪼개서 분으로 반환하는 메소드
	public int time2Int(String time) {
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min = Integer.parseInt(tokens[1]);
		return hour * 60 + min;
	}

	public List<Map<String, String>> dataInput() {
		List<Map<String, String>> list = new ArrayList();
//		시각		차량번호	내역
//		05:34	5961	입차
//		06:00	0000	입차
//		06:34	0000	출차
//		07:59	5961	출차
//		07:59	0148	입차
//		18:59	0000	입차
//		19:09	0148	출차
//		22:59	5961	입차
//		23:00	5961	출차
//		23:00	0000	출차
		Map<String, String> m1 = new HashMap();
		m1.put("시각", "05:34");
		m1.put("차량번호", "5961");
		m1.put("내역", "입차");
		list.add(m1);

		Map<String, String> m2 = new HashMap();
		m2.put("시각", "06:00");
		m2.put("차량번호", "0000");
		m2.put("내역", "입차");
		list.add(m2);

		Map<String, String> m3 = new HashMap();
		m3.put("시각", "06:34");
		m3.put("차량번호", "0000");
		m3.put("내역", "출차");
		list.add(m3);

		Map<String, String> m4 = new HashMap();
		m4.put("시각", "07:59");
		m4.put("차량번호", "5961");
		m4.put("내역", "출차");
		list.add(m4);

		Map<String, String> m5 = new HashMap();
		m5.put("시각", "07:59");
		m5.put("차량번호", "0148");
		m5.put("내역", "입차");
		list.add(m5);

		Map<String, String> m6 = new HashMap();
		m6.put("시각", "18:59");
		m6.put("차량번호", "0000");
		m6.put("내역", "입차");
		list.add(m6);

		Map<String, String> m7 = new HashMap();
		m7.put("시각", "19:09");
		m7.put("차량번호", "0148");
		m7.put("내역", "출차");
		list.add(m7);

		Map<String, String> m8 = new HashMap();
		m8.put("시각", "22:59");
		m8.put("차량번호", "5961");
		m8.put("내역", "입차");
		list.add(m8);

		Map<String, String> m9 = new HashMap();
		m9.put("시각", "23:00");
		m9.put("차량번호", "5961");
		m9.put("내역", "출차");
		list.add(m9);

		Map<String, String> m10 = new HashMap();
		m10.put("시각", "23:00");
		m10.put("차량번호", "0000");
		m10.put("내역", "출차");
		list.add(m10);

		return list;
	}
}
