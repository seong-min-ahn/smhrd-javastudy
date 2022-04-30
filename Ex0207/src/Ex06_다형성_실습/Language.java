package Ex06_다형성_실습;

//추상클래스(abstract class) : 미구현 클래스, 미구현 설계도
//추상클래스를 상속 받는 하위 클래스는 추상메소드를 완전히 구현할 의무가 생긴다.
//추상클래스는 일반 메소드도 가질 수 있다.

public abstract class Language {
	//추상메소드(abstract method) : 미구현 메소드
	
	public abstract String getTitleMSG(); 
	public abstract String getInputMSG() ;
	public abstract String getChoiceMSG() ;
	public abstract String getMenuMSG();
	public abstract String getNoMoneyMSG();
	public abstract String getChangeMoneyMSG(int money);
	public String getVersion() {
		return "0.0.1";
	}
}
