package Ex04_JDBC;

import java.util.Scanner;

public class Main_insert {

	public static void main(String[] args) {
		DB����Ŭ���� db = new DB����Ŭ����();
		Scanner sc = new Scanner(System.in);
		System.out.print("ID >> ");
		String id = sc.next();
		System.out.print("PASSWORD >>");
		String pass = sc.next();
		System.out.print("NAME >>");
		String name = sc.next();
		
		db.insert(id,pass,name);

		
	}

}
