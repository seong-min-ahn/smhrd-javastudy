package Ex01_Ŭ�����Ͱ�ü;

//���赵
public class Dog {
	//�Ӽ�,data,�ʵ�
	String name;
	int age;
	int hungry; //�����
	int ddong;  //�躯�屸 
	
	//�ൿ, logic,�޼ҵ�
	public void bark() {
		System.out.println("�۸۸�");
	}
	public void feed(String food) {
		if(food.equals("���")) {
			System.out.println("�пп� �ų���!");
			hungry += 20;
			ddong+= 5;
			
		}else {
			System.out.println("��...����");
		}
	}
	public String poo() {
		ddong =0;
		return "�߱��� ����";
	}
    
	public void lick(Cat c) {//�Ӵ� ����
		System.out.println(c.name + "�� �I��. ������");
		c.angry += 50;
	}
}
