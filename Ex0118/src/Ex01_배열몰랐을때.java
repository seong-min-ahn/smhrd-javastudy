import java.util.Scanner;

public class Ex01_�迭�������� {

	public static void main(String[] args) {
		//ȸ������ �Ҷ� ���̵� �ߺ�üũ��� ����
		//�⺻ ���ԵǾ��ִ� ȸ���� 5��
		//���� �����Ϸ��� ����� ���̵� �ߺ��Ǵ��� Ȯ���ϰ� �ʹ�!
		
		//�ƾƵ�ϱ� ���ڿ� ������ �����ؾ߰ڴ�!!
		String id1 = "������";
		String id2 = "�ڼ���";
		String id3 = "Ȳ�ص�";
		String id4 = "ä����";
		String id5 = "��ȫ��";
		
		//���� �����Ϸ��� ��� id �Է��ϱ�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID>> ");
		String ���ο���̵� = scan.next();
		
		//���࿡ ù��° ����̶� �ߺ��̸� ���̵��ߺ��̶�� ���
		if(id1.equals(���ο���̵�));{
			System.out.println("���̵��ߺ�!"); 
		}
		//���࿡ �ι�° ����̶� �ߺ��̸� ���̵��ߺ��̶�� ���
		if(id2.equals(���ο���̵�));{
			System.out.println("���̵��ߺ�!");
		}
		

	}

}
