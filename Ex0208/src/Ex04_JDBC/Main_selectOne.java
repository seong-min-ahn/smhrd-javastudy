package Ex04_JDBC;

import java.util.Scanner;

public class Main_selectOne {

	public static void main(String[] args) {
		// 특정 id를 가진 사람의 정보를 select 
		Scanner sc = new Scanner (System.in);
		System.out.println("검색할 id 입력 >> ");
		String id = sc.next();
		
		DB접속클래스2 db = new DB접속클래스2();
		  Member m = db.selectOne(id);
		  
		  System.out.println("회원의 ID >> "+m.getId());
		  System.out.println("회원의 PASS >> "+m.getPassword());
		  System.out.println("회원의 NAME >> "+m.getName());

	}

}
