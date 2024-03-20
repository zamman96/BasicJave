package kr.or.ddit.study06.sec04;

public class MethodExample4 {
	public static void main(String[] args) {
		MethodExample4 me = new MethodExample4();
		int[] array = {1,2,3,4,5};
		me.addArray(array);
		int[] array2 = {1,2,3};
		me.addArray(array2);
		
		me.addArray2(1,2,3);
		me.addArray2(1);
	}
	// 배열 값을 더한 결과 리턴
	public int addArray(int[] array) {
		int sum = 0; 
		for(int num : array) {
			sum+=num;
		}
		System.out.println(sum);
		return sum;
	}
	
	public int addArray2(int ... array) {
		int sum = 0; 
		for(int num : array) {
			sum+=num;
		}
		System.out.println(sum);
		return sum;		
	}
	
	
}
