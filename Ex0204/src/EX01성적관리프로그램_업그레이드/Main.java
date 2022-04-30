package EX01성적관리프로그램_업그레이드;

import java.util.Scanner;

import Ex02_생성자.Student;

public class Main {

	public static void main(String[] args) {
		// 기능(1. 학생등록, 2.성적입력, 3. 전체성적조회)
		Scanner sc = new Scanner(System.in);
		HHDStudent stu = null; // 학생 객체를 담을 변수 생성

		while (true) {
			System.out.println("1. 학생등록 2. 성적입력 3. 전체성적조회 4.종료");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 학생등록(이름,학번을 입력받아 객체를 생성)
				System.out.print("등록할 이름 입력 >>");
				String name = sc.next();
				System.out.print("등록할 학번 입력 >>");
				String stuNum = sc.next();
				stu = new HHDStudent(name, stuNum);
			} else if (choice == 2) {
				// 성적입력(자바, DB, 파이썬 점수를 키보드로 입력 받아 학생 객체에 넣어주기)
				if (stu != null) {
					String name = stu.getName();

					System.out.print(name + "의 자바 점수 입력>>");
					int javaScore = sc.nextInt();
					System.out.print(name + "의 DB 점수 입력>>");
					int databaseScore = sc.nextInt();
					System.out.print(name + "의 파이썬 점수 입력>>");
					int pythonScore = sc.nextInt();

					stu.setjavaScore(javaScore);
					stu.setDatabaseScore(databaseScore);
					stu.setpythonScore(pythonScore);
				} else {
					System.out.println("학생을 먼저 등록해주세요.");
				}
			} else if (choice == 3) {
				// 전체성적조회 (학생이름, 자바/DB/파이썬 점수, 평균점수 출력)
				if (stu != null) {

					System.out.println("==============");
					System.out.println("학생 이름: " + stu.getName());
					System.out.println("==============");
					stu.calAvg(); // 학생객체에게 평균점수를 계산하도록 메소드 호출
					System.out.println("평균점수 : " + stu.getAvg());
					System.out.println("==============");
					System.out.println("자바점수 "+stu.getJavaScore());           //student파일에 메소드를 추가하여 
					System.out.println("데이터베이스점수" +stu.getDatabaseScore()); // 자바점수, 데이터베이스 점수, 파이썬 점수 입력가능!!
					System.out.println("파이썬 점수"+stu.getPythonScore());
					
				}else {
					System.out.println("학생을 먼저 등록해주세요");
				}
			} else if (choice == 4) {
				// 프로그램 종료
				break;
			}
		}

	}

}
