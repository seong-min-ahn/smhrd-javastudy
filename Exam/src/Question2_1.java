import java.util.Scanner;

public class Question2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruits = { "�ڸ�", "����", "�ٳ���", "���" };
		System.out.print("ã�� ���� ����: ");
		String a = sc.next();

		for (int i = 0; i < fruits.length; i++) {
			if (a.equals(fruits[i])) {
				System.out.println(a + "�� ��ġ�� " + (i + 1) + "���� �ֽ��ϴ�.");
			}
		}

	}

}

