import java.util.Scanner;

public class Ex08_���ǹ�����ifelse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		//60�� �̻��̸� �հ��Դϴ�. -> ���ǹ� if
		//60 �̸��̸� ���հ��Դϴ�.  ->������ �ƴ� ��� else			
		if (score>=60){
			System.out.println("�հ��Դϴ�");
			
		}else{//�׷��� ������ (else�� ���Ǿ��� �ʴ´� )
			System.out.println("���հ� �Դϴ�");
		}

	}

}
