package Ex01_Ŭ�����Ͱ�ü;

public class Main {

	public static void main(String[] args) {
		// object(��ü)����
		// Ŭ������ ������ =new Ŭ������();
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.feed("���");
		dog2.feed("���");
		
		String result = dog1.poo();
		System.out.println("dog1�� "+ result +"�� ����ϴ�.");
		
		

	}

}
