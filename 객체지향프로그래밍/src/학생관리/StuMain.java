package �л�����;

public class StuMain {

	public static void main(String[] args) {
		// 1. ���赵���� ������ ��ü ����
		Student student1 = new Student("ȫ�浿", "20164206", 23, 50, 59, 77);
		
		Student st = new Student(null, null, 0, 0, 0, 0);
		
		//������ 
		
		
		
		//2. ������ ��ü�� �����Ϳ� �����ϱ�(���赵)
//		student1.name = "ȫ�浿";
//		student1.number = "20164206";
//		student1.age = 22;
//		student1.javascore = 50;
//		student1.webscore = 89;
//		student1.androidscore = 77;
		System.out.println(student1.name);
		
		student1.show();
			
		

	}

}
