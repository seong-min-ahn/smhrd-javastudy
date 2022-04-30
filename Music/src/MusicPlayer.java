import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice =0;
		MusicController mc = new MusicController();
		int i = 0;
		Boolean a = true;
		while (a) {
			System.out.println("====�����÷��̾�====");
			System.out.print("1.��� 2.��� 3. ���� 4.������ 5. ������ 6. ����.>>");
			 choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("====���====");
				System.out.print("����: ");
				String title = scan.next();
				System.out.println("���� : ");
				String singer = scan.next();
				System.out.println("�ð� : ");
				int playTime = scan.nextInt();
				mc.insertMusic(title, singer, playTime);
			} else if (choice == 2) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("����� ����ֽ��ϴ�.");
				} else {
					mc.show();
				}
			} else if (choice == 3) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("����� ���� �����ϴ�");
	
				} else {
					mc.play(i);
				}
			} else if (choice == 4) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("����� ���� �����ϴ�.");
		
				} else if (list.size() == 1) {
					System.out.println("���� �ϳ����Դϴ�.");
				}
				if (i == 0) {
					i = list.size() - 1;
					mc.play(i);
				} else {
					i -= 1;
					mc.play(i);
				}
			} else if (choice == 5) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("����� ���� �����ϴ�.");
				
				} else if (list.size() == 1) {
					System.out.println("���� �ϳ����Դϴ�.");
				}
				if (i == list.size() - 1) {
					i = 0;
					mc.play(i);
				} else {
					i += 1;
					mc.play(i);
				}
			} else if (choice == 6) {
				System.out.println("����Ǿ����ϴ�.");
				a = false;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		

	}

}
