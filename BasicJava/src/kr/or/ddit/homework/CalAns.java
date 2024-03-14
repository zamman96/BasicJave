package kr.or.ddit.homework;

public class CalAns {
	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.process();
	}

	public void process() {
		String a = "-3+4*5.2+8";
		String num = a.replaceAll("[^.-9]", " ").trim(); // 앞자리 -가 공백으로 변함으로 써 지워줌
		num = a.replaceAll("[/]", " ").trim();
		String numarr[] = num.split(" "); //{3,4,5.2,8}
		
		String sign = a.replaceAll("[0-9]", "0").trim();
		sign = sign.replace(".0","");
		String signarr[] = sign.split(" ");//{-,+,*,+}
		
		double result = result(a);

	}

	public double result(String s) {
		return 0;
	}
}
