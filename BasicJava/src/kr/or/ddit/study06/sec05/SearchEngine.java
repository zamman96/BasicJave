package kr.or.ddit.study06.sec05;

public class SearchEngine {
	private static SearchEngine instance;

	private SearchEngine() {
		System.out.println("파일 리딩중");
		for(int i =0; i<20; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static SearchEngine getInstance() {
		if (instance == null) {
			instance = new SearchEngine();
		}
		return instance;
	}
}
