import java.util.Scanner;

public class Ex_04���ǹ��ǽ� {

	public static void main(String[] args) {
		//����1
		//���ڸ� �ϳ� �Է¹޾Ƽ� ���,����,0�� �Ǻ�
		
		//����2
		//�����ް�����α׷� 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�>> ");
		int num = sc.nextInt();
		
		if(num>0) { 
			System.out.println("��� �Դϴ�");
		}else if(num<0) {
			System.out.println("���� �Դϴ�");
		}else {
			System.out.println("0 �Դϴ�");
		}
		
	}

}
