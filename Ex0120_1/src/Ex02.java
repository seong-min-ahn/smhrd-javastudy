import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// �̸��� 5�� �� �迭
		String[] array = new String[5];
		array[0] = "��ȯ";
		array[1] = "����";
		array[2] = "����";
		array[3] = "����";
		array[4] = "����";

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� ����:");
		String name = sc.next();

		// �迭 �ȿ��� ����ڰ� �Է��� ���� ã��;��!
		// �迭 �ȿ� �ִ� ���� ���� ��� ���� �ּ���!

		for (int i = 0; i < 5; i++) {
			// name�� �迭�ȿ� �ִ� ���� ã���ּ���!!
			// ���� �迭�ȿ� �ִ� ���� �����Է��� ���� ���ٸ� ã�Ҵ� ���
			//�̸��� ã������ n��° �ε����� �ֽ��ϴ�.!
			if (array[i].equals(name)) {
				System.out.println("ã�Ҵ�");
				System.out.println("�˻��� �̸��� "+ i+ "��° �ε����� �ֽ��ϴ�!");
			}
			//System.out.println(array[i]);
		}

	}

}
