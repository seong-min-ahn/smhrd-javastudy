package �л�����;

public class Student {
	//�л����� ������ ������ �� �ִ� ���赵
	// ���赵�� ���踸 ������ �� �����Ƿ� ��ü�� �����ϴ� main()x
	
	//1. �ʵ� : ������, �Ӽ�
	//�̸�, �й�,����,
	//�ڹ�����, ������, �ȵ���̵� ����
	String name;
	String number;
	int age;  
	int javascore;
	int webscore;
	int androidscore;
	
	// ������ �޼ҵ� �����ϱ�
	// ����������, ����Ÿ��x, �޼ҵ��̸� (= Ŭ�����̸�����)
	// ������ �޼ҵ尡 �޾Ƶ��� �Ű����� �����Ѵ�.
	
	// ��ü�� ������ �� field�� �ִ� �����͸� �ʱ�ȭ ��ų �� �ִ� �޼��� ����
	//������
	//1) �����ڵ� �޼ҵ��̴�.
	//2) �޼����� �̸��� Ŭ������ �̸��� ������ �̸��� ���´�.
	//3) ����Ÿ���� �������� �ʴ´� -> void x
	//4) �Ű������� �ƹ��͵� ���� �ʴ� �����ڸ� �⺻�����ڶ�� �θ���.
	// ------> �⺻ �����ڴ� ���������ϴ�.
	// ------> ��, ���ο� �����ڸ� ����ٸ� �⺻ �����ڴ� ���������.

	
	//alt + shift + s -> generate constructor using fields 
	public Student(String name,String number, int age, int javascore,int webscore, int androidscore ) {
		this.name = name;
		this.number=number;
		this.age=age;
		this.javascore = javascore;
		this.webscore = webscore;
		this.androidscore=androidscore;
	}
	
	//2. �޼��� : ���,����  	`
	//show()�޼ҵ� ����
	// ���������� + ����Ÿ�� + �޼ҵ� �̸�
	

    
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���");
		System.out.println("["+number+"," +age+"��]");
		System.out.println(name + "���� java������"+javascore+"�� �Դϴ�");
		System.out.println(name + "���� ��������"+webscore+"�� �Դϴ�");
		System.out.println(name + "���� �ȵ���̵�������"+androidscore+"�� �Դϴ�");
	}
	
	

}
