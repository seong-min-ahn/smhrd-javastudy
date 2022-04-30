package miniproject;


public class User {

	private String id;
	private String password;
	private String name;
	private int p_check;

	public User(String id, String password, String name, int p_check) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.p_check = p_check;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getP_check() {
		return p_check;
	}

	public void setP_check(int p_check) {
		this.p_check = p_check;
	}

}
