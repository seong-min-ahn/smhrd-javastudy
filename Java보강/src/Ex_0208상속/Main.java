package Ex_0208���;

public class Main {

	public static void main(String[] args) {

		// ���� ������ ĳ���� ��ü �����

		Warrior ch1 = new Warrior();

		ch1.move();
		ch1.attack();
		ch1.jump();

	    System.out.println();
		Wizard ch2 = new Wizard();

		ch2.move();
		
		ch2.attack();
		ch2.jump();
		ch2.wing(); // wizard Ŭ������ ������ �ִ� �޼ҵ�

	}

}
