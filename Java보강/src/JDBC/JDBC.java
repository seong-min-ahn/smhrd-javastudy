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
			System.out.println("1. ȸ������ 2.�α��� 3. ����");
			int menu = sc.nextInt();
			if (menu == 3) {
				System.out.println("����!");
				break;
			} else if (menu == 1) {
				try {
					// 1. ����غ� --> �����ε�!
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. ��� �����!!
					// ��� ����� ���� �غ�!!
					// (1)url --> ��� �ִ� DataBase����???
					// (2)connection �ϱ����� ID
					// (3)connection �ϱ����� PW
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String id = "hr";
					String pw = "hr";
					Connection conn = DriverManager.getConnection(url, id, pw);
					System.out.println("���Ἲ��!");

					// 3. sql �ۼ� �� ���� !
					// id, pw, nuck �� ����ڷκ��� �Է� �޾Ƽ�
					// DB�� ����!!
					System.out.println("ID �Է� >>");
					String input_id = sc.next();
					System.out.println("PW �Է� >>");
					String input_pw = sc.next();
					System.out.println("NICK �Է� >>");
					String nick = sc.next();

					// ������ ��Ŭ�������� �νİ����� �������� ������ٸ�
					// conn.prepareStatement(sql); -->Oracle ���� �νİ����� ���������� �ٲپ���!
					String sql = "insert into memver values(?,?,?)";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, input_id);
					psmt.setString(2, input_pw);
					psmt.setString(3, nick);

					// ����!! ������ �ۼ��� ������ ����!!!
					// executeQuery ----> ���� ��Ű�� ���� ��Ų ����� ������!! ex. select
					// ��ȯ : ResultSet ��ü�� ��ȯ �Ǿ���!

					// executeUpdate -----> ���������� �����̵� ���̺��� ���� ������ ����!! (int)
					// ���� ������ ������ �Ǵ� �������� ��︲!! ex. inser, delete, update

//					ResultSet rs =  psmt.executeQuery();
					int cnt = psmt.executeUpdate();
					if (cnt > 0) {
						System.out.println("ȸ�� ���� ����!");
					} else {
						System.out.println("ȸ�� ���� ����!");
					}
					// 4. ����ߴ� ��ü �ݾ��ֱ�!
					// �߿�!! --> ��������� �������� ��ü�� �ݾ�����Ѵ�!
					if (psmt != null) {
						psmt.close();
					}
					if (conn != null) {
						conn.close();
					}

				} catch (ClassNotFoundException e) {
					System.out.println("�ε� ����!");
					e.printStackTrace();
				} catch (SQLException e) {
					System.out.println("sql ��� ����� ����!");
					e.printStackTrace();
				}
			} else if (menu == 2) {
				// �α��� ���!!!
				// 1. �����غ� ---> �����ε�!!
				// 2. ��� ����!!

				// 1,2 ���� ��Ʋ� DB����!!
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 2. ��� �����!!
					// ��� ����� ���� �غ�!!
					// (1)url --> ��� �ִ� DataBase����???
					// (2)connection �ϱ����� ID
					// (3)connection �ϱ����� PW
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String id = "hr";
					String pw = "hr";

					Connection conn = DriverManager.getConnection(url, id, pw);

					// ����ڷκ��� ���̵� ��й�ȣ �Է¹ޱ�>
					System.out.println("�α��� �� ���̵� �Է�>>");
					String user_id = sc.next();
					System.out.println("�α��� �� ��й�ȣ �Է�>>");
					String user_pw = sc.next();
					// 3.������ �ۼ� �� ����!
					String sql = "select * from memver where id=? and pw=?";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, user_id);
					psmt.setString(2, user_pw);
					// ��¥ ������ �ϼ�!

					ResultSet rs = psmt.executeQuery();

					// rs.next()�� ���� ���̺� �ִ� ���� Ȯ�� �� �� �ִ�!!
					// rs.next()�� ����Ű�� ���� �����Ͱ� �ִٸ� True ��ȯ! ���ٸ� False �� ��ȯ!!
					if (rs.next()) {
						// String nick = rs.getString("nick");
						String nick = rs.getString(3);
						System.out.println(nick + "�� ȯ���մϴ�!");
					} else {
						System.out.println("�α��� ����");
					}
					// 4. ����ߴ� ��ü �ݾ��ֱ�
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
