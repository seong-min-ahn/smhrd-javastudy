import java.util.Scanner;

public class Ex02_산술연습 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학점수를 입력받아 합계와 평균을 출력하세요!
		// ooo님 합계: _점, 평균 : _점
		
		// 1. 데이터, 2. 입력부/출력부(view), 3. 연산 (control)
		Scanner sc = new Scanner(System.in);
		
		
		int kor=0, eng=0, math = 0, total = 0; 
		double avg = 0;
		
		//입력부/출력부 
		System.out.print("이름 : ");
		String name = sc.next(); // 문자열 입력받는 방법   문자열에 Int를 안붙힌 next만
		
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		//연산
		total = kor + eng + math;
		avg= total / 3.0;
		
		//결과 출력
		System.out.print("합계 : "+ total);
		System.out.print("평균 : "+ avg);
		
	}

}
