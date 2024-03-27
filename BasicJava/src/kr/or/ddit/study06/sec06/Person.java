package kr.or.ddit.study06.sec06;

public class Person {
	private String name;
	private int age;
	
	// getter
	public String getName() {
		return name;
	}
	// setter
	public void setName(String name) {
		if(name.length()<1||name.length()>5) {
			System.out.println("유효하지 않는 이름입니다.");
			return;
		}
		this.name = name;
	}
	// getter
	public int getAge() {
		return age;
	}
	// setter 접근할 수 있게함
	public void setAge(int age) {
		if(age<0 || age > 122) {
			System.out.println("유효하지 않은 나이입니다.");
			return;
		}
		this.age = age;
	}	
}
