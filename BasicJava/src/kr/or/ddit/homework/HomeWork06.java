package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
//		obj.method8();
//		obj.method9();
		obj.method10();
	}

	private void method1() {
		/*
		 * 스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단을 출력하시오
		 * 
		 *  3*1 =3	
			3*2 =6	
			3*3 =9	
			3*4 =12
			3*5 =15
			3*6 =18
			3*7 =21
			3*8 =24
			3*9 =27
		 */
		
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+" ="+num*i);
		}
		
	}
	
	private void method2() {
		/*
		 *  for 문 2개를 이용하여 구구단 전체를 출력하시오.
		 * 
		    2*1 =2	3*1 =3	..............	
			2*2 =4	3*2 =6	4*2 =8	5*2 =10	6*2 =12	7*2 =14	8*2 =16	9*2 =18	
			2*3 =6	3*3 =9	4*3 =12	5*3 =15	6*3 =18	7*3 =21	8*3 =24	9*3 =27	
			2*4 =8	3*4 =12	4*4 =16	5*4 =20	6*4 =24	7*4 =28	8*4 =32	9*4 =36	
			2*5 =10	3*5 =15	4*5 =20	5*5 =25	6*5 =30	7*5 =35	8*5 =40	9*5 =45	
			2*6 =12	3*6 =18	4*6 =24	5*6 =30	6*6 =36	7*6 =42	8*6 =48	9*6 =54	
			2*7 =14	3*7 =21	4*7 =28	5*7 =35	6*7 =42	7*7 =49	8*7 =56	9*7 =63	
			2*8 =16	3*8 =24	4*8 =32	5*8 =40	6*8 =48	7*8 =56	8*8 =64	9*8 =72	
			2*9 =18	3*9 =27	4*9 =36	5*9 =45	6*9 =54	7*9 =63	8*9 =72	9*9 =81	
		 */
		for(int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+" ="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	private void method3() {
		/*
		 *  for 문 2개를 이용하여 구구단 전체를 출력하시오.
		 *  스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단은 제외. 
		 *  ex ) 입력 3 
   			2*1 =2	..............	
			2*2 =4	4*2 =8	5*2 =10	6*2 =12	7*2 =14	8*2 =16	9*2 =18	
			2*3 =6	4*3 =12	5*3 =15	6*3 =18	7*3 =21	8*3 =24	9*3 =27	
			2*4 =8	4*4 =16	5*4 =20	6*4 =24	7*4 =28	8*4 =32	9*4 =36	
			2*5 =10	4*5 =20	5*5 =25	6*5 =30	7*5 =35	8*5 =40	9*5 =45	
			2*6 =12	4*6 =24	5*6 =30	6*6 =36	7*6 =42	8*6 =48	9*6 =54	
			2*7 =14	4*7 =28	5*7 =35	6*7 =42	7*7 =49	8*7 =56	9*7 =63	
			2*8 =16	4*8 =32	5*8 =40	6*8 =48	7*8 =56	8*8 =64	9*8 =72	
			2*9 =18	4*9 =36	5*9 =45	6*9 =54	7*9 =63	8*9 =72	9*9 =81	
		 */
		int num = sc.nextInt();
		for(int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				if(j!=num) {
				System.out.print(j+"*"+i+" ="+i*j+"\t");
				}
			}
			System.out.println();
		}
	}
	
	private void method4() {
		/*
		 * 양의 정수 n이 매개변수로 주어질때 
		 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수 합
		 *  -> n = 5 
		 *     1 + 3 + 5 = 9
		 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수제곱의 합
		 *  -> n = 4 
		 *     2*2 + 4*4 = 20
		 */
		int n = (int)(Math.random()*100)+1;
		int sum = 0;
		if(n%2!=0) {				
			for(int i=1; i<=n;i+=2) {
				sum+=i;
			}
		} else {
			for(int i=2; i<=n;i+=2) {
				sum+=i*i;
			}
		}
		System.out.println(n);
		System.out.println(sum);
	}
	
	public void method5() {
		/*
		 *   키보드로 돈을 입력 받아 화폐단위별로 개수를 구하시오.
		 *   ex ) 77550 -> 10000 7개 5000 1개 1000 2개 500 1개 50원 1개
		 */
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10};
		int money = sc.nextInt();
		String sum = "";
		for(int i = 0; i<coin.length;i++) {
			if(money/coin[i]!=0) {
			sum += ""+coin[i]+" "+money/coin[i]+"개 ";
			money%=coin[i];}
		}
		System.out.println(sum);
	}

	public void method6() {
		//1차원 배열 건너 뛰기
		int[][] arr = new int[3][];
		
		int[] stu1 = new int[4];
		int[] stu2 = new int[5];
		int[] stu3 = new int[4];
		arr[0] = stu1;
		arr[1] = stu2;
		arr[2] = stu3;
		System.out.println(Arrays.deepToString(arr));
	}

	public void method7() {
		int[][] arr1 = new int[5][5];
		// 1,2,3,4,5
		// 6,7,8,9,10
		// 11,12,13,14,15
		// 16,17,18,19,20
		// 21,22,23,24,25
		
		int a=1;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j]=a;
				//arr1[i][j]= i*5 +j+1;
				a++;
			}
		}
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
	}
		
	public void method8() {
		int[][] arr2 = new int[5][5];
		// 1,6,11,16,21
		// 2,7,12,17,22
		// 3,8,13,18,23
		// 4,9,14,19,24
		// 5,10,15,20,25
		
		int a=1;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[j][i]=a;
				a++;
			}
		}
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	public void method9() {
		int[][] arr3 = new int[5][5];
		// 1,2,3,4,5
		// 10,9,8,7,6
		// 11,12,13,14,15
		// 20,19,18,17,16
		// 21,22,23,24,25
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				if(i%2==0) {
					arr3[i][j]=i*5+1+j;
				} else {
					arr3[i][4-j]=5*i+j+1;
				}
			}
		}
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}	
	}
		
	public void method10() {
		int[][] arr3 = new int[5][5];
		// 1,10,11,20,21
		// 2,9,12,19,22
		// 3,8,13,18,23
		// 4,7,14,17,24
		// 5,6,15,16,25
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				if(i%2==0) {
					arr3[j][i]=i*5+1+j;
				} else {
					arr3[j][i]=5*i+5-j;
				}
			}
		}
		
//		for(int i=0; i<arr3.length; i++) {
//			for(int j=0; j<arr3[i].length; j++) {
//				if(j%2==0) {
//					arr3[i][j]=j*5+1+i;
//				} else {
//					arr3[i][j]=5*(j+1)-i;
//				}
//			}
//		}
		
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}	
	}
}

