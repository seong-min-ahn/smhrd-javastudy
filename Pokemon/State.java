import java.util.Random;

// 진화 백업 State

public class State {

	Random rand = new Random();

	public void need(Pokemon poke) { // 요구사항
		if (poke.getFull() < 40) {
			System.out.println("[도움말] " + poke.getNick() + "(이)가 배고파보입니다!");
			System.out.println();
		}

		if (poke.getHappy() < 50) {
			System.out.println("[도움말] " + poke.getNick() + "(이)가 심심해보입니다!");
			System.out.println();
		}
		if (poke.getTired() > 70) {
			System.out.println("[도움말] " + poke.getNick() + "(이)가 피곤해보입니다!");
			System.out.println();
		}
		if (poke.getFull() == 100) {
			System.out.println("[도움말] " + poke.getNick() + "(이)가 배불러보입니다!");
			System.out.println();
		}

	}

	public void status(Pokemon poke) { // 상태확인
		System.out.println("<< 현재 상태 >>");
		System.out.print("포켓몬 이름 : " + poke.getNick() + "(" + poke.getGrade() + ")" + " / ");
		System.out.print("Lv. " + poke.getLv() + " (");

		int exp_gui_black = poke.getExp() / 10; // 얘 수만큼 검은 네모
		int exp_gui_white = 10 - exp_gui_black; // 얘만큼 흰색 네모

		for (int i = 0; i <= (exp_gui_black - 1); i++) {
			System.out.print("■");
		}
		for (int i = 0; i <= (exp_gui_white - 1); i++) {
			System.out.print("□");
		}
		System.out.println(")");

		System.out.print("포만도 : " + poke.getFull() + " / ");
		System.out.print("행복도 : " + poke.getHappy() + " / ");
		System.out.println("피로도 : " + poke.getTired());
		System.out.println();

	}

	public void upgrade(Pokemon poke) { // 진화

		if (poke.getLv() == 3 && poke.getType().equals("리아코")) {
			poke.setGrade("엘리게이");
			System.out.println("[알림] " + poke.getNick() + "(이)가 엘리게이로 진화했습니다!");
			System.out.println();
		}

		if (poke.getLv() == 3 && poke.getType().equals("치코리타")) {
			poke.setGrade("베이리프");
			System.out.println("[알림] " + poke.getNick() + "(이)가 베이리프로 진화했습니다!");
			System.out.println();
		}

		if (poke.getLv() == 3 && poke.getType().equals("브케인")) {
			poke.setGrade("마그케인");
			System.out.println("[알림] " + poke.getNick() + "(이)가 마그케인으로 진화했습니다!");
			System.out.println();
		}

		if (poke.getLv() == 8 && poke.getType().equals("리아코")) {
			poke.setGrade("장크로다일");
			System.out.println("[알림] " + poke.getNick() + "(이)가 장크로다일로 진화했습니다!");
			System.out.println();
		}

		if (poke.getLv() == 8 && poke.getType().equals("치코리타")) {
			poke.setGrade("메가니움");
			System.out.println("[알림] " + poke.getNick() + "(이)가 메가니움으로 진화했습니다!");
			System.out.println();
		}

		if (poke.getLv() == 8 && poke.getType().equals("브케인")) {
			poke.setGrade("블레이범");
			System.out.println("[알림] " + poke.getNick() + "(이)가 블레이범으로 진화했습니다!");
			System.out.println();
		}

	}

	public void level_up(Pokemon poke) { // 레벨업
		if (poke.getExp() >= 100) {
			
			System.out.println("[알림] " + poke.getNick() + "(이)의 레벨이 올랐습니다!");
			poke.setExp(poke.getExp() - 100);
			poke.setLv(poke.getLv() + 1);

			System.out.println();
		}

	}

	public void die(Pokemon poke) { // 사망
		if (poke.getFull() <= -50 || poke.getHappy() <= -50 || poke.getTired() > 150) {

			poke.setLv(1);
			poke.setExp(0);

			int poke_retry = rand.nextInt(2)+1;
			String type_retry = "";
			if (poke_retry == 1) {
				type_retry = "치코리타";
			} else if (poke_retry == 2) {
				type_retry = "리아코";
			} else if (poke_retry == 3) {
				type_retry = "브케인";
			}

			poke.setType(type_retry); // 치코리타 브케인 리아코

			poke.setFull(50);
			poke.setTired(50);
			poke.setHappy(50);
			poke.setGrade(poke.getType());

			System.out.println();
			System.out.print("[알림] " + "당신은 " + poke.getNick() + "을/를 죽였습니다! ");
			System.out.println(poke.getNick() + "이/가 " + poke.getType() + "(으)로 다시 살아났습니다!");
			System.out.println();

		}

	}

}
