import java.util.Scanner;

public class Ex_04_���ǹ��ǽ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���>> ");
		int pay = sc.nextInt();
		
		
//		if(99>=pay) {
//			System.out.println("�� �޿��� "+ (pay+0)+"�Դϴ�.");
//		}else if(100<=pay&&199>=pay) {
//			System.out.println("�� �޿���"+ (pay+20)+"�Դϴ�.");
//		}else if(200<=pay&&299>=pay) {
//			System.out.println("�� �޿���"+(pay+30)+"�Դϴ�.");
//		}else if(300<=pay)
//			System.out.println("�� �޿���" +(pay+50)+"�Դϴ�.");
		
		int bonus = 0;

		if(99>=pay) {
			 bonus = 0;
			// ���ǹ� �ȿ��� ������ ������ ���ǹ� �ȿ����ۿ� ����.
		}else if(100<=pay&&199>=pay) {
			bonus=20;
		}else if(200<=pay&&299>=pay) {
			bonus=30;
    	}else if(300<=pay)
    		bonus=50;
		
		pay+= bonus;
		System.out.println("�� �޿��� "+pay +"���� �Դϴ�.");
		
		
		
		
		
		
	}

}
