package kr.or.ddit.study08;

public interface IMember {
//	public void sign(String id, String pass, String name, int age);
	public void sign(MemberVo member);
			
	public boolean login(String id, String pass);
}
