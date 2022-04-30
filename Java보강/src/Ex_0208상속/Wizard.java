package Ex_0208상속;

public class Wizard extends Character{
	
	
	// 기존에 가지고 있던 jump()를 업그레이드 해서 사용해보자
	// 기존에 있던 메소드를 다시 '재정의' 해서 사용하는 것! -> 메소드 오버라이딩
	public void jump() {
		System.out.println("호잇쨔!! 2단 점프!!");
	}
	
	//wizard 만이 쓸 수 있는 기능도 생성 가능하다
	
	public void wing() {
		System.out.println("마법봉 휘두르기! ");
	}

}
