package Ex04_JDBC;

import java.util.Scanner;

public class Main_selectOne {

	public static void main(String[] args) {
		// Ư�� id�� ���� ����� ������ select 
		Scanner sc = new Scanner (System.in);
		System.out.println("�˻��� id �Է� >> ");
		String id = sc.next();
		
		DB����Ŭ����2 db = new DB����Ŭ����2();
		  Member m = db.selectOne(id);
		  
		  System.out.println("ȸ���� ID >> "+m.getId());
		  System.out.println("ȸ���� PASS >> "+m.getPassword());
		  System.out.println("ȸ���� NAME >> "+m.getName());

	}

}
