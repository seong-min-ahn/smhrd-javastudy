package Ex01_인터페이스_기초;

//설계와 구현을 분리
//추상메소드를 작성
public interface StudentManger {
	//1.학번을 통해 학생 1명을 조회하는 기능
		String findStudent(String stuNum);
		//2. 학생전체의 성적을 보여주는 기능
		int[] showAllStudentScore();
		//3. 학생 1명의 성적을 보여주는 기능
	    int showStudentScore(String stuNum);

}
