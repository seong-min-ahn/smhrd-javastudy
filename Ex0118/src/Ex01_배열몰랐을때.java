import java.util.Scanner;

public class Ex01_배열몰랐을때 {

	public static void main(String[] args) {
		//회원가입 할때 아이디 중복체크기능 구현
		//기본 가입되어있는 회원은 5명
		//새로 가입하려는 사람의 아이디가 중복되는지 확인하고 싶다!
		
		//아아디니까 문자열 변수에 저장해야겠다!!
		String id1 = "정세연";
		String id2 = "박수현";
		String id3 = "황해도";
		String id4 = "채수민";
		String id5 = "위홍주";
		
		//새로 가입하려는 사람 id 입력하기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID>> ");
		String 새로운아이디 = scan.next();
		
		//만약에 첫번째 사람이랑 중복이면 아이디중복이라고 출력
		if(id1.equals(새로운아이디));{
			System.out.println("아이디중복!"); 
		}
		//만약에 두번째 사람이랑 중복이면 아이디중복이라고 출력
		if(id2.equals(새로운아이디));{
			System.out.println("아이디중복!");
		}
		

	}

}
