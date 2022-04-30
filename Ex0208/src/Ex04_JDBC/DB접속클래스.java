package Ex04_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB����Ŭ���� {
	private Connection conn;
	private PreparedStatement psmt;

	private void getConnection() {
		try {
			// 1. DB ����̹� �ε�
			// �� ȸ�翡�� INTERFACE�� ���缭 ���� ����̹��� �޸𸮿� �ø���.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection ��ü ����
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "campus_g_4_0207"; 
			String password = "smhrd4";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(String id, String pass, String name ) {

		try { // ����ó��: �������� ������ �ƴϰ�, �����߿� �߻��ϴ� ���ܻ�Ȳ�� ó���ϴ� ����
			getConnection();
			// 3. Statements ��ü ����
			// ������ SQL���� �ۼ��ϰ� �غ��ϴ� �۾�
			// String sql = "insert into member3 values ('"+id+"','"+pass+"','"+name+"')";
			String sql = "insert into pokemon values (?,?,?)";
			// String sql = "update member3 set password = '123' where id = 'abc' ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pass);
			psmt.setString(3, name);
		
			// 4.SQL�� ����
			// sql���� ������ ���� row�� ����
			int row = psmt.executeUpdate();
			// 5. ������ Ȯ��
			if (row != 0) {
				System.out.println("���༺��");
			} else {
				System.out.println("SQL�� ���� ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL�� ���� or �������� ����");
		} finally { // ������ ���ܰ� �߻��ϴ��� �ݵ�� �����ϴ� ��ϱ���
			close();
		}
	}

	public void update(String id, String pass) {
		try { // ����ó��: �������� ������ �ƴϰ�, �����߿� �߻��ϴ� ���ܻ�Ȳ�� ó���ϴ� ����
			getConnection();
			// 3. Statements ��ü ����
			// ������ SQL���� �ۼ��ϰ� �غ��ϴ� �۾�
			// String sql = "insert into member3 values ('"+id+"','"+pass+"','"+name+"')";
			String sql = "update member3 set password=? where id= ?";
			// String sql = "update member3 set password = '123' where id = 'abc' ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pass);
			psmt.setString(2, id);

			// 4.SQL�� ����
			// sql���� ������ ���� row�� ����
			int row = psmt.executeUpdate();
			// 5. ������ Ȯ��
			if (row != 0) {
				System.out.println("���༺��");
			} else {
				System.out.println("SQL�� ���� ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL�� ���� or �������� ����");
		} finally {
			close();
		}
	}

	public void delete(String id) {
		try { // ����ó��: �������� ������ �ƴϰ�, �����߿� �߻��ϴ� ���ܻ�Ȳ�� ó���ϴ� ����
			getConnection();
			// 3. Statements ��ü ����
			// ������ SQL���� �ۼ��ϰ� �غ��ϴ� �۾�
			// String sql = "insert into member3 values ('"+id+"','"+pass+"','"+name+"')";
			String sql = "delete member3 where id=?";

			// String sql = "update member3 set password = '123' where id = 'abc' ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			// 4.SQL�� ����
			// sql���� ������ ���� row�� ����
			int row = psmt.executeUpdate();
			// 5. ������ Ȯ��
			if (row != 0) {
				System.out.println("���༺��");
			} else {
				System.out.println("SQL�� ���� ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL�� ���� or �������� ����");
		} finally {
			close();
		}
	}

	public void close() { // DB���Ӱ��� ��ü�� �޸𸮿��� �����ϴ� �޼ҵ�
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
