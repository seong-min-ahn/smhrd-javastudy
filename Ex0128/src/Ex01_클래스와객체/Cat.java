package Ex01_Ŭ�����Ͱ�ü;
//�ܲ� 
public class Cat {
	String name;
	int hungry;
	int angry;
	
	public void feed(String food) {
		if(food.equals("��")) {
			System.out.println("�ȳ�");
			hungry += 20;
			
		}else {
			System.out.println("�Ͼƾ�!!");
		}
	}

}
