package kr.or.ddit.study05.sec03;

public enum Week {
	SUN("일요일"), MON("월요일"), TUE("화요일"), WED("수요일"), 
	THU("목요일"), FRI("금요일"), SAT("토요일");
	
	String hangle;
	
	Week(String hangle){
		this.hangle=hangle;
	}
	
}
