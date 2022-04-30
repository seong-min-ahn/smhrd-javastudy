package miniproject;


public class Pokemon {

	// 포켓몬 객체를 생성함

	// 필드
	String nick; // 포켓몬 이름
	String type; // 포켓몬 종류(리아코, 치코리타, 브케인)
	int lv; // 레벨(1부터 시작해서 10까지 증가함)
	int exp; // 경험치(0부터 시작해서 100이 되면 레벨이 1 오름)
	int full; // 포만도
	int happy; // 행복도
	int tired; // 피로도
	String id; // 회원 아이디
	String l_date; // 마지막으로 접속한 날짜와 시간
	String grade; // 진화 단계

	
	
	
	
	// 생성자 메소드
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

