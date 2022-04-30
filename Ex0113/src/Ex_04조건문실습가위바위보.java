import java.util.Scanner;

public class Ex_04조건문실습가위바위보 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("user1: ");
		String a = scan.next();
		System.out.print("user2: ");
		String b = scan.next();

		System.out.print(a + "님 >> ");
		String c = scan.next();
		System.out.print(b + "님 >> ");
		String d = scan.next();

		int e = 0;
		if (c.equals(d))
			e = 0;
		else if (c.equals("가위")) {
			if (d.equals("보")) {
				e = 1;
			} else if(d.equals("바위")){
				e = 2;
			}
		} else if (c.equals("바위")) {
			if (d.equals("가위")) {
				e = 1;
			} else if(d.equals("보")) {
				e = 2;
			}
		} else if (c.equals("보")) {
			if (d.equals("바위")) {
				e = 1;
			} else if(d.equals("가위")){
				e = 2;
			}
		}
		if (e == 1) {
			System.out.println(a + "승리!");
		} else if (e == 2) {
			System.out.println(b + "승리!");
		} else {
			System.out.println("무승부!");
		}

	}

}
