package Person;

public class Main {

	public static void main(String[] args) {
		
		// ����Ǵ� ����
		//1. ���赵���� ������ ��ü(object) ����
		Person nature = new Person(); 
		//new  -> ���۷��� ���� ���� Ű����
		//���۷��� ���� -> ������, �ּҰ�
		System.out.println(nature);
		
		nature.name = "���ڿ�";
		System.out.println(nature.name);
		
		nature.gender= "��";
		nature.age = 23; 
		
		System.out.println(nature.gender);
		System.out.println(nature.age);
		
		// ��� �ҷ�����
		nature.eat();
		System.out.println(nature.sleep());
		
		//������ ���赵���� ������ ���� ���� ��ü ���� �����ϴ�.
		//������ ���赵���� ������ �ڱ��ڽ��� ����� ����.
		
		Person sm = new Person();
		sm.name = "�ȼ���";
		sm.gender="��";
		sm.age=23;
		System.out.println(sm.name);
		System.out.println(sm.gender);
		System.out.println(sm.age);
		
				
		
		
	}
}
