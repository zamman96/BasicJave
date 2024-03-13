package kr.or.ddit.homework;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {
		Date date = new Date();
		//Ctrl + Shift + O
	
		// date.getTime()의 경우는
		// 기준 시간으로 부터 현재까지 지난시간이다.
		// time 단위는 ms 이다.
		
		long time = date.getTime();
		
		//기준일로 부터 몇년 몇일 몇시간 몇분 몇초가 지났습니다.
		
		
		//풀이 1. 나머지를 활용한 시간 구하는 법
		long year= time/1000/60/60/24/365;
		long day = time/1000/60/60/24%365;
		long hour= time/1000/60/60%24;
		long min = time/1000/60%60;
		long sec = time/1000%60;
		
		System.out.println("기준일로 부터 "+year+"년 "+day+"일 "+hour+"시간"+min+"분 "+sec+"초가 지났습니다.");

		
		//풀이2. 직접 빼서 시간을 구하는 법
		long sec1 = time/1000;
		long min1 = sec1/60;
		long hour1= min1/60;
		long day1 = hour1/24;
		long year1= day1/365;
		
		long sec2 = min1*60;
		long min2 = hour1*60;
		long hour2 = day1*24;
		long day2 = year1*365;
				
		System.out.println("기준일로 부터 "+year1+"년 "+(day1-day2)+"일 "+(hour1-hour2)+"시간"+(min1-min2)+"분 "+(sec1-sec2)+"초가 지났습니다.");
		
		//풀이3. 윤년 추가하여 구하기 (day 값에 year/4한 값만큼 추가로 더함)  >> 맞는지 모르겠습니다...
		long sec3 = time/1000;
		long min3 = sec3/60;
		long hour3= min3/60;
		long day3 = hour3/24;
		long year3= day3/(1461/4);

		long sec4 = min3*60;
		long min4 = hour3*60;
		long hour4 = day3*24;
		long day4 = year3*(1461/4);
			
		
		System.out.println("기준일로 부터 "+year3+"년 "+(day3-day4+year3/4)+"일 "+(hour3-hour4)+"시간"+(min3-min4)+"분 "+(sec3-sec4)+"초가 지났습니다.");

//		long sec = time*1000;
//		long min = sec*60;
//		long hour = min*60;
//		long day = hour*24;
//		long year = day*365;
//		
//		long years = time/year;
//		time=time-year*years;
//		
//		long days = time/day;
//		time = time - day*days;
//		
//		long hours = time/hour;
//		time = time - hour*hours;
//		
//		long mins = time/min;
//		time = time - min*mins;
//		
//		long secs = time/sec;
//		time = time - sec*secs;
		
		
		
		
		
	}
}
