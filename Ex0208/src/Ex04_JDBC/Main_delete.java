package Ex04_JDBC;

import java.util.Scanner;

public class Main_delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("������ Id >>");
	    String id = sc.next();

	    DB����Ŭ���� db = new DB����Ŭ����();
	    
	    db.delete(id);

	}

}
