package Ex06_������_�ǽ�;

//�߻�Ŭ����(abstract class) : �̱��� Ŭ����, �̱��� ���赵
//�߻�Ŭ������ ��� �޴� ���� Ŭ������ �߻�޼ҵ带 ������ ������ �ǹ��� �����.
//�߻�Ŭ������ �Ϲ� �޼ҵ嵵 ���� �� �ִ�.

public abstract class Language {
	//�߻�޼ҵ�(abstract method) : �̱��� �޼ҵ�
	
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
