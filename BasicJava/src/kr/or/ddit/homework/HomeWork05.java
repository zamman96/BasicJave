package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		obj.method6();
		obj.method7();
	}
	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<=row;i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		int row = sc.nextInt();
		for(int i=0; i<=row;i++) {
        	// 공백 i i-1 ... 2 1
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		int row = sc.nextInt(); 
        // 공백 1 2 ... i-1 i
		for(int i=0; i<=row;i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=row;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		int row = sc.nextInt();
		for(int i=0;i<=row;i++) {
        	// 공백 i i-1 ... 1 0
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
            // 별표 갯수 1 ... i*2-1
			for(int j=0; j<(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
		int row = sc.nextInt();
		for(int i=0;i<=row;i++) {
        	// 공백 0 1 ... i
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
            // 별표 갯수 i*2-1 ... 1
			for(int j=(row-i)*2-1; j>0; j--) {
				//for (int j=1; j<=(row-i-1)*2+1;j++)
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
		int row = sc.nextInt();
		
		//풀이1
//		for(int i=0; i<row;i++) {
//			System.out.print("*");
//				// 첫번째줄 / 마지막번째 줄 *(row-2개 출력)
//				if ((i == 0) || (i == row-1)) {
//					for (int j = 0; j < row - 2; j++) {
//						System.out.print("*");
//					}
//				// 중간 공백 (row-2개 출력)
//				} else {
//					for (int j = 0; j < row - 2; j++) {
//						System.out.print(" ");
//					}
//				}
//			// 1개일 때 X
//			if(row!=1) System.out.println("*");
		
		//풀이2
			//1번째줄
			for(int i=0; i<row; i++) System.out.print("*");
			System.out.println();
			//2번째줄 ~ 마지막 -1 줄
			for(int i=1;i<row-1;i++) {
				System.out.print("*");
				//row-2개의 공백 출력
				for(int j=1;j<row-1; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			//마지막줄
			for(int i=0; i<row;i++) System.out.print("*");
		
		}
}


