package Ex06_다형성_실습;

public class Korean extends Language{
	public String getTitleMSG() {
		return "===자판기 프로그램===";
	}
	public String getInputMSG() {
		return "돈을 넣으세요 >>";
	}
	public String getChoiceMSG() {
		return "메뉴를 선택하세요";
	}
	public String getMenuMSG() {
		return "1.물(700) 2.콜라(1000) 3.커피(500) >>";
	}
	public String getNoMoneyMSG() {
		return "돈이 부족합니다.";
	}
	public String getChangeMoneyMSG(int money) {
		return money + "원이 남았습니다.";
	}
}
