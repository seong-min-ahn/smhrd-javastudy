package 학생관리;

public class Student {
	//학생들의 정보를 관리할 수 있는 설계도
	// 설계도는 설계만 진행할 수 있으므로 객체를 생성하는 main()x
	
	//1. 필드 : 데이터, 속성
	//이름, 학번,나이,
	//자바점수, 웹점수, 안드로이드 점수
	String name;
	String number;
	int age;  
	int javascore;
	int webscore;
	int androidscore;
	
	// 생성자 메소드 생성하기
	// 접근지정자, 리턴타입x, 메소드이름 (= 클래스이름동일)
	// 생성자 메소드가 받아들일 매개변수 존재한다.
	
	// 객체를 생성할 때 field에 있는 데이터를 초기화 시킬 수 있는 메서드 생성
	//생성자
	//1) 생성자도 메소드이다.
	//2) 메서드의 이름이 클래스의 이름과 동일한 이름을 갖는다.
	//3) 리턴타입을 지정하지 않는다 -> void x
	//4) 매개변수로 아무것도 받지 않는 생성자를 기본생성자라고 부른다.
	// ------> 기본 생성자는 생략가능하다.
	// ------> 단, 새로운 생성자를 만든다면 기본 생성자는 덮어씌워진다.

	
	//alt + shift + s -> generate constructor using fields 
	public Student(String name,String number, int age, int javascore,int webscore, int androidscore ) {
		this.name = name;
		this.number=number;
		this.age=age;
		this.javascore = javascore;
		this.webscore = webscore;
		this.androidscore=androidscore;
	}
	
	//2. 메서드 : 기능,로직  	`
	//show()메소드 생성
	// 접근제한자 + 리턴타입 + 메소드 이름
	

    
	public void show() {
		System.out.println(name + "님 안녕하세요");
		System.out.println("["+number+"," +age+"살]");
		System.out.println(name + "님의 java점수는"+javascore+"점 입니다");
		System.out.println(name + "님의 웹점수는"+webscore+"점 입니다");
		System.out.println(name + "님의 안드로이드점수는"+androidscore+"점 입니다");
	}
	
	

}
