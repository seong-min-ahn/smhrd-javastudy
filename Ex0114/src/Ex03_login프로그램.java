import java.util.Scanner;

public class Ex03_login프로그램 {

	public static void main(String[] args) {

		// 아이디: Hello 비밀번호: 1234
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("아이디를 입력해 주세요 >> ");
			String id = sc.next();

			System.out.print("비밀번호를 입력해 주세요 >> ");
			String pw = sc.next();

			if (id.equals("Hello") && pw.equals("1234")) {
				System.out.println("로그인성공!");
				break;

			} else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다!");
				System.out.println("");
			}
		}
	}
}

