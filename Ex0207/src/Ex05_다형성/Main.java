package Ex05_다형성;

public class Main {

	public static void main(String[] args) {
		//다형성: 똑같은 메소드를 이용해서 객체에 따라 다양한 결과가 나오도록 지원하는 기법
		
		Animal animal = new Dog();
		animal.eat(); //상위클래스의 eat이 아니라 실제 객체의 재정의된 eat이 호출
		
	}

}
