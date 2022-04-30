package miniproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ConnectDB {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs; // 혹시 몰라서 먼저 만들어 둠

	Scanner scan = new Scanner(System.in);
	Pokemon pokemon = new Pokemon(null, null, null, null);
	User man = new User(null, null, null, 0);

	// DB에 접속하는 메소드
	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB 주소
			String user = "campus_g_4_0207";
			String password = "smhrd4";

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// DB 접속 관련 객체를 메모리에서 해제하는 메소드
	public void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 회원가입해서 DB에 저장하는 메소드
	public void setUser(String id, String password, String name) {
		try {
			getConnection();

			String sql = "insert into user_info values(?, ?, ?, 0)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, password);
			psmt.setString(3, name);

			int row = psmt.executeUpdate();
			if (row != 0) {
				System.out.println("회원가입 성공!");
				System.out.println();
			} else {
				System.out.println("회원가입 실패! 다른 아이디를 입력해주세요!");
			}
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			close();
		}

		man.setId(id); // 회원가입 중 입력된 정보를 man의 null 값에 대입함
		man.setPassword(password);
		man.setName(name);
		man.setP_check(0);

	}

	// 아이디 중복을 확인하는 메소드
	public boolean findDup(String id) {

		boolean id_only = false;

		try {
			getConnection();

			String sql = "select id from user_info where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			ResultSet row = psmt.executeQuery();
			if (row.next()) {
				id_only = false;
				System.out.println("회원가입 실패! 다른 아이디를 입력해주세요!");
			} else {
				id_only = true;
//				System.out.println("회원가입 성공!");
			}
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			close();
		}

		return id_only;

	}

	// 로그인하는 메소드
	public User getUser(String id, String pw) {

		try {
			getConnection();

			String sql = "select * from user_info where id = ? and password = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			String result_id;
			String result_pass;
			String result_name;
			int result_check;

			while (rs.next()) {
				result_id = rs.getString("id");
				result_pass = rs.getString("password");
				result_name = rs.getString("name");
				result_check = rs.getInt("p_check");
				man = new User(result_id, result_pass, result_name, result_check);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return man;
	}

	// 포켓몬 등록을 갱신하는 메소드

	public void updatePcheck(String id) {

		try {
			getConnection();

			String sql = "update user_info set p_check = 1 where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			man.setP_check(1);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 포켓몬을 생성하고 DB에 등록하는 메소드 + ID도 같이 저장해야 함
	public void setPokemon(String nick, String type) {

		try {
			getConnection();

			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));

			String sql = "insert into pokemon(nick, type, lv, exp, full, happy, tired, id, l_date, grade) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nick);
			psmt.setString(2, type);
			psmt.setInt(3, 1);
			psmt.setInt(4, 0);
			psmt.setInt(5, 50);
			psmt.setInt(6, 50);
			psmt.setInt(7, 50);
			psmt.setString(8, man.getId()); // 아이디를 받아와야 함(FK라서 오류 터짐)
			psmt.setString(9, formatedNow); // 마지막으로 접속한 시간이니까 종료할 때 갱신되어야 함
			psmt.setString(10, type);

			int row = psmt.executeUpdate();
			if (row != 0) {
				switch (type) {
				case "리아코":
					System.out.println();
					System.out.println("[알림] " + "빰빠바밤~!" + type + "가 태어났습니다!");
					System.out.println(
							now.getMonthValue() + "월 " + now.getDayOfMonth() + "일은 " + nick + "의 생일이에요! 꼭 기억해주세요!");
					break;

				case "치코리타":
					System.out.println();
					System.out.println("[알림] " + "빰빠바밤~!" + type + "가 태어났습니다!");
					System.out.println(
							now.getMonthValue() + "월 " + now.getDayOfMonth() + "일은 " + nick + "의 생일이에요! 꼭 기억해주세요!");
					break;

				case "브케인":
					System.out.println();
					System.out.println("[알림] " + "빰빠바밤~!" + type + "이 태어났습니다!");
					System.out.println(
							now.getMonthValue() + "월 " + now.getDayOfMonth() + "일은 " + nick + "의 생일이에요! 꼭 기억해주세요!");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("여기오류인가요?");
		} finally {
			close();
		}

	}

	// 게임 종료 직전 포켓몬의 정보를 DB에 업데이트하는 메소드
	public void updatePokemon(int lv, int exp, int full, int happy, int tired, String grade, String id) {

		try {
			getConnection();

			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));

			String sql = "update pokemon set lv=?, exp=?, full=?, happy=?, tired=?, l_date=?, grade=? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, lv);
			psmt.setInt(2, exp);
			psmt.setInt(3, full);
			psmt.setInt(4, happy);
			psmt.setInt(5, tired);
			psmt.setString(6, formatedNow);
			psmt.setString(7, grade);
			psmt.setString(8, man.getId());

			int row = psmt.executeUpdate();
			if (row != 0) {
				System.out.println("포켓몬 정보가 정상적으로 저장되었습니다!");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 로그인하면 포켓몬의 정보를 불러오는 메소드
	public Pokemon getPokemon(String id) {

		try {
			getConnection();

			String sql = "select * from pokemon where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				pokemon.setNick(rs.getString("nick"));
				pokemon.setType(rs.getString("type"));
				pokemon.setLv(rs.getInt("lv"));
				pokemon.setExp(rs.getInt("exp"));
				pokemon.setFull(rs.getInt("full"));
				pokemon.setHappy(rs.getInt("happy"));
				pokemon.setTired(rs.getInt("tired"));
				pokemon.setGrade(rs.getString("grade"));

				System.out.println();
			} else {
				System.out.println("포켓몬 정보를 가져오는데 실패했습니다! 먼저 포켓몬을 생성해주세요!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return pokemon;

	}

	// 랭킹을 확인하는 메소드
	public ArrayList<Rank> showRank() {
		ArrayList<Rank> list = new ArrayList<>();
		try {
			getConnection();

			String sql = "select nick, id, grade, lv, exp, l_date from pokemon order by lv desc, exp desc";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String result_nick = rs.getString("nick");
				String result_id = rs.getString("id");
				String result_grade = rs.getString("grade");
				int result_level = rs.getInt("lv");
				int result_exp = rs.getInt("exp");
				String result_date = rs.getString("l_date");

				Rank rk = new Rank(result_nick, result_id, result_grade, result_level, result_exp, result_date);
				list.add(rk);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

}



