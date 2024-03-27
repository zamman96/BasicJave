package kr.or.ddit.study07.sec02;

import java.util.Scanner;

public class UnitExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 마린");
		System.out.println("2. 뮤탈");

		Unit unit = null;
		int sel = 1;
		if (sel == 1) unit = new Marine();
		if (sel == 2) unit = new Mutal();

		while (true) {
			System.out.println("1. 공격, 2. 이동");
			int sel2 = sc.nextInt();
			if (sel2 == 1) unit.attack();
			if (sel2 == 2) unit.move();
		}

	}
}
