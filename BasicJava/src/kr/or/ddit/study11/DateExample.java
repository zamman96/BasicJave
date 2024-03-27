package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
		de.method6();
	}
	
	public void method6() {
		// singleton 형식
		Calendar cal = Calendar.getInstance();
		// 달을 더하고 싶을 땐 MONTH
//		cal.add(Calendar.DATE, 100);
//		cal.set(Calendar.MONTH, Calendar.MARCH);
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(date));
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(last);
	}
	
	public void method5() {
		Date date = new Date();
		// 1000*86400*100 인 경우 long타입에 벗어나므로 정확한 값 출력X
		long time = date.getTime()+1000L*86400*100;
		Date date2 = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(date2));
	}
	
	public void method4() {
		// String 을 입력 받고 해당 날짜와 현재 날짜의 차이를 구하시오
		// ex 20240411
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date_str = "20241022";
		try {
			Date date = sdf.parse(date_str);
			Date cur = new Date();
			Long time = date.getTime()-cur.getTime();
			System.out.println(time/1000/86400);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void method3() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date_str = "20240328";
		try {
			Date date = sdf.parse(date_str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void method2() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy. MM. dd HH:mm:ss");	// SDF + ( ctrl + space )
		String date_str = sdf.format(date);
		System.out.println(date_str);
	}
	
	public void method1() {
		Date date = new Date();
		System.out.println(date);
		
		try {
			//잠깐동안 컴퓨터를 멈춘다 ms기준이므로 1초를 잠시 멈춤
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date date2 = new Date();
		System.out.println(date2);
		
		long time = date2.getTime()-date.getTime();
		System.out.println(time);
	}

}
