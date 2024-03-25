package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork15 {
	Scanner sc = new Scanner(System.in);
	Product[] prodList = new Product[100];
	int cur = 0;
	
	public static void main(String[] args) {
		HomeWork15 obj = new HomeWork15();
		obj.process();
	}
	// 초기 상품
	public HomeWork15() {
		Product prod1 = new Product("삼각김밥", 1000);
		prodList[cur++] = prod1;
		Product prod2 = new Product("커피", 3000);	
		prodList[cur++] = prod2;
	}
	
	public void process() {
		while(true) {
		System.out.println("1. 관리자");
		System.out.println("2. 회원");
		// 1. 관리자
		// 2. 회원
		// 3. 종료
		int sel = sc.nextInt();
		if(sel ==1) admin();
		if(sel ==2) member();
		if(sel ==3) break;
		}
	}
	
	public void member() {
		while(true) {
		System.out.println("1. 상품 구매");
		System.out.println("2. 홈");
		int sel = sc.nextInt();
		if(sel ==1) purchase();
		if(sel ==2) process();
		}
		
		// 1. 상품 구매
		//	-> 상품 리스트 출력 후 -> 상품번호 선택
		//	-> 상품수량 입력 -> 상품 가격 * 상품 수량 금액 출력 하기
		// 2. 홈
	}
	
	
	public void purchase() {
		print();
		System.out.println("구매할 상품번호를 입력하세요");
		int num = sc.nextInt();
		System.out.println("구매할 수량을 입력해주세요");
		int qty = sc.nextInt();
		System.out.println("상품 가격 : "+qty*prodList[num-1].price);
		return;
	}
	
	public void admin() {
		while(true) {
		System.out.println("1. 상품 등록");
		System.out.println("2. 상품 삭제");
		System.out.println("3. 상품 변경");
		System.out.println("4. 상품 리스트");
		System.out.println("5. 홈");
		int sel = sc.nextInt();
		if(sel ==1) registration();
		if(sel ==2) remove();
		if(sel ==3) update();
		if(sel ==4) print();
		if(sel ==5) process();
		}
		
		// 1. 상품등록
		// 2. 상품 삭제
		// 3. 상품 변경
		// 4. 상품 리스트
		// 5. 홈
	}
	// 상품 등록
	public void registration() {
		System.out.println("등록할 상품의 이름을 입력해주세요");
		String name = sc.next();
		System.out.println("등록할 상품의 가격을 입력해주세요");
		int price = sc.nextInt();
		prodList[cur++]=new Product(name,price);
		return;
	}
	
	// 상품삭제
	public void remove() {
		System.out.println("전체 상품 리스트");
		print();
		System.out.println("삭제할 상품번호를 입력해주세요");
		int num = sc.nextInt()-1;
		for(int i =num; i<cur-1 ; i++) {
			prodList[i]=prodList[i+1];
		}
		cur--;
		return;
	}
	
	
	// 상품변경
	public void update() {
		System.out.println("전체 상품 리스트");
		print();
		System.out.println("변경할 상품번호를 입력해주세요");
		int num = sc.nextInt();
		
		System.out.println("변경할 상품의 이름을 입력해주세요");
		String name = sc.next();
		System.out.println("변경할 상품의 가격을 입력해주세요");
		int price = sc.nextInt();
		prodList[num-1]=new Product(name,price);
		return;
	}
	
	// 상품 리스트
	public void print() {
		for(int i=0; i<cur;i++) {
			System.out.println("상품 번호 " +(int)(i+1));
			System.out.println(prodList[i]);
		}
		return;
	}
	
	
}

class Product{
	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
