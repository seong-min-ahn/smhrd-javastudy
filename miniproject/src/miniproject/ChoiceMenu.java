package miniproject;

import java.util.Scanner;

public class ChoiceMenu {
	Activity act = new Activity();
	State st = new State();

	public void choice(Pokemon poke) {
		st.status(poke); // �������Ȯ��
		st.need(poke); // �䱸����
		while (true) { // �޴� ����
			Scanner sc = new Scanner(System.in);

			System.out.println(poke.getNick() + "��/�� ������ �غ����?");
			
			System.out.println("1. �� ���̱�");
			System.out.println("2. ����ֱ�");
			System.out.println("3. �� ����");
			System.out.println("4. ������ �׸� ���");
			
			int choice = sc.nextInt();

			if (choice == 3) { // ����
				act.sleep(poke);

			} else if (choice == 1) { // ���ֱ�
				act.eat(poke);

			} else if (choice == 2) { // ����ֱ�
				act.play(poke);

			} else if (choice == 4) { // ����
				System.out.println("���� �ٽ� ������!");
				break;
			} else { // ��� �̿��� ���� �Է�
				System.out.println("������ �� ���� �޴�����! �ٽ� �������ּ���!");
				System.out.println();
			}

		}

	}

}
