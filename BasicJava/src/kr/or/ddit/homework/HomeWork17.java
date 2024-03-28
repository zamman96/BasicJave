package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();

	public static void main(String[] args) {
		HomeWork17 hw = new HomeWork17();
		hw.process();
	}

	public void process() {
		while (true) {
			// < 이전달, > 다음달 출력하기
			int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			int month = cal.get(Calendar.MONTH)+1;
			System.out.println("----------------------" + cal.get(Calendar.YEAR) + "년 " + month
					+ "월----------------------");
			System.out.println("<이전달\t\t\t\t\t\t다음달>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("-----------------------------------------------------");
			cal.set(Calendar.DATE, 1);
			int week = cal.get(Calendar.DAY_OF_WEEK);
			for(int i=1; i<week;i++) System.out.print("\t");

			for (int i = 1; i <= last; i++) {
				System.out.print(i+"\t");
				week = cal.get(Calendar.DAY_OF_WEEK);
				if (week == 7) System.out.println();
				
//				if(i!=last)	cal.add(Calendar.DAY_OF_WEEK,1);
				cal.add(Calendar.DAY_OF_WEEK,1);
			}
			// 다음달로 넘어감으로 1일 빼기
			cal.add(Calendar.DAY_OF_WEEK,-1);
			
			System.out.println();
			String sel = sc.next();
			if(sel.equals("<")) {
				cal.add(Calendar.MONTH, -1);
			} else if(sel.equals(">")) {
				cal.add(Calendar.MONTH, 1);
			} else break;
			
		}
	}

}
