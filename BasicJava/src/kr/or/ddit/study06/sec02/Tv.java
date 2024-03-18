package kr.or.ddit.study06.sec02;

public class Tv {
	String company;
	int year;
	int size;
	@Override
	//부모 클래스에있는 내용을 재가공
	public String toString() {
		return "Tv [company=" + company + ", year=" + year + ", size=" + size + "]";
	}
	
	// alt + shift + s
	// toString
}
