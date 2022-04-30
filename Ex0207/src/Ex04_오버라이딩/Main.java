package Ex04_오버라이딩;

public class Main {

	public static void main(String[] args) {
		//메소드 오버로딩(중복정의)

		
		//메소드 오버라이딩(재정의)
		//1. 상속관ㄱ계에서 가능
		//2. 상위클래스로부터 물려받은 메소드를 다시 작성하는 기법
		//3. 메소드의 시그니쳐(반환타입, 이름, 매개변수)가 상위클래스의 메소드와 동이
		
		Cat c = new Cat();
		c.eat();
		
		Dog d = new Dog();
		d.eat();

	}

}
