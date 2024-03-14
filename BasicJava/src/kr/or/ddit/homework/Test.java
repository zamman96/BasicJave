package kr.or.ddit.homework;

public class Test {
	public static void main(String[] args) {
		String a = "-3+4*5.2+8";
		//"-3+4*5.2+8";
		String num = a.replaceAll("[^(.-9)]", " ").trim(); // 앞자리 -가 공백으로 변함으로 써 지워줌
		num = num.replaceAll("[/]", " ").trim();
		String numarr[] = num.split(" "); // {3,4,5.2,8} 0 1 2 3

		String sign = a.replaceAll("[0-9]", " 0 ").trim();

		sign = sign.replace(" . 0", "");
		String signarr[] = sign.split(" ");// {-,0,+,0,*,0,+} 

		
		// * /는 먼저 계산후에 뒤에숫자에 저장 앞숫자는 0
		// -는 뒤에 숫자에 -곱
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
