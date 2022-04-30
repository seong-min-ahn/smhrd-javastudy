package Ex04_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DB접속클래스2 {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs; // select 결과를 담고 있는 객체
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";

	public void getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Member selectOne(String id) {
		Member m =null;
		
		try {
			// 1~2. 드라이버로딩 및 커넥션 객체 생성
			getConnection();
			// 3. SQL 작성 및 준비
			String sql = "select * from member3 where id=? ";
			psmt = conn.prepareCall(sql);
			psmt.setString(1, id);

			// 4,sql문 실행
			rs = psmt.executeQuery(); // select문을 사용할때 호출하는 메소드
			// 5. 실행 결과 확인
			while (rs.next()) {
				String result_id = rs.getString("ID");
				String result_pass = rs.getString("PASSWORD");
				String result_name = rs.getString("NAME");
//				System.out.println("가져온 ID >> " + result_id);
//				System.out.println("가져온 PASSWORD >> " + result_pass);
//				System.out.println("가져온 NAME >> " + result_name);
				m = new Member(result_id, result_pass, result_name);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return m; //생성한 회원 객체를 main에게 반환(전달)

	}

	public void close() { // DB접속관련 객체를 메모리에서 해제하는 메소드
		try {
			if (psmt != null)
				rs.close();
			psmt.close();
			psmt.close();
			if (conn != null)
				conn.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = new ArrayList<>();
		try {
			// 1~2. 드라이버로딩 및 커넥션 객체 생성
			getConnection();
			// 3. SQL 작성 및 준비
			String sql = "select * from member3 ";
			psmt = conn.prepareCall(sql);

			// 4,sql문 실행
			rs = psmt.executeQuery(); // select문을 사용할때 호출하는 메소드
			// 5. 실행 결과 확인
			while (rs.next()) {
				String result_id = rs.getString("ID");
				String result_pass = rs.getString("PASSWORD");
				String result_name = rs.getString("NAME");
//				System.out.println("가져온 ID >> " + result_id);
//				System.out.println("가져온 PASSWORD >> " + result_pass);
//				System.out.println("가져온 NAME >> " + result_name);
				Member m = new Member(result_id, result_pass, result_name);
			    list.add(m);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

}
