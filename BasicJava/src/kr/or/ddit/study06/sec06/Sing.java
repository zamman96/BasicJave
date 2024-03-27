package kr.or.ddit.study06.sec06;

public class Sing {
	// 노래 이름
	// 가사
	// 가수
	// 작곡가
	// 발매연도	
	private String name;
	private String lyrics;
	private String singer;
	private String composer;
	private int year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


}
