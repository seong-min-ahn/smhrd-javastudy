import java.util.Scanner;

public class Ex03_login���α׷� {

	public static void main(String[] args) {

		// ���̵�: Hello ��й�ȣ: 1234
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���̵� �Է��� �ּ��� >> ");
			String id = sc.next();

			System.out.print("��й�ȣ�� �Է��� �ּ��� >> ");
			String pw = sc.next();

			if (id.equals("Hello") && pw.equals("1234")) {
				System.out.println("�α��μ���!");
				break;

			} else {
				System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�!");
				System.out.println("");
			}
		}
	}
}

