import java.util.Scanner;

public class Ex02_������� {

	public static void main(String[] args) {
		// �̸�, ����, ����, ���������� �Է¹޾� �հ�� ����� ����ϼ���!
		// ooo�� �հ�: _��, ��� : _��
		
		// 1. ������, 2. �Էº�/��º�(view), 3. ���� (control)
		Scanner sc = new Scanner(System.in);
		
		
		int kor=0, eng=0, math = 0, total = 0; 
		double avg = 0;
		
		//�Էº�/��º� 
		System.out.print("�̸� : ");
		String name = sc.next(); // ���ڿ� �Է¹޴� ���   ���ڿ��� Int�� �Ⱥ��� next��
		
		
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		math = sc.nextInt();
		
		//����
		total = kor + eng + math;
		avg= total / 3.0;
		
		//��� ���
		System.out.print("�հ� : "+ total);
		System.out.print("��� : "+ avg);
		
	}

}
