package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMain {
	public static void main(String[] args) {
		DBMain db = new DBMain();
		db.selectAll();
	}
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	
	public void selectAll() {
		try {
			conn = DBConn.getConnection();	//싱글톤 접속
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBER WHERE MEM_ID='a001'";
			rs = stmt.executeQuery(sql);	// 결과값 가져옴
			
			while(rs.next()) {
				String id = rs.getString("MEM_ID");
				String pass = rs.getString("MEM_PASS");
				String name = rs.getString("MEM_NAME");
				System.out.println(id+"\t"+pass+"\t"+name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
