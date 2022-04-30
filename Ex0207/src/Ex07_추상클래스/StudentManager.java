package Ex07_추상클래스;

public abstract class StudentManager {
	//1.학번을 통해 학생 1명을 조회하는 기능
	public abstract String findStudent(String stuNum);
	//2. 학생전체의 성적을 보여주는 기능
	public abstract int[] showAllStudentScore();
	//3. 학생 1명의 성적을 보여주는 기능
	public abstract int showStudentScore(String stuNum);

}
