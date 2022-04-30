import java.util.Scanner;

public class Ex02_배열알때 {

	public static void main(String[] args) {
//		// 회원 5명 ID(String)저장할 배열~~
		String[] member = { "정세연", "박수현", "황해도", "채수민", "위홍주" };
//		
//		//배열의 1번 사람 출력해보자
//		System.out.println(member[1]);
//		
//		//배열의 3번 사람 출력해보자!!
//		System.out.println(member[3]);
//		
//		//배열의 원소에 접하는 방법! 배열이름[인덱스]이다.
//		//2자리에 "박병관" 이름 넣기
//		member[2]="박병관";
//		System.out.println(member[2]);
//		
//		//id를 새로 입력받아 기존 아이디과 중복인지 아닌지 검사하기!
//		
//		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID입력 : "); 
		String newId= scan.next(); 
		for(int i = 0; i<5; i++) {
			if ( member[i].equals(newId)) {
				System.out.println("중복");
			}
		}
	    

	}

}
