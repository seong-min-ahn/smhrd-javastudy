package Person;

public class Main {

	public static void main(String[] args) {
		
		// 실행되는 공간
		//1. 설계도면을 가지고 객체(object) 생성
		Person nature = new Person(); 
		//new  -> 레퍼런스 변수 생성 키워드
		//레퍼런스 변수 -> 참조값, 주소값
		System.out.println(nature);
		
		nature.name = "조자연";
		System.out.println(nature.name);
		
		nature.gender= "여";
		nature.age = 23; 
		
		System.out.println(nature.gender);
		System.out.println(nature.age);
		
		// 기능 불러오기
		nature.eat();
		System.out.println(nature.sleep());
		
		//동일한 설계도면을 가지고 여러 개의 객체 생성 가능하다.
		//동일한 설계도면을 가지고 자기자신을 만듣어 보자.
		
		Person sm = new Person();
		sm.name = "안성민";
		sm.gender="남";
		sm.age=23;
		System.out.println(sm.name);
		System.out.println(sm.gender);
		System.out.println(sm.age);
		
				
		
		
	}
}
