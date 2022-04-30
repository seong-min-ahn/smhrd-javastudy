import java.util.Scanner;

public class E03_존재하지않습니다 {

	public static void main(String[] args) {
		// 회원다섯명이 있을때
		// 새로 가입할때 중복이면 가입할때까지 계속 중복체크하기
		Scanner scan = new Scanner(System.in);
		
		String[] member = { "가나", "나다", "다라", "라마", "마바" };
		
		boolean a = false;
		while (true) {
			System.out.print("ID입력 : ");
			String input = scan.next();
			
			for (int i = 0; i < 5; i++) {
				if (member[i].equals(input)) {
					System.out.println("중복값있음");
					a = true; 
					break;
				}
			}
			if (!a) {

				System.out.println("가입");
			}
			break;

		}

	}

}
