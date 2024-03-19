package kr.or.ddit.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork11 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork11 obj = new HomeWork11();
		obj.process();
//		Member2 member = new Member2("이름","지역","000210-4");
//		System.out.println(member.age);
	}
	
	public void process() {
		Member[] memList = new Member[100];
		int cur = 0;
		while(true) {
			System.out.println("1 회원 추가");
			System.out.println("2 종료");
			int sel = sc.nextInt();
			Member mem = null;
			if(sel==1) {
				// 지역이 대전이라면  파라미터 2개인 생성자 호출
				// 지역이 대전이 아니라면 파라미터 3개인 생성자 호출
				System.out.println("지역을 입력해주세요.");
				String inregion = sc.next();
				if(inregion.equals("대전")) {
					System.out.println("이름을 입력해주세요");
					String inname = sc.next();
					System.out.println("주민등록번호 생년월일과 두번째 앞 한글자를 입력해주세요.");
					System.out.println("예시) 901001-1");
					String inregdate = sc.next();
					mem = new Member(inname,inregdate);
				} else {
					System.out.println("이름을 입력해주세요");
					String inname = sc.next();
					System.out.println("주민등록번호 생년월일과 두번째 앞 한글자를 입력해주세요.");
					System.out.println("예시) 901001-1");
					String inregdate = sc.next();
					mem = new Member(inname,inregion,inregdate);
				}
				memList[cur++] = mem;
			}
			if(sel == 2) {
				break;
			}
		}
		
		for(int i=0; i<cur; i++) {
			System.out.println(memList[i]);
		}
	}
}

class Member{
	// 이름, 지역, 생년월일(900101-1), 만나이 
	String name;
	String region;
	String regdate;
	int age;
	
	// 이름 지역 생년월일 생성자 
	public Member(String name, String region, String regdate) {
		this.name=name;
		this.region=region;
		this.regdate=regdate;
		try {
			// 나이 계산하기.
			Date date1 = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			// tokens[0] => 900101
			// tokens[1] => 1
			String tokens[] = regdate.split("-");
			
			// 끝자리가 1, 2 인경우 19
			String year = "20";
			if(tokens[1].equals("1")||tokens[1].equals("2")) {
				year = "19";
			}
			
			// 끝자리가 3, 4 인경우 20 추가 할것
			Date date2 = sdf.parse(year+tokens[0]);
			
			// 태어난지 난 시간(단위 ms). 
			long time = date1.getTime() - date2.getTime();
			time= time/1000/60/60/24/365;
			this.age=(int)time;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	

	// 이름 생년월일 생성자
	public Member(String name, String regdate) {
		this(name,"대전",regdate);
	}

	
	@Override
	public String toString() {
		return "Member [name=" + name + ", region=" + region + ", regdate=" + regdate + ", age=" + age + "]";
	}
}