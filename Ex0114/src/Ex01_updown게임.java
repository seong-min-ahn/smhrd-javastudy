import java.util.Random;
import java.util.Scanner;

public class Ex01_updown���� {

	public static void main(String[] args) {
		//1)��ǻ�Ͱ� �������� 1~100���� �ϳ� �̴���!
		//2)���ڸ� �Է��Ѵ�!
		//3)���������� �Է��� ���� �� ũ�� down�̶�� ����Ѵ�!
		//4)���������� �Է��� ���� �� ������ up�̶�� ����Ѵ�!
		//5)���߸�! ���Ÿ��� �԰� �׾� �׹߷� ��~~ �׹߷� ��~~ ����Ѵ�!
		
		//���� �� �̴� ��! (*Scanner�� �򰥸��� ����!!!*)
		//1. �����غ�
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		//2. 2.���ڻ̱�!
		//int rdNum= rd.nextInt(100)+1; 1���� 100
		//int rdNum= rd.nextInt(100);   0���� 99
		//int rdNum= rd.nextInt(10,100);   10���� 99(0~n-1)
		//int rdNum= rd.nextInt(90)+10; // 0~99(0 ~ n-1) 
		
		//�ݺ����̶�? Ư�� ������ ������ ������ �۾��� �ݺ��Ͽ� �����ϴ� ��!
		int rdNum= rd.nextInt(10,100);
		int user = 0;
		System.out.println("���� �� : " + rdNum);
		
		while(rdNum != user) {//�ݺ��� ��ӵ� ���� =>Ʋ������ �ݺ�!
			System.out.print("(10~99) �� �Է�>>");			
			user = sc.nextInt();
			
			 if(rdNum>user) {
				System.out.println("up");
			}else if(user>rdNum) {
				System.out.println("down");
			}else {
				System.out.println("���Ÿ��� ");
				break;               //break�� �ݺ����� ���������� ���
			}
		}
			
		
		
		

	}

}
