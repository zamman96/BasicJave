package kr.or.ddit.study06.sec06;

public class PersonExample {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("오리");
		p.setAge(20);
		
		System.out.println(p.getName()+", "+p.getAge());
	}
}
