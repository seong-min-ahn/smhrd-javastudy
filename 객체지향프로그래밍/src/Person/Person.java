package Person;

public class Person {
	//클래스 == 설계도면 == 객체를 생성하기 전 우리가 직접 설계하는 도면
	//1. 필드(field)
	//: 데이터, 속성
	
	// 이름, 나이, 성별
	String name;
	int age;
	String gender;
	
	//2. 메소드(Method)
	//: 행위, 기능, 로직

	// 밥먹기,
	public void eat() {
		System.out.println("나는 쿰척쿰척하는 중");
	}
	
	//잠을 잔다.
	public String sleep() {
		return   "쿨쿨잠자는 중!! zz";
	}
	
	
}
