package kr.or.ddit.study06.sec03;

public class Constructor {

	public static void main(String[] args) {
		Constructor c = new Constructor("오리");
		//생성자가 하나라도 있다면 기본 생성자가 자동으로 만들어지지 않는다
		//그러므로 기본 생성자를 각주 시키면 오류발생
		System.out.println(c.name);
		
		Constructor c2 = new Constructor();
		c2.name = "거위";
	}

	// 기본 생성자
	public Constructor() {
		System.out.println("기본 생성자");
	}
	// 필드로 내용을 저장 보통 이름을 같게 쓴다
	String name;
	
	public Constructor(String name) {
		System.out.println("파라미터가 있는 생성자");
		this.name = name;
		// this 클래스 내부에 있는 name을 의미 >> this.name==String name
		// 우측 name은 클래스변수로 설정된 Constructor(String name)
		// ctrl을 누르고 좌클릭을 통해 연관되어있는지 확인 가능
	}
}
