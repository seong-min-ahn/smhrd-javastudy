import java.util.Random;

// ��ȭ ��� State

public class State {

	Random rand = new Random();

	public void need(Pokemon poke) { // �䱸����
		if (poke.getFull() < 40) {
			System.out.println("[����] " + poke.getNick() + "(��)�� ����ĺ��Դϴ�!");
			System.out.println();
		}

		if (poke.getHappy() < 50) {
			System.out.println("[����] " + poke.getNick() + "(��)�� �ɽ��غ��Դϴ�!");
			System.out.println();
		}
		if (poke.getTired() > 70) {
			System.out.println("[����] " + poke.getNick() + "(��)�� �ǰ��غ��Դϴ�!");
			System.out.println();
		}
		if (poke.getFull() == 100) {
			System.out.println("[����] " + poke.getNick() + "(��)�� ��ҷ����Դϴ�!");
			System.out.println();
		}

	}

	public void status(Pokemon poke) { // ����Ȯ��
		System.out.println("<< ���� ���� >>");
		System.out.print("���ϸ� �̸� : " + poke.getNick() + "(" + poke.getGrade() + ")" + " / ");
		System.out.print("Lv. " + poke.getLv() + " (");

		int exp_gui_black = poke.getExp() / 10; // �� ����ŭ ���� �׸�
		int exp_gui_white = 10 - exp_gui_black; // �길ŭ ��� �׸�

		for (int i = 0; i <= (exp_gui_black - 1); i++) {
			System.out.print("��");
		}
		for (int i = 0; i <= (exp_gui_white - 1); i++) {
			System.out.print("��");
		}
		System.out.println(")");

		System.out.print("������ : " + poke.getFull() + " / ");
		System.out.print("�ູ�� : " + poke.getHappy() + " / ");
		System.out.println("�Ƿε� : " + poke.getTired());
		System.out.println();

	}

	public void upgrade(Pokemon poke) { // ��ȭ

		if (poke.getLv() == 3 && poke.getType().equals("������")) {
			poke.setGrade("��������");
			System.out.println("[�˸�] " + poke.getNick() + "(��)�� �������̷� ��ȭ�߽��ϴ�!");
			System.out.println();
		}

		if (poke.getLv() == 3 && poke.getType().equals("ġ�ڸ�Ÿ")) {
			poke.setGrade("���̸���");
			System.out.println("[�˸�] " + poke.getNick() + "(��)�� ���̸����� ��ȭ�߽��ϴ�!");
			System.out.println();
		}

		if (poke.getLv() == 3 && poke.getType().equals("������")) {
			poke.setGrade("��������");
			System.out.println("[�˸�] " + poke.getNick() + "(��)�� ������������ ��ȭ�߽��ϴ�!");
			System.out.println();
		}

		if (poke.getLv() == 8 && poke.getType().equals("������")) {
			poke.setGrade("��ũ�δ���");
			System.out.println("[�˸�] " + poke.getNick() + "(��)�� ��ũ�δ��Ϸ� ��ȭ�߽��ϴ�!");
			System.out.println();
		}

		if (poke.getLv() == 8 && poke.getType().equals("ġ�ڸ�Ÿ")) {
			poke.setGrade("�ް��Ͽ�");
			System.out.println("[�˸�] " + poke.getNick() + "(��)�� �ް��Ͽ����� ��ȭ�߽��ϴ�!");
			System.out.println();
		}

		if (poke.getLv() == 8 && poke.getType().equals("������")) {
			poke.setGrade("���̹�");
			System.out.println("[�˸�] " + poke.getNick() + "(��)�� ���̹����� ��ȭ�߽��ϴ�!");
			System.out.println();
		}

	}

	public void level_up(Pokemon poke) { // ������
		if (poke.getExp() >= 100) {
			
			System.out.println("[�˸�] " + poke.getNick() + "(��)�� ������ �ö����ϴ�!");
			poke.setExp(poke.getExp() - 100);
			poke.setLv(poke.getLv() + 1);

			System.out.println();
		}

	}

	public void die(Pokemon poke) { // ���
		if (poke.getFull() <= -50 || poke.getHappy() <= -50 || poke.getTired() > 150) {

			poke.setLv(1);
			poke.setExp(0);

			int poke_retry = rand.nextInt(2)+1;
			String type_retry = "";
			if (poke_retry == 1) {
				type_retry = "ġ�ڸ�Ÿ";
			} else if (poke_retry == 2) {
				type_retry = "������";
			} else if (poke_retry == 3) {
				type_retry = "������";
			}

			poke.setType(type_retry); // ġ�ڸ�Ÿ ������ ������

			poke.setFull(50);
			poke.setTired(50);
			poke.setHappy(50);
			poke.setGrade(poke.getType());

			System.out.println();
			System.out.print("[�˸�] " + "����� " + poke.getNick() + "��/�� �׿����ϴ�! ");
			System.out.println(poke.getNick() + "��/�� " + poke.getType() + "(��)�� �ٽ� ��Ƴ����ϴ�!");
			System.out.println();

		}

	}

}
