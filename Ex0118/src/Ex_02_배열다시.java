import java.util.Scanner;

public class Ex_02_�迭�ٽ� {

	public static void main(String[] args) {
		String[] member = { "������", "�ڼ���", "Ȳ�ص�", "ä����", "��ȫ��" };
		Scanner scan = new Scanner(System.in);
		System.out.print("ID�Է� : ");
		String newId= scan.next();
		for(int i = 0; i<5; i++) {
			if ( member[i].equals(newId)) {
				System.out.println("�ߺ�");
			}
		}

	}

}
 