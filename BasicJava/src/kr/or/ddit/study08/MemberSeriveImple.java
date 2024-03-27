package kr.or.ddit.study08;

public class MemberSeriveImple implements IMember {

	MemberVo[] memList = new MemberVo[100];
	int cur = 0;
	
	@Override
	public void sign(MemberVo member) {
		memList[cur++] = member;
	}

	@Override
	public boolean login(String id, String pass) {
		for(int i=0; i<cur; i++) {
			MemberVo mem = memList[i];
			if(mem.getId().equals(id)&&mem.getPass().equals(pass)) {
				return true;
			}
		}
		return false;
	}

}
