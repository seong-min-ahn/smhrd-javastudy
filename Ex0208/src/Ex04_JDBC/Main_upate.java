package Ex04_JDBC;

import java.util.Scanner;

public class Main_upate {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("������ Id >>");
	    String id = sc.next();
	    System.out.println("������ PASSWORD >>");
	    String pass = sc.next();
	    
	    DB����Ŭ���� db = new DB����Ŭ����();
	    db.update(id,pass);
	}

}
