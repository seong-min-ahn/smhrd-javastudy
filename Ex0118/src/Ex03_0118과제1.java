import java.util.Scanner;

public class Ex03_0118����1 {

	public static void main(String[] args) {
		// �ϰ���� ����6���̻� �ְ�
		// �˻��� �ϳ� �Է¹޾� ����翡 �ִ���
		// EX ��ȭ���������
		// �Է�:��
		// �������� 3��° ����!

		String[] city = { "�ͻ�", "�λ�", "����", "����", "��õ", "����" };

		Scanner sc = new Scanner(System.in);
		System.out.print("(�ͻ�, �λ�, ����, ����, ��õ, ����)�� ��� ���� ���� ���� : ");

		String a = sc.next();
//        int num = 0;
//        
//		for (int i = 0; i <= 5; i++) {
//			if (city[i].equals(a)) {
//				num++;
//				System.out.println(a + "�� ��� ���� ����" + (i + 1) + "���̾�!!!!");
//				
//			}
//		}
//		if(num!=1) {  //num == 0�� ����        if�� ������ �ѹ��� true������ �����ٸ�
//			System.out.println("�������� ����");
//		}
		
		//�ٸ� ���
		boolean A = false;
		for(int i =0; i <=5; i++) {
			if(city[i].equals(a)) {
				System.out.println(a + "��"+ (i+1)+ "��°");
				A = true;
			}
		}
		if(!A) {
			System.out.println("�������� ����");
		}
		

	}
}
