import java.util.Scanner;

public class Ex_04���ǹ��ǽ����������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("user1: ");
		String a = scan.next();
		System.out.print("user2: ");
		String b = scan.next();

		System.out.print(a + "�� >> ");
		String c = scan.next();
		System.out.print(b + "�� >> ");
		String d = scan.next();

		int e = 0;
		if (c.equals(d))
			e = 0;
		else if (c.equals("����")) {
			if (d.equals("��")) {
				e = 1;
			} else if(d.equals("����")){
				e = 2;
			}
		} else if (c.equals("����")) {
			if (d.equals("����")) {
				e = 1;
			} else if(d.equals("��")) {
				e = 2;
			}
		} else if (c.equals("��")) {
			if (d.equals("����")) {
				e = 1;
			} else if(d.equals("����")){
				e = 2;
			}
		}
		if (e == 1) {
			System.out.println(a + "�¸�!");
		} else if (e == 2) {
			System.out.println(b + "�¸�!");
		} else {
			System.out.println("���º�!");
		}

	}

}
