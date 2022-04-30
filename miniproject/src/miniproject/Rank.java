package miniproject;


public class Rank {

	private String nick;
	private String id;
	private String grade;
	private int level;
	private int exp;
	private String date;

	public Rank(String nick, String id, String grade, int level, int exp, String date) {

		this.nick = nick;
		this.id = id;
		this.grade = grade;
		this.level = level;
		this.exp = exp;
		this.date = date;

	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}