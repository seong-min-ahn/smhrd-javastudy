package Ex04_JDBC;

import java.util.ArrayList;

public class Main_selectAll {

	public static void main(String[] args) {
		// ��ü ȸ�� ������ �������� ���
		DB����Ŭ����2 db = new DB����Ŭ����2();
		ArrayList<Member> list = db.selectAll();
		
		System.out.println(list.size());

		for(int i =0; i<list.size(); i++) {
			Member m = list.get(i);
			System.out.println(m.getId());
			System.out.println(m.getPassword());
			System.out.println(m.getName());
			System.out.println("========");
			
			
		}
	}

}
