import java.util.Scanner;

public class Ex03_����for������ {
	// ����for�� ������ ����
	// ���߿� ���� i,j�� ��ġ�� �ٲ�� ��
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//
//			for (int j = 2; j < 10; j++) {
//				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//			}
//			System.out.println();
//		}

		// *
		// **
		// *** --->�� ������� �� �ױ�
		// ****
		// *****
//		for (int i = 1; i <= 5; i++) {
//			// �� �ݺ� , 5�ٱ���
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//        }

//		Scanner scan = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		for (int i = 1; i <= num; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//�� �Ųٷ� ���
		for (int i = 0; i<6; i++) {
			for(int j=(6-i); j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
