import java.util.Scanner;

public class Ex02_1���Ǳ����α׷������ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int money, choi, change = 0;
		int price = 0;
		int thousand, fivehundred, onehundred = 0;

		System.out.println("-----���Ǳ� ���α׷�-----");
		System.out.print("�ݾ��� �־��ּ���>> ");
		money = scan.nextInt();

		while (true) {
			System.out.print("[1]�޴� ���� [2]�ܵ� ��ȯ�ϱ� >>");
			choi = scan.nextInt();
			if (choi == 2) {
				change = money;
				System.out.println("==�ܵ��� ��ȯ�մϴ�.== ");
				System.out.println("�ܵ�:" + change + "��");
				thousand = change / 1000;
				fivehundred = change % 1000 / 500;
				onehundred = change % 1000 % 500 / 100;
				System.out.println("õ��: " + thousand + "��");
				System.out.println("�����: " + fivehundred + "��");
				System.out.println("���: " + onehundred + "��");
				break;// �۾����� ����

			} else if (choi == 1) {
				System.out.println("==�޴��� ������=== ");
				System.out.print("[1]�ݶ�(800��) [2]�ֽĽ�(1200��) [3]��Ÿ500(2000��) >>");
				choi = scan.nextInt();

				if (choi == 1 && money >= 800) {
					change = money - 800;
					price = 800;
					System.out.println("�ݶ� ���Խ��ϴ�.");
				} else if (choi == 2 && money >= 1200) {
					change = money - 1200;
					price = 1200;
					System.out.println("�ֽĽ��� ���Խ��ϴ�.");
				} else if (choi == 3 && money >= 2000) {
					change = money - 2000;
					price = 2000;
					System.out.println("��Ÿ500�� ���Խ��ϴ�.");
				}
				if (choi == 1 && money < 800) {
					System.out.println("�ܾ��� �����մϴ�!!");
				} else if (choi == 2 && money < 1200) {
					System.out.println("�ܾ��� �����մϴ�!!");
				} else if (choi == 3 && money < 1500) {
					System.out.println("�ܾ��� �����մϴ�!!");
				}
				money -= price;
			}else {
				System.out.println("�߸� �Է� ������");
			}
		}
	}
}
