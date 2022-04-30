package miniproject;

import java.util.Scanner;

public class ChoiceMenu {
	Activity act = new Activity();
	State st = new State();

	public void choice(Pokemon poke) {
		st.status(poke); // 현재상태확인
		st.need(poke); // 요구사항
		while (true) { // 메뉴 선택
			Scanner sc = new Scanner(System.in);

			System.out.println(poke.getNick() + "와/과 무엇을 해볼까요?");
			
			System.out.println("1. 밥 먹이기");
			System.out.println("2. 놀아주기");
			System.out.println("3. 잠 재우기");
			System.out.println("4. 오늘은 그만 놀기");
			
			int choice = sc.nextInt();

			if (choice == 3) { // 재우기
				act.sleep(poke);

			} else if (choice == 1) { // 밥주기
				act.eat(poke);

			} else if (choice == 2) { // 놀아주기
				act.play(poke);

			} else if (choice == 4) { // 종료
				System.out.println("내일 다시 만나요!");
				break;
			} else { // 목록 이외의 값을 입력
				System.out.println("선택할 수 없는 메뉴에요! 다시 선택해주세요!");
				System.out.println();
			}

		}

	}

}
