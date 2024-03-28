package kr.or.ddit.study13.list;

public class Array {
	String[] list;
	int cur = 0;

	Array(){
		list = new String[10];
	}
	
	// 배열 길이를 알고 있다면 해당값을 입력해 효율적으로 해결할 수 있다 
	Array(int length){
		list = new String[length];
	}
	
	public void add(String str) {
		// 배열을 크기가 넘어가면 더이상 추가가 안됨으로 크기가 더 많은 배열을 만들어서
		// 기존 배열을 복사하는 방법으로만 가능하다
		if(cur == list.length) {
			String[] temp = new String[list.length+10];
			System.arraycopy(list, 0, temp, 0, list.length);
			list = temp;
		}
		list[cur++] = str;
	}
	
	public String remove(int index) {
		String[] temp = new String[list.length];
		String remove = list[index];
		int add=0;
		for(int i =0; i<temp.length; i++) {
			if(i==index) add=1;
			if(i+add == temp.length-1) break;
			temp[i] = list[i+add];
		}
		list = temp;
		
		return remove;
	}
	
	public String get(int index) {
		return list[index];
	}
	
	public int size() {
		return cur;
	}
}


