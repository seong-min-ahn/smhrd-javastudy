import java.util.Scanner;

public class Ex_03���ǹ� {

	public static void main(String[] args) {
		// ��ĳ�ʷ� �����ϳ��� �Է¹ް�
		// �������� ��� ������ �հ�/���հ�, Ȧ��/¦���� ���� ����, 2�����θ� �Ǵ�
		// �̹����� ����� �ο�
		// 90���̻��̸� a,80~90�̸� b,70~80�̸�,�������� f
		// 1.90���̻� �Ǻ�
		// 2.�ƴѻ���������ٰ� 80���̻����� �Ǻ�
		// 3.�ƴѻ���� �����ٰ� 70���̻����� �Ǻ�
		// 4. �װ͵� �ƴ϶�� F

		Scanner sc = new Scanner(System.in);

		System.out.println("�����Է� >> ");
		int num = sc.nextInt();

		if (num >= 90) {
			System.out.println("A����̽ó׿�!");
		} else if (num >= 80) {
			System.out.println("B����̽ó׿�");
		} else if (num >= 70) {
			System.out.println("C����̽ó׿�");
		} else {
			System.out.println("F����̽ó׿�");

		}

	}

}
