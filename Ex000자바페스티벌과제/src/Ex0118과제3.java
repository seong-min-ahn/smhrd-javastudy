import java.util.Scanner;

public class Ex0118����3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�⵵ �Է�>> ");
		int year = scan.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("����");
		} else if (year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���� �ƴ�");
		}

	}

}
