package Ex01_클래스와객체;

public class Main {

	public static void main(String[] args) {
		// object(객체)생성
		// 클래스명 변수명 =new 클래스명();
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.feed("고기");
		dog2.feed("사과");
		
		String result = dog1.poo();
		System.out.println("dog1이 "+ result +"를 줬습니다.");
		
		

	}

}
