package Ex01_클래스와객체;

public class Main2 {

	public static void main(String[] args) {
		//클래스명 변수명 =new 클래스명();
		//데이터타입 변수명 = 값;
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.name = "뽀삐";
		System.out.println(d.name);
		
		c.name="찰스";
		System.out.println(c.name);
		
		d.lick(c); 
		
		System.out.println(c.name+"의 화난정도: "+c.angry);

	}

}
