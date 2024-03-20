package kr.or.ddit.study06.sec04;

import java.util.Arrays;

public class MethodExample2 {
	public static void main(String[] args) {
		MethodExample2 me = new MethodExample2();
		int i1 = me.method1();
		System.out.println("method1에서 받은 결과값 : "+i1);
		double d2 = me.method2();
		System.out.println("method2에서 받은 결과값 : "+d2);
		int[] arr3 = me.method3();
		System.out.println("method3에서 받은 결과값 : "+Arrays.toString(arr3));
	}
	public int method1() {
		System.out.println("public int method1()");
		return 20;
	}

	public double method2() {
		System.out.println("public int method2()");
		return 10.5;
	}
	
	public int[] method3() {
		System.out.println("public int method3()");
		int[] arr= {1,2,3};
		return arr;
	}
}
