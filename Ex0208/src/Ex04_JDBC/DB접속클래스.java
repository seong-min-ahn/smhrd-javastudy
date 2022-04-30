package Ex04_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB접속클래스 {
	private Connection conn;
	private PreparedStatement psmt;

	private void getConnection() {
		try {
			// 1. DB 드라이버 로딩
			// 각 회사에서 INTERFACE를 맞춰서 만든 드라이버를 메모리에 올린다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 객체 생성
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "campus_g_4_0207"; 
			String password = "smhrd4";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(String id, String pass, String name ) {

		try { // 예외처리: 문법상의 오류는 아니고, 실행중에 발생하는 예외상황을 처리하는 문법
			getConnection();
			// 3. Statements 객체 생성
			// 실행할 SQL문을 작성하고 준비하는 작업
			// String sql = "insert into member3 values ('"+id+"','"+pass+"','"+name+"')";
			String sql = "insert into pokemon values (?,?,?)";
			// String sql = "update member3 set password = '123' where id = 'abc' ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pass);
			psmt.setString(3, name);
		
			// 4.SQL문 실행
			// sql문의 영향을 받은 row의 숫자
			int row = psmt.executeUpdate();
			// 5. 실행결과 확인
			if (row != 0) {
				System.out.println("실행성공");
			} else {
				System.out.println("SQL문 실행 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL문 에러 or 접속정보 에러");
		} finally { // 실행중 예외가 발생하더라도 반드시 실행하는 블록구간
			close();
		}
	}

	public void update(String id, String pass) {
		try { // 예외처리: 문법상의 오류는 아니고, 실행중에 발생하는 예외상황을 처리하는 문법
			getConnection();
			// 3. Statements 객체 생성
			// 실행할 SQL문을 작성하고 준비하는 작업
			// String sql = "insert into member3 values ('"+id+"','"+pass+"','"+name+"')";
			String sql = "update member3 set password=? where id= ?";
			// String sql = "update member3 set password = '123' where id = 'abc' ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pass);
			psmt.setString(2, id);

			// 4.SQL문 실행
			// sql문의 영향을 받은 row의 숫자
			int row = psmt.executeUpdate();
			// 5. 실행결과 확인
			if (row != 0) {
				System.out.println("실행성공");
			} else {
				System.out.println("SQL문 실행 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL문 에러 or 접속정보 에러");
		} finally {
			close();
		}
	}

	public void delete(String id) {
		try { // 예외처리: 문법상의 오류는 아니고, 실행중에 발생하는 예외상황을 처리하는 문법
			getConnection();
			// 3. Statements 객체 생성
			// 실행할 SQL문을 작성하고 준비하는 작업
			// String sql = "insert into member3 values ('"+id+"','"+pass+"','"+name+"')";
			String sql = "delete member3 where id=?";

			// String sql = "update member3 set password = '123' where id = 'abc' ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			// 4.SQL문 실행
			// sql문의 영향을 받은 row의 숫자
			int row = psmt.executeUpdate();
			// 5. 실행결과 확인
			if (row != 0) {
				System.out.println("실행성공");
			} else {
				System.out.println("SQL문 실행 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL문 에러 or 접속정보 에러");
		} finally {
			close();
		}
	}

	public void close() { // DB접속관련 객체를 메모리에서 해제하는 메소드
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
