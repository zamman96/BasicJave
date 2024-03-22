package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork14 {
	int cur = 0; // 회원 저장 수
	User[] userList = new User[100];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork14 hw = new HomeWork14();
		hw.process();
	}

	public void process() {
		while (true) {
			// 1.회원가입, 2.회원탈퇴, 3.정보수정, 4.회원전체정보출력
			System.out.println("┌────────────┐");
			System.out.println("  1. 회원가입");
			System.out.println("  2. 회원탈퇴");
			System.out.println("  3. 정보수정");
			System.out.println("  4. 회원정보출력");
			System.out.println("  5. 종료");
			System.out.println("└────────────┘");
			int sel = sc.nextInt();
			if (sel == 1) {
				join();
			} else if (sel == 2) {
				delete();
			} else if (sel == 3) {
				edit();
			} else if (sel == 4) {
				print();
			} else if (sel == 5) {
				break;
			}
		}
	}

	// 아이디 생성 중복확인
	public boolean duplication(String id) {
		for (int i = 0; i < cur; i++) {
			if (userList[i].id.equals(id)) {
				System.out.println("중복된 아이디입니다.");
				System.out.println("다시 입력해주세요");
				return false; // 중복된 아이디가 있을 경우 false 반환
			}
		}
		return true; // 중복된 아이디가 없을 경우 true 반환
	}

	// 로그인
	public String[] login() {
		// (로그인성공여부, 정보순서index)
		String[] login = new String[2];
		// 아이디 비밀번호 입력
		System.out.println("┌────────────┐");
		System.out.println("    로그인");
		System.out.print("  ID : ");
		String id = sc.next();
		System.out.print("PASSWORD : ");
		String pwd = sc.next();
		System.out.println("└────────────┘");
		// 해당하는 아이디와 비밀번호 찾기
		String corretId = "";
		String corretPw = "";
		String index = "";
		for (int i = 0; i < cur; i++) {
			if (userList[i].id.equals(id)) {
				corretId = userList[i].id;
				corretPw = userList[i].pwd;
				index = ""+i;
			}
		}
		if (corretId.equals(id) && corretPw.equals(pwd)) {
			// 성공
			login[0] = "true";
			login[1] = index;
			return login;
		} else if (corretId.equals(id) && !corretPw.equals(pwd)) {
			System.out.println("┌──────────────────┐");
			System.out.println("        오류");
			System.out.println("  비밀번호가 틀렸습니다");
			System.out.println();
			System.out.println("  처음 화면으로 돌아갑니다");
			System.out.println("└──────────────────┘");
			login[0] = "false";
			return login;
		} else {
		}
		System.out.println("┌──────────────────┐");
		System.out.println("        오류");
		System.out.println(" 생성되지않은 아이디입니다");
		System.out.println();
		System.out.println("  처음 화면으로 돌아갑니다");
		System.out.println("└──────────────────┘");

		login[0] = "false";
		return login;

	}

	// 1.회원가입
	public void join() {
		System.out.println("┌──────────────────┐");
		System.out.println("        회원 가입");
		String id;
		do {
			System.out.print("id : ");
			id = sc.next();
		} while (!duplication(id)); // 중복된 아이디가 입력될 때까지 반복

		// 비밀번호
		System.out.print("패스워드 : ");
		String pwd = sc.next();

		// 이름
		System.out.print("이름 : ");
		String name = sc.next();

		// 나이
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println();
		System.out.println("  회원가입이 완료되었습니다.");
		System.out.println("└──────────────────┘");
		// 내용 저장
		userList[cur] = new User(id, pwd, name, age);
		cur++;

	}

	// 2.회원탈퇴 --
	public void delete() {
		while (true) {
			// 회원이없을떄 출력
			if (cur == 0) {
				System.out.println("┌──────────────────┐");
				System.out.println("        오류");
				System.out.println("   회원정보가 없습니다");
				System.out.println("└──────────────────┘");
				break;
			}
			System.out.println("┌──────────────────┐");
			System.out.println("      회원탈퇴");
			System.out.println("└──────────────────┘");
			String login[] = login();
			if (!login[0].equals("true")) {
				break;
			}
			int index = Integer.parseInt(login[1]);
			System.out.println("┌──────────────────┐");
			System.out.println("  정말 탈퇴하시겠습니까?");
			System.out.println("      y  /  n");
			System.out.println("└──────────────────┘");
			String input = sc.next();
			if (input.equalsIgnoreCase("n")) {
				System.out.println("┌──────────────────┐");
				System.out.println("  처음 화면으로 돌아갑니다");
				System.out.println("└──────────────────┘");
				break;
			}
			for (int i = index; i < cur; i++) {
				userList[i] = userList[i + 1];
			}
			System.out.println("┌──────────────────┐");
			System.out.println("   탈퇴가 완료되었습니다");
			System.out.println("└──────────────────┘");
			cur--;
			break;
		}
	}

	// 3.정보수정
	public void edit() {
		while (true) {
			// 회원이없을떄 출력
			if (cur == 0) {
				System.out.println("┌──────────────────┐");
				System.out.println("        오류");
				System.out.println("   회원정보가 없습니다");
				System.out.println("└──────────────────┘");
				break;
			}
			System.out.println("┌──────────────────┐");
			System.out.println("      정보 수정");
			System.out.println("└──────────────────┘");
			String login[] = login();
			if (!login[0].equals("true")) {
				break;
			}
			;
			int index = Integer.parseInt(login[1]);

			System.out.println("┌────────────────────┐");
			System.out.println("  변경할 정보를 입력하세요");

			// 아이디는 바꿀수 없으므로 유지
			System.out.println("아이디 : " + userList[index].id);

			// 비밀번호
			System.out.println("바꿀 패스워드 : ");
			System.out.println("바꾸지않는다면 숫자 0을 입력해주세요");
			String pwd2 = sc.next();
			if (pwd2.equals("0")) {
				pwd2 = userList[index].pwd;
			}

			// 이름
			System.out.println("바꿀 이름 : ");
			System.out.println("바꾸지않는다면 숫자 0을 입력해주세요");
			String name = sc.next();
			if (name.equals("0")) {
				name = userList[index].name;
			}

			// 나이
			System.out.println("바꿀 나이 : ");
			System.out.println("바꾸지않는다면 숫자 0을 입력해주세요");
			int age = sc.nextInt();
			if (age == 0) {
				age = userList[index].age;
			}
			System.out.println("  정보수정이 완료되었습니다");
			System.out.println("└────────────────────┘");

			// 내용 저장
			userList[index] = new User(userList[index].id, pwd2, name, age);
			break;
		}

	}

	// 4.회원전체정보출력
	public void print() {
		if (cur == 0) {
			System.out.println("┌──────────────────┐");
			System.out.println("        오류");
			System.out.println("   회원정보가 없습니다");
			System.out.println("└──────────────────┘");
		} else {
			for (int i = 0; i < cur; i++) {
				System.out.println("=============================");
				System.out.println("회원정보 " + (i+1) + "번");
				System.out.println("아이디 : " + userList[i].id);
				System.out.println("비밀번호 : " + userList[i].pwd);
				System.out.println("이름 : " + userList[i].name);
				System.out.println("나이 : " + userList[i].age);
				System.out.println("=============================");
			}
		}
	}

}

class User {
	// 아이디 패스워드 이름 나이를 필드로 만들기
	String id;
	String pwd;
	String name;
	int age;

	public User(String id, String pwd, String name, int age) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
	}

}
