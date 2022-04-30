package Ex_0208상속;

public class Main {

	public static void main(String[] args) {

		// 내가 생성한 캐릭터 객체 만들기

		Warrior ch1 = new Warrior();

		ch1.move();
		ch1.attack();
		ch1.jump();

	    System.out.println();
		Wizard ch2 = new Wizard();

		ch2.move();
		
		ch2.attack();
		ch2.jump();
		ch2.wing(); // wizard 클래스만 가지고 있는 메소드

	}

}
