import java.util.Scanner;

public class Ex02_�迭�˶� {

	public static void main(String[] args) {
//		// ȸ�� 5�� ID(String)������ �迭~~
		String[] member = { "������", "�ڼ���", "Ȳ�ص�", "ä����", "��ȫ��" };
//		
//		//�迭�� 1�� ��� ����غ���
//		System.out.println(member[1]);
//		
//		//�迭�� 3�� ��� ����غ���!!
//		System.out.println(member[3]);
//		
//		//�迭�� ���ҿ� ���ϴ� ���! �迭�̸�[�ε���]�̴�.
//		//2�ڸ��� "�ں���" �̸� �ֱ�
//		member[2]="�ں���";
//		System.out.println(member[2]);
//		
//		//id�� ���� �Է¹޾� ���� ���̵�� �ߺ����� �ƴ��� �˻��ϱ�!
//		
//		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID�Է� : "); 
		String newId= scan.next(); 
		for(int i = 0; i<5; i++) {
			if ( member[i].equals(newId)) {
				System.out.println("�ߺ�");
			}
		}
	    

	}

}
