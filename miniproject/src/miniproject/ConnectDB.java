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
	ResultSet rs; // Ȥ�� ���� ���� ����� ��

	Scanner scan = new Scanner(System.in);
	Pokemon pokemon = new Pokemon(null, null, null, null);
	User man = new User(null, null, null, 0);

	// DB�� �����ϴ� �޼ҵ�
	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB �ּ�
			String user = "campus_g_4_0207";
			String password = "smhrd4";

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// DB ���� ���� ��ü�� �޸𸮿��� �����ϴ� �޼ҵ�
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

	// ȸ�������ؼ� DB�� �����ϴ� �޼ҵ�
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
				System.out.println("ȸ������ ����!");
				System.out.println();
			} else {
				System.out.println("ȸ������ ����! �ٸ� ���̵� �Է����ּ���!");
			}
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			close();
		}

		man.setId(id); // ȸ������ �� �Էµ� ������ man�� null ���� ������
		man.setPassword(password);
		man.setName(name);
		man.setP_check(0);

	}

	// ���̵� �ߺ��� Ȯ���ϴ� �޼ҵ�
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
				System.out.println("ȸ������ ����! �ٸ� ���̵� �Է����ּ���!");
			} else {
				id_only = true;
//				System.out.println("ȸ������ ����!");
			}
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			close();
		}

		return id_only;

	}

	// �α����ϴ� �޼ҵ�
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

	// ���ϸ� ����� �����ϴ� �޼ҵ�

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

	// ���ϸ��� �����ϰ� DB�� ����ϴ� �޼ҵ� + ID�� ���� �����ؾ� ��
	public void setPokemon(String nick, String type) {

		try {
			getConnection();

			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));

			String sql = "insert into pokemon(nick, type, lv, exp, full, happy, tired, id, l_date, grade) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nick);
			psmt.setString(2, type);
			psmt.setInt(3, 1);
			psmt.setInt(4, 0);
			psmt.setInt(5, 50);
			psmt.setInt(6, 50);
			psmt.setInt(7, 50);
			psmt.setString(8, man.getId()); // ���̵� �޾ƿ;� ��(FK�� ���� ����)
			psmt.setString(9, formatedNow); // ���������� ������ �ð��̴ϱ� ������ �� ���ŵǾ�� ��
			psmt.setString(10, type);

			int row = psmt.executeUpdate();
			if (row != 0) {
				switch (type) {
				case "������":
					System.out.println();
					System.out.println("[�˸�] " + "�����ٹ�~!" + type + "�� �¾���ϴ�!");
					System.out.println(
							now.getMonthValue() + "�� " + now.getDayOfMonth() + "���� " + nick + "�� �����̿���! �� ������ּ���!");
					break;

				case "ġ�ڸ�Ÿ":
					System.out.println();
					System.out.println("[�˸�] " + "�����ٹ�~!" + type + "�� �¾���ϴ�!");
					System.out.println(
							now.getMonthValue() + "�� " + now.getDayOfMonth() + "���� " + nick + "�� �����̿���! �� ������ּ���!");
					break;

				case "������":
					System.out.println();
					System.out.println("[�˸�] " + "�����ٹ�~!" + type + "�� �¾���ϴ�!");
					System.out.println(
							now.getMonthValue() + "�� " + now.getDayOfMonth() + "���� " + nick + "�� �����̿���! �� ������ּ���!");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��������ΰ���?");
		} finally {
			close();
		}

	}

	// ���� ���� ���� ���ϸ��� ������ DB�� ������Ʈ�ϴ� �޼ҵ�
	public void updatePokemon(int lv, int exp, int full, int happy, int tired, String grade, String id) {

		try {
			getConnection();

			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));

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
				System.out.println("���ϸ� ������ ���������� ����Ǿ����ϴ�!");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// �α����ϸ� ���ϸ��� ������ �ҷ����� �޼ҵ�
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
				System.out.println("���ϸ� ������ �������µ� �����߽��ϴ�! ���� ���ϸ��� �������ּ���!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return pokemon;

	}

	// ��ŷ�� Ȯ���ϴ� �޼ҵ�
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



