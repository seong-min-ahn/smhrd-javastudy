package miniproject;


public class Pokemon {

	// ���ϸ� ��ü�� ������

	// �ʵ�
	String nick; // ���ϸ� �̸�
	String type; // ���ϸ� ����(������, ġ�ڸ�Ÿ, ������)
	int lv; // ����(1���� �����ؼ� 10���� ������)
	int exp; // ����ġ(0���� �����ؼ� 100�� �Ǹ� ������ 1 ����)
	int full; // ������
	int happy; // �ູ��
	int tired; // �Ƿε�
	String id; // ȸ�� ���̵�
	String l_date; // ���������� ������ ��¥�� �ð�
	String grade; // ��ȭ �ܰ�

	
	
	
	
	// ������ �޼ҵ�
	public Pokemon(String nick, String type, String id, String l_date) {

		this.nick = nick;
		this.type = type;
		this.lv = 1;
		this.exp = 0;
		this.full = 50;
		this.happy = 50;
		this.tired = 50;
		this.id = id;
		this.l_date = l_date;
		this.grade = "";

	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getFull() {
		return full;
	}

	public void setFull(int full) {
		this.full = full;
	}

	public int getHappy() {
		return happy;
	}

	public void setHappy(int happy) {
		this.happy = happy;
	}

	public int getTired() {
		return tired;
	}

	public void setTired(int tired) {
		this.tired = tired;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getL_date() {
		return l_date;
	}

	public void setL_date(String l_date) {
		this.l_date = l_date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}

