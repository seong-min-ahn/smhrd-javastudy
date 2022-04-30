package Ex02_생성자;

//VO : Value object 
public class Student {
	// 필드
	protected String name; // 이름
	protected String stuNum; // 학번
	protected int age; // 나이
	//접근제한자
	//public : 필드, 메소드를 제약 없이 외부 클래스에서 자유롭게 사용하도록 허가
	//protected : 필드, 메소드를 외부에서 마음대로 사용 할 수 없게 보호,
	//단 상속관계에서는 접근을 허용
	//private : 필드, 메소드를 외부에서 마음대로 사용 할 수 없게 보호
	
	protected int javaScore;
	protected int databaseScore;
	protected int pythonScore;
	protected double avg; // 평균점수

	// 생성자: 객체를 생성하는 메소드
	// 1.반환타입이 존재하지 않는다.
	// 2. 메소드 이름이 클래스 이름과 똑같다.
	// 3. 객체가 생성될때 딱 한번만 호출가능.

//	public Student() {// 디폴트 생성자
//
//	}
	// 생성자 오버로딩
	public Student(String name, String stuNum) {
		this.name = name;
		this.stuNum = stuNum;
	}
	// 메소드
	public void calAvg() {
		avg = (javaScore + databaseScore + pythonScore) / 3.0;
	}
	public void setjavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public void setDatabaseScore(int databaseScore) {
		this.databaseScore = databaseScore;
	}
	public void setpythonScore(int pythonScore) {
		this.pythonScore = pythonScore;
	}
	public String getName() {
		return this.name;
	}
	public double getAvg() {
		return avg;
	}
	
	
	
//	public int getJavaScore() {
//		return javaScore;
//	}
//	public int getDatabaseScore() {
//		return databaseScore;
//	}
//	public int getpythonScore() {
//		return pythonScore;
//	}

}
