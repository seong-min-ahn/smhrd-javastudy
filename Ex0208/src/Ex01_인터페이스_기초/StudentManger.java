package Ex01_�������̽�_����;

//����� ������ �и�
//�߻�޼ҵ带 �ۼ�
public interface StudentManger {
	//1.�й��� ���� �л� 1���� ��ȸ�ϴ� ���
		String findStudent(String stuNum);
		//2. �л���ü�� ������ �����ִ� ���
		int[] showAllStudentScore();
		//3. �л� 1���� ������ �����ִ� ���
	    int showStudentScore(String stuNum);

}
