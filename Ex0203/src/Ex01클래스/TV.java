package Ex01Ŭ����;//Ŭ������ ��ü

public class TV {
	// �ʵ�(data, �Ӽ�)
	 String �귣��;
	 String ����;
	private int ä��;
	private int ����;
	private boolean ���ͳݿ������;
	private boolean ��������;
	private float ȭ��ũ��;

	// �޼ҵ�(logic,���)
	public void ä�κ���(int ������ä��) {
		ä�� = ������ä��;
	}
	public void ä�ξ�() {
		if (ä�� <= 999) {
			ä��++;
		}else {
			ä�� = 0;
		}
	}
	public void ä�δٿ�() {
		if(ä��>0) {
			ä��--;
		}else {
			ä��=999;
		}
	}
	public void �����¿���() {
		�������� = !��������; 
	}
	public boolean ��������Ȯ��() {
		return ��������;
	}
	
}
