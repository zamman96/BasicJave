package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}

	public void process() {
		List<Map> list = dataInput();
		print(list);
		int max = maxSalary(list);
		System.out.println();
		System.out.println("최대 월급 : " + max);
		System.out.println();
		System.out.println("각 부서별 월급 총합");
		sum(list);
		
//		Map<String, Integer> deptSum = sum(list);
//		Set<String> keySet = deptSum.keySet();
//		Iterator<String> it = keySet.iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			int val = deptSum.get(key);
//			System.out.println(key+" : "+val);
//		}
		
		System.out.println();
		System.out.println("emp_no가 101인 사람 정보");
		search(list);

	}

	// 1. 최대 월급 구하기
	public int maxSalary(List<Map> list) {
		int max = 0;
		for (Map map : list) {
			if ((int) map.get("salary") > max) {
				max = (int) map.get("salary");
			}
		}

		return max;
	}

	// 2. 각 부서별 월급 총합
	public Map<String,Integer> sum(List<Map> list) {
		Map<String,Integer> sum = new HashMap();
		for (Map map : list) {
//			int salary = (int) map.get("salary");
			if(sum.containsKey(map.get("dept"))) {
//				salary+=sum.get("dept");
//				sum.put((String) map.get("dept"), salary);
				int remove = sum.remove(map.get("dept"));
				sum.put((String) map.get("dept"),(int) (map.get("salary"))+remove);
				
			} else {
				sum.put((String) map.get("dept"),(int) (map.get("salary")));
			}
		}
//		for(Entry<String, Integer> entrySet : sum.entrySet()) {
//			System.out.println(entrySet.getKey()+ "\t"+entrySet.getValue());
//		}
		
//		System.out.println(sum);
	
		return sum;
	}

	// 3. emp_no 101인 사람의 정보 출력하기
	public void search(List<Map> list) {
		for (Map map : list) {
			if ((int) map.get("emp_no") == 101) {
				System.out.println(map.get("emp_no") + "\t" + map.get("emp_name") + "\t" + map.get("dept") + "\t"
						+ map.get("salary"));
			}
		}
	}

	public void print(List<Map> list) {
		for (Map map : list) {
			System.out.println(
					map.get("emp_no") + "\t" + map.get("emp_name") + "\t" + map.get("dept") + "\t" + map.get("salary"));
		}
	}

	public List<Map> dataInput() {
//		emp_no	emp_name	dept	salary
//		100		김기훈		영업부	300
//		101		홍성범		기획부	350
//		102		이만수		기획부	500
//		103		강나미		영업부	350
//		109		민병철		총무부	250
		Map p1 = new HashMap();
		p1.put("emp_no", 100);
		p1.put("emp_name", "김기훈");
		p1.put("dept", "영업부");
		p1.put("salary", 300);

		Map p2 = new HashMap();
		p2.put("emp_no", 101);
		p2.put("emp_name", "홍성범");
		p2.put("dept", "기획부");
		p2.put("salary", 350);

		Map p3 = new HashMap();
		p3.put("emp_no", 102);
		p3.put("emp_name", "이만수");
		p3.put("dept", "기획부");
		p3.put("salary", 500);

		Map p4 = new HashMap();
		p4.put("emp_no", 103);
		p4.put("emp_name", "강나미");
		p4.put("dept", "영업부");
		p4.put("salary", 350);

		Map p5 = new HashMap();
		p5.put("emp_no", 109);
		p5.put("emp_name", "민병철");
		p5.put("dept", "총무부");
		p5.put("salary", 250);

		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		return list;
	}
}
