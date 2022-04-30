package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 회원가입 2.로그인 3. 종료");
			int menu = sc.nextInt();
			if (menu == 3) {
				System.out.println("종료!");
				break;
			} else if (menu == 1) {
				try {
					// 1. 재료준비 --> 동적로딩!
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. 통로 만들기!!
					// 통로 만들기 위한 준비물!!
					// (1)url --> 어디에 있는 DataBase인지???
					// (2)connection 하기위한 ID
					// (3)connection 하기위한 PW
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String id = "hr";
					String pw = "hr";
					Connection conn = DriverManager.getConnection(url, id, pw);
					System.out.println("연결성공!");

					// 3. sql 작성 및 실행 !
					// id, pw, nuck 을 사용자로부터 입력 받아서
					// DB에 저장!!
					System.out.println("ID 입력 >>");
					String input_id = sc.next();
					System.out.println("PW 입력 >>");
					String input_pw = sc.next();
					System.out.println("NICK 입력 >>");
					String nick = sc.next();

					// 위에서 이클립스에서 인식가능한 쿼리문을 만들었다면
					// conn.prepareStatement(sql); -->Oracle 에서 인식가능한 쿼리문으로 바꾸어줌!
					String sql = "insert into memver values(?,?,?)";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, input_id);
					psmt.setString(2, input_pw);
					psmt.setString(3, nick);

					// 엔터!! 위에서 작성한 쿼리문 실행!!!
					// executeQuery ----> 실행 시키고 실행 시킨 결과를 가져옴!! ex. select
					// 반환 : ResultSet 객체롤 반환 되어짐!

					// executeUpdate -----> 정상적으로 변경이된 테이블의 행의 갯수를 리턴!! (int)
					// 행의 갯수가 변경이 되는 쿼리문에 어울림!! ex. inser, delete, update

//					ResultSet rs =  psmt.executeQuery();
					int cnt = psmt.executeUpdate();
					if (cnt > 0) {
						System.out.println("회원 가입 성공!");
					} else {
						System.out.println("회원 가입 실패!");
					}
					// 4. 사용했던 객체 닫아주기!
					// 중요!! --> 만들어졌던 역순으로 객체를 닫아줘야한다!
					if (psmt != null) {
						psmt.close();
					}
					if (conn != null) {
						conn.close();
					}

				} catch (ClassNotFoundException e) {
					System.out.println("로딩 실패!");
					e.printStackTrace();
				} catch (SQLException e) {
					System.out.println("sql 통로 만들기 실패!");
					e.printStackTrace();
				}
			} else if (menu == 2) {
				// 로그인 기능!!!
				// 1. 제료준비 ---> 동적로딩!!
				// 2. 통로 연결!!

				// 1,2 번을 통틀어서 DB연결!!
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 2. 통로 만들기!!
					// 통로 만들기 위한 준비물!!
					// (1)url --> 어디에 있는 DataBase인지???
					// (2)connection 하기위한 ID
					// (3)connection 하기위한 PW
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String id = "hr";
					String pw = "hr";

					Connection conn = DriverManager.getConnection(url, id, pw);

					// 사용자로부터 아이디 비밀번호 입력받기>
					System.out.println("로그인 할 아이디 입력>>");
					String user_id = sc.next();
					System.out.println("로그인 할 비밀번호 입력>>");
					String user_pw = sc.next();
					// 3.쿼리문 작성 및 실행!
					String sql = "select * from memver where id=? and pw=?";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, user_id);
					psmt.setString(2, user_pw);
					// 진짜 쿼리문 완성!

					ResultSet rs = psmt.executeQuery();

					// rs.next()를 통해 테이블에 있는 값을 확인 할 수 있다!!
					// rs.next()는 가르키는 곳에 데이터가 있다면 True 반환! 없다면 False 를 반환!!
					if (rs.next()) {
						// String nick = rs.getString("nick");
						String nick = rs.getString(3);
						System.out.println(nick + "님 환영합니다!");
					} else {
						System.out.println("로그인 실패");
					}
					// 4. 사용했던 객체 닫아주기
					if (rs != null) {
						rs.close();
					}
					if (psmt != null) {
						psmt.close();
					}
					if (conn != null) {
						conn.close();
					}

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
