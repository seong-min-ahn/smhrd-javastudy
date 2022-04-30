package Ex02_사칙연산게임;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 덧셈, 곱셈, 뺄셈, 나눗셈을 자유롭게 변경할 수 있는
		// 사칙연산 게임을 분업해서 만들어보자.
		IGame_Plus plus = new IGame_Plus();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("====사칙연산게임 시작====");
		plus.makeRandom(); //난수생성(내부적으로 난수 2개 생성)
		
		String msg = plus.getQuizMSG();
		
		System.out.print(msg); //   8/2=
		int input = scan.nextInt(); 
		boolean isSuccess = plus.checkAnswer(input); //정답확인
		
		System.out.println(isSuccess? "정답입니다." : "틀렸습니다.");

	}

}
