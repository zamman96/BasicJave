package kr.or.ddit.study06.sec02;

public class BookExample {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name = "책이름";
		b1.author = "저자";
		b1.pub = "출판사";
		b1.pubDate = "2024년3월18일";
		
		System.out.println(b1);
	}
}
