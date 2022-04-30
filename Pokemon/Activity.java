
import java.util.Random;

public class Activity {
	State st = new State();

	Random rand = new Random();

	public void eat(Pokemon poke) {
		
		System.out.println();
		System.out.println(poke.getNick() + "���� ���� �Կ����ϴ�!");
		System.out.println();

		int full_up_rand = (rand.nextInt(2)+8) * 10; // rand.nextInt(80,101) ���� ������ �������� 80~100 ���̷� ����
		int happy_up_rand = (rand.nextInt(2)+5) * 10; // rand.nextInt(50,71) � �ൿ�� �ϰ� �ູ���� ���� ���� 50~70 ���̷� ����
		int tired_up_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) � �ൿ�� �ϰ� �Ƿε��� ���� ���� 10~30 ���̷� ����
		int exp_up_rand = (rand.nextInt(5)+4) * 10; // rand.nextInt(40,91) � �ൿ�� �ϰ� ����ġ�� ���� ���� 40~90 ���̷� ����

		int full_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) � �ൿ�� �ϰ� �������� ������ ���� 10~30 ���̷� ������
		int happy_down_rand = (rand.nextInt(1)+2) * 10; // rand.nextInt(20,31) � �ൿ�� �ϰ� �ູ���� ������ ���� 20~30 ���̷� ������
		int tired_down_rand = (rand.nextInt(4)+5) * 10; // rand.nextInt(50,91) � �ൿ�� �ϰ� �Ƿε��� ������ ���� 50~90 ���̷� ������

	

		poke.setTired(poke.getTired() + tired_up_rand); // �� �Ƿε�

		if (poke.getFull() >= 80) { // �� �ູ��
			poke.setHappy(poke.getHappy() - happy_down_rand);
		} else {
			poke.setHappy(poke.getHappy() + happy_up_rand);
			if (poke.getHappy() >= 100) {
				poke.setHappy(100);
			}
		}

		// �������� 90�ε� ���� �Ծ �������� 80�� �ö������ ��쿡 ������ �������� ������ ���� ����
		// ���� ���������� ���� ������ �ٽ� ������ �̾ƹ����� ������� �ذ��� �� ����

		while (poke.getFull() > full_up_rand) { // �� ������

			full_up_rand = (rand.nextInt(2)+10) * 10;

		}
		poke.setFull(full_up_rand);

		// �� ����ġ
		poke.setExp(poke.getExp() + exp_up_rand);
		st.die(poke);
		st.level_up(poke);
		st.upgrade(poke);
		st.status(poke);
		st.need(poke);
		
	

	}

	public void play(Pokemon poke) {

		System.out.println();
		System.out.println(poke.getNick() + "(��)�� ����־����ϴ�!");
		System.out.println();
		
		int full_up_rand = (rand.nextInt(2)+8) * 10; // rand.nextInt(80,101) ���� ������ �������� 80~100 ���̷� ����
		int happy_up_rand = (rand.nextInt(2)+5) * 10; // rand.nextInt(50,71) � �ൿ�� �ϰ� �ູ���� ���� ���� 50~70 ���̷� ����
		int tired_up_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) � �ൿ�� �ϰ� �Ƿε��� ���� ���� 10~30 ���̷� ����
		int exp_up_rand = (rand.nextInt(5)+4) * 10; // rand.nextInt(40,91) � �ൿ�� �ϰ� ����ġ�� ���� ���� 40~90 ���̷� ����

		int full_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) � �ൿ�� �ϰ� �������� ������ ���� 10~30 ���̷� ������
		int happy_down_rand = (rand.nextInt(1)+2) * 10; // rand.nextInt(20,31) � �ൿ�� �ϰ� �ູ���� ������ ���� 20~30 ���̷� ������
		int tired_down_rand = (rand.nextInt(4)+5) * 10; // rand.nextInt(50,91) � �ൿ�� �ϰ� �Ƿε��� ������ ���� 50~90 ���̷� ������

		

		poke.setTired(poke.getTired() + tired_up_rand); // ��� �Ƿε�

		if (poke.getTired() >= 80) { // ��� �ູ��
			poke.setHappy(poke.getHappy() - happy_down_rand); //
		} else {
			poke.setHappy(poke.getHappy() + happy_up_rand);
		}
		if (poke.getHappy() > 100) {
			poke.setHappy(100);
		}

		poke.setFull(poke.getFull() - full_down_rand); // ��� ������

		poke.setExp(poke.getExp() + exp_up_rand); // ��� ����ġ

		st.die(poke);
		st.level_up(poke);
		st.upgrade(poke);
		st.status(poke);
		st.need(poke);
		
		
	
	

	}

	public void sleep(Pokemon poke) {
		System.out.println();
		System.out.println(poke.getNick() + "��/�� ������ϴ�!");
		System.out.println();

		int full_up_rand = (rand.nextInt(2)+8) * 10; // rand.nextInt(80,101) ���� ������ �������� 80~100 ���̷� ����
		int happy_up_rand = (rand.nextInt(2)+5) * 10; // rand.nextInt(50,71) � �ൿ�� �ϰ� �ູ���� ���� ���� 50~70 ���̷� ����
		int tired_up_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) � �ൿ�� �ϰ� �Ƿε��� ���� ���� 10~30 ���̷� ����
		int exp_up_rand = (rand.nextInt(5)+4) * 10; // rand.nextInt(40,91) � �ൿ�� �ϰ� ����ġ�� ���� ���� 40~90 ���̷� ����

		int full_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) � �ൿ�� �ϰ� �������� ������ ���� 10~30 ���̷� ������
		int happy_down_rand = (rand.nextInt(1)+2) * 10; // rand.nextInt(20,31) � �ൿ�� �ϰ� �ູ���� ������ ���� 20~30 ���̷� ������
		int tired_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(50,91) � �ൿ�� �ϰ� �Ƿε��� ������ ���� 10~30 ���̷� ������


		poke.setTired(poke.getTired() - tired_down_rand); // �� �Ƿε�
		if (poke.getTired() < 0) {
			poke.setTired(0);
		}

		
		poke.setHappy(poke.getHappy() + happy_up_rand); // �� �ູ��
		if(poke.getHappy() > 100) {
			poke.setHappy(100);
		}
		
		
		poke.setFull(poke.getFull() - full_down_rand); // �� ������
		
		
		poke.setExp(poke.getExp() + exp_up_rand); // �� ����ġ

		st.die(poke);
		st.level_up(poke);
		st.upgrade(poke);
		st.status(poke);
		st.need(poke);

	
	}

}
