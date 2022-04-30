package Ex04_JDBC;

import java.util.Scanner;

public class Main_upate {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("수정할 Id >>");
	    String id = sc.next();
	    System.out.println("수정할 PASSWORD >>");
	    String pass = sc.next();
	    
	    DB접속클래스 db = new DB접속클래스();
	    db.update(id,pass);
	}

}
