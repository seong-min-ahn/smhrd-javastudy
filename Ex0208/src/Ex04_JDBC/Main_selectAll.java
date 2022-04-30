package Ex04_JDBC;

import java.util.ArrayList;

public class Main_selectAll {

	public static void main(String[] args) {
		// 전체 회원 정보를 가져오는 기능
		DB접속클래스2 db = new DB접속클래스2();
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
