package EX01�����������α׷�_���׷��̵�;

import java.util.Scanner;

import Ex02_������.Student;

public class Main {

	public static void main(String[] args) {
		// ���(1. �л����, 2.�����Է�, 3. ��ü������ȸ)
		Scanner sc = new Scanner(System.in);
		HHDStudent stu = null; // �л� ��ü�� ���� ���� ����

		while (true) {
			System.out.println("1. �л���� 2. �����Է� 3. ��ü������ȸ 4.����");
			int choice = sc.nextInt();
			if (choice == 1) {
				// �л����(�̸�,�й��� �Է¹޾� ��ü�� ����)
				System.out.print("����� �̸� �Է� >>");
				String name = sc.next();
				System.out.print("����� �й� �Է� >>");
				String stuNum = sc.next();
				stu = new HHDStudent(name, stuNum);
			} else if (choice == 2) {
				// �����Է�(�ڹ�, DB, ���̽� ������ Ű����� �Է� �޾� �л� ��ü�� �־��ֱ�)
				if (stu != null) {
					String name = stu.getName();

					System.out.print(name + "�� �ڹ� ���� �Է�>>");
					int javaScore = sc.nextInt();
					System.out.print(name + "�� DB ���� �Է�>>");
					int databaseScore = sc.nextInt();
					System.out.print(name + "�� ���̽� ���� �Է�>>");
					int pythonScore = sc.nextInt();

					stu.setjavaScore(javaScore);
					stu.setDatabaseScore(databaseScore);
					stu.setpythonScore(pythonScore);
				} else {
					System.out.println("�л��� ���� ������ּ���.");
				}
			} else if (choice == 3) {
				// ��ü������ȸ (�л��̸�, �ڹ�/DB/���̽� ����, ������� ���)
				if (stu != null) {

					System.out.println("==============");
					System.out.println("�л� �̸�: " + stu.getName());
					System.out.println("==============");
					stu.calAvg(); // �л���ü���� ��������� ����ϵ��� �޼ҵ� ȣ��
					System.out.println("������� : " + stu.getAvg());
					System.out.println("==============");
					System.out.println("�ڹ����� "+stu.getJavaScore());           //student���Ͽ� �޼ҵ带 �߰��Ͽ� 
					System.out.println("�����ͺ��̽�����" +stu.getDatabaseScore()); // �ڹ�����, �����ͺ��̽� ����, ���̽� ���� �Է°���!!
					System.out.println("���̽� ����"+stu.getPythonScore());
					
				}else {
					System.out.println("�л��� ���� ������ּ���");
				}
			} else if (choice == 4) {
				// ���α׷� ����
				break;
			}
		}

	}

}
