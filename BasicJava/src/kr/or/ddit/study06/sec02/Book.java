package kr.or.ddit.study06.sec02;

public class Book {
	// 책 이름, 저자, 출판사, 출판일을 각각 필드로 만들기
	String name;
	String author;
	String pub;
	String pubDate;
	// BookExample class 에서 Book 2개 생성 및 출력
	@Override
	public String toString() {
		return "책 [name=" + name + ", author=" + author + ", pub=" + pub + ", pubDate=" + pubDate + "]";
	}

}
