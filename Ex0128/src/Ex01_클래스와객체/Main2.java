package Ex01_Ŭ�����Ͱ�ü;

public class Main2 {

	public static void main(String[] args) {
		//Ŭ������ ������ =new Ŭ������();
		//������Ÿ�� ������ = ��;
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.name = "�ǻ�";
		System.out.println(d.name);
		
		c.name="����";
		System.out.println(c.name);
		
		d.lick(c); 
		
		System.out.println(c.name+"�� ȭ������: "+c.angry);

	}

}
