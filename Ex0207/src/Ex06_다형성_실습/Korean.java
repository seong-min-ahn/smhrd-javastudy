package Ex06_������_�ǽ�;

public class Korean extends Language{
	public String getTitleMSG() {
		return "===���Ǳ� ���α׷�===";
	}
	public String getInputMSG() {
		return "���� �������� >>";
	}
	public String getChoiceMSG() {
		return "�޴��� �����ϼ���";
	}
	public String getMenuMSG() {
		return "1.��(700) 2.�ݶ�(1000) 3.Ŀ��(500) >>";
	}
	public String getNoMoneyMSG() {
		return "���� �����մϴ�.";
	}
	public String getChangeMoneyMSG(int money) {
		return money + "���� ���ҽ��ϴ�.";
	}
}
