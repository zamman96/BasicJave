package kr.or.ddit.study06.sec03;

public class Korean {
	// 국적 이름 나이를 각 필드로 만들고
	String nation="한국";
	String name;
	int age;
	
	
	// 생성자를 통해 데이터 입력 해보기
	public Korean(String name, int age){
		this.name=name;
		this.age=age;
	}


	@Override
	public String toString() {
		return "Korean [nation=" + nation + ", name=" + name + ", age=" + age + "]";
	}
}
