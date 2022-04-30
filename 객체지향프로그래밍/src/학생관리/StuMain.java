package 학생관리;

public class StuMain {

	public static void main(String[] args) {
		// 1. 설계도면을 가지고 객체 생성
		Student student1 = new Student("홍길동", "20164206", 23, 50, 59, 77);
		
		Student st = new Student(null, null, 0, 0, 0, 0);
		
		//생성자 
		
		
		
		//2. 생성된 객체의 데이터에 접근하기(설계도)
//		student1.name = "홍길동";
//		student1.number = "20164206";
//		student1.age = 22;
//		student1.javascore = 50;
//		student1.webscore = 89;
//		student1.androidscore = 77;
		System.out.println(student1.name);
		
		student1.show();
			
		

	}

}
