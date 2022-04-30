import java.util.Scanner;

public class Ex0118°úÁ¦3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("³âµµ ÀÔ·Â>> ");
		int year = scan.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("À±³â");
		} else if (year % 400 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("À±³â ¾Æ´Ô");
		}

	}

}
