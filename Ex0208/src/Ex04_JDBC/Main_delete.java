package Ex04_JDBC;

import java.util.Scanner;

public class Main_delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("삭제할 Id >>");
	    String id = sc.next();

	    DB접속클래스 db = new DB접속클래스();
	    
	    db.delete(id);

	}

}
