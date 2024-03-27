package kr.or.ddit.study08;

public class AnimalExample {
	public static void main(String[] args) {
		Animal ani = null;
		
		int sel = 1;
		if(sel==1) ani = new Cat();
		if(sel==2) ani = new Dog();
		
		ani.cry();
	}
}
