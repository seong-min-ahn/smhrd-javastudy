package Ex02_������;

//VO : Value object 
public class Student {
	// �ʵ�
	protected String name; // �̸�
	protected String stuNum; // �й�
	protected int age; // ����
	//����������
	//public : �ʵ�, �޼ҵ带 ���� ���� �ܺ� Ŭ�������� �����Ӱ� ����ϵ��� �㰡
	//protected : �ʵ�, �޼ҵ带 �ܺο��� ������� ��� �� �� ���� ��ȣ,
	//�� ��Ӱ��迡���� ������ ���
	//private : �ʵ�, �޼ҵ带 �ܺο��� ������� ��� �� �� ���� ��ȣ
	
	protected int javaScore;
	protected int databaseScore;
	protected int pythonScore;
	protected double avg; // �������

	// ������: ��ü�� �����ϴ� �޼ҵ�
	// 1.��ȯŸ���� �������� �ʴ´�.
	// 2. �޼ҵ� �̸��� Ŭ���� �̸��� �Ȱ���.
	// 3. ��ü�� �����ɶ� �� �ѹ��� ȣ�Ⱑ��.

//	public Student() {// ����Ʈ ������
//
//	}
	// ������ �����ε�
	public Student(String name, String stuNum) {
		this.name = name;
		this.stuNum = stuNum;
	}
	// �޼ҵ�
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
