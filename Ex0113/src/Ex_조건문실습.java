import java.util.Scanner;

public class Ex_���ǹ��ǽ� {

	public static void main(String[] args) {
		//����,����,���� ������ �Է¹޾Ƽ� �հ�/���հ� ���θ� �������ְ� �ͽ��ϴ�
		//��� 70���� ������ �հ�, �Ѱ����̶� 60�� �̸��̸� ����!
		
		//80,90,80 -->�հ�
		//80,55,90--> ���հ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է�: ");
		int score1 = sc.nextInt();
		
		System.out.print("�������� �Է�: ");
		int score2 = sc.nextInt();
		
		System.out.print("�������� �Է�: ");
		int score3 = sc.nextInt();
		
		if ((((score1+score2+score3)/3)>=70)&&(score1>=60&&score2>=60&&score3>=60)){
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�");
			System.out.println((score1+score2+score3)/3<70?"����� 70�� �̸��Դϴ�":"");
			System.out.println(score1<60 ? "�������":"");
			System.out.println(score2<60 ? "�������":"");
			System.out.println(score3<60 ? "���а���":"");
			
			
			
				}
			
		}
		
	
		
		

	}
	


