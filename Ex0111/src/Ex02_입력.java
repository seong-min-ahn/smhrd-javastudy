import java.util.Scanner;

public class Ex02_�Է� {

	public static void main(String[] args) {
		//�Է� �޴� ���! (��ǻ�Ͱ� ��������� �Է¹޴� ��!)
		// 1) �Է¹޴� ���� �ʿ�!
	    Scanner scan = new Scanner(System.in);
	    
	    // 2)���� ���!
	    //2_1 ���� �Է¹ޱ�
	    System.out.print("���ڸ� �Է��ϼ���>> ");
	    int num = scan.nextInt();
	    //4byte ������ num�̶�� �̸��� �޸𸮸� �����ϰ� scanner�� ���� �Է¹��� ���� �����Ͻÿ�.
	    
	    //2-2 �Է��� ���ڸ� 2�� ������ ������ְ� �ʹپƾ�
	    // �Է��� ���ڸ� �����س�����(���)>> ����!
	    System.out.println(num/2);
	    
	}

}
