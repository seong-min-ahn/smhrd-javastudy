package Ex03_ĳ����;

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		
		//��ĳ���� : ����Ÿ���� ����Ÿ������ ����ȯ
		//���� ��ü�� ��ȯ�Ǵ°� �ƴ϶� �����Ⱑ ����Ÿ������ ��ȯ�Ǵ°�.
		Animal a = c;
		
		//�ٿ�ĳ����: ����Ÿ���� ����Ÿ������ ����ȯ
		Cat c2 =(Cat) a;

	}

}
