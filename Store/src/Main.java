import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StoreController C = new StoreController();
		
		while(true) {
			System.out.print("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5]���� >>");
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.print("====������ ����====");
				C.showRestaurant();
			}else if(choice ==2) {
				System.out.println("====�̿�� ����====");
				C.showSalon();
			}else if(choice==3) {
				System.out.println("====������====");
				System.out.print("���Ը� �Է� : ");
				String name = sc.next();
			}else if(choice==4) {
				C.showScore();
			}else if(choice ==5) {
				System.out.println("�����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}

	}

}
