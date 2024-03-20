package kr.or.ddit.homework;

public class HomeWork08_01 {
	public static void main(String[] args) {
		String a = "-3+4*5.2+8";
		String num = a.replaceAll("[^(.-9)]", " ").trim(); // 앞자리 -가 공백으로 변함으로 써 지워줌
		num = num.replaceAll("[/]", " ").trim(); // .~9 사이엔 /도 속하므로 /도 제거
		String numarr[] = num.split(" "); // {3,4,5.2,8} 

		String sign = a.replaceAll("[0-9]", " 0 ").trim();
		sign = sign.replace(" . 0", "");
		String signarr[] = sign.split(" ");// {-,0,+,0,*,0,+} > 0일 때 표현하기 위함


		// * /는 먼저 계산후에 뒤에숫자에 저장 앞숫자는 0 반환
		// -는 뒤에 숫자에 -붙이기
		// 나머지 숫자 더하기
		
		
		// * / 계산
		for (int i = 0; i < signarr.length; i++) {
			if (signarr[i].equals("*")) {
				if (signarr[0].equals("-")) {
					numarr[i / 2] = "" + Double.parseDouble(numarr[i / 2 - 1]) * Double.parseDouble(numarr[i / 2]);
					numarr[i / 2 - 1] = "0";
				} else {
					numarr[i / 2 + 1] = "" + Double.parseDouble(numarr[i / 2]) * Double.parseDouble(numarr[i / 2 + 1]);
					numarr[i / 2] = "0";
				}
			} else if (signarr[i].equals("/")) {
				if (signarr[0].equals("-")) {
					numarr[i / 2] = "" + Double.parseDouble(numarr[i / 2 - 1]) / Double.parseDouble(numarr[i / 2]);
					numarr[i / 2 - 1] = "0";
				} else {
					numarr[i / 2 + 1] = "" + Double.parseDouble(numarr[i / 2]) / Double.parseDouble(numarr[i / 2 + 1]);
					numarr[i / 2] = "0";
				}
			}
		}
		//-부호일때 더하고 0일때 더하기
		double result = 0.0;
		int j = 0;
		for (int i = 0; i < signarr.length; i++) {
			if (signarr[i].equals("-")) {
				numarr[j]="-"+numarr[j];
				} else if (signarr[i].equals("0")) {
				result+=Double.parseDouble(numarr[j]);
				j++;
			}
		}
		System.out.println(a+" = "+result);
		// - 계산
		
	}		
}



// 문제
//package kr.or.ddit.homework;
//
//public class Cal {
//	public static void main(String[] args) {
//		Cal cal = new Cal();
//		cal.process();
//	}
//
//	public void process() {
//		String a = "-3+4*5.2+8";
//
//		double result = result(a);
//
//	}
//
//	public double result(String s) {
//		return 0;
//	}
//}
