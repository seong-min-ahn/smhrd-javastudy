import java.util.Scanner;

public class E03_���������ʽ��ϴ� {

	public static void main(String[] args) {
		// ȸ���ټ����� ������
		// ���� �����Ҷ� �ߺ��̸� �����Ҷ����� ��� �ߺ�üũ�ϱ�
		Scanner scan = new Scanner(System.in);
		
		String[] member = { "����", "����", "�ٶ�", "��", "����" };
		
		boolean a = false;
		while (true) {
			System.out.print("ID�Է� : ");
			String input = scan.next();
			
			for (int i = 0; i < 5; i++) {
				if (member[i].equals(input)) {
					System.out.println("�ߺ�������");
					a = true; 
					break;
				}
			}
			if (!a) {

				System.out.println("����");
			}
			break;

		}

	}

}
