
import java.util.Random;

public class Activity {
	State st = new State();

	Random rand = new Random();

	public void eat(Pokemon poke) {
		
		System.out.println();
		System.out.println(poke.getNick() + "에게 밥을 먹였습니다!");
		System.out.println();

		int full_up_rand = (rand.nextInt(2)+8) * 10; // rand.nextInt(80,101) 밥을 먹으면 포만도가 80~100 사이로 오름
		int happy_up_rand = (rand.nextInt(2)+5) * 10; // rand.nextInt(50,71) 어떤 행동을 하고 행복도가 오를 때는 50~70 사이로 오름
		int tired_up_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) 어떤 행동을 하고 피로도가 오를 때는 10~30 사이로 오름
		int exp_up_rand = (rand.nextInt(5)+4) * 10; // rand.nextInt(40,91) 어떤 행동을 하고 경험치가 오를 때는 40~90 사이로 오름

		int full_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) 어떤 행동을 하고 포만도가 떨어질 때는 10~30 사이로 떨어짐
		int happy_down_rand = (rand.nextInt(1)+2) * 10; // rand.nextInt(20,31) 어떤 행동을 하고 행복도가 떨어질 때는 20~30 사이로 떨어짐
		int tired_down_rand = (rand.nextInt(4)+5) * 10; // rand.nextInt(50,91) 어떤 행동을 하고 피로도가 떨어질 때는 50~90 사이로 떨어짐

	

		poke.setTired(poke.getTired() + tired_up_rand); // 밥 피로도

		if (poke.getFull() >= 80) { // 밥 행복도
			poke.setHappy(poke.getHappy() - happy_down_rand);
		} else {
			poke.setHappy(poke.getHappy() + happy_up_rand);
			if (poke.getHappy() >= 100) {
				poke.setHappy(100);
			}
		}

		// 포만도가 90인데 밥을 먹어서 포만도가 80이 올라버리는 경우에 오히려 포만도가 떨어질 수도 있음
		// 현재 포만도보다 높을 때까지 다시 난수를 뽑아버리는 방법으로 해결할 수 있음

		while (poke.getFull() > full_up_rand) { // 밥 포만도

			full_up_rand = (rand.nextInt(2)+10) * 10;

		}
		poke.setFull(full_up_rand);

		// 밥 경험치
		poke.setExp(poke.getExp() + exp_up_rand);
		st.die(poke);
		st.level_up(poke);
		st.upgrade(poke);
		st.status(poke);
		st.need(poke);
		
	

	}

	public void play(Pokemon poke) {

		System.out.println();
		System.out.println(poke.getNick() + "(이)와 놀아주었습니다!");
		System.out.println();
		
		int full_up_rand = (rand.nextInt(2)+8) * 10; // rand.nextInt(80,101) 밥을 먹으면 포만도가 80~100 사이로 오름
		int happy_up_rand = (rand.nextInt(2)+5) * 10; // rand.nextInt(50,71) 어떤 행동을 하고 행복도가 오를 때는 50~70 사이로 오름
		int tired_up_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) 어떤 행동을 하고 피로도가 오를 때는 10~30 사이로 오름
		int exp_up_rand = (rand.nextInt(5)+4) * 10; // rand.nextInt(40,91) 어떤 행동을 하고 경험치가 오를 때는 40~90 사이로 오름

		int full_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) 어떤 행동을 하고 포만도가 떨어질 때는 10~30 사이로 떨어짐
		int happy_down_rand = (rand.nextInt(1)+2) * 10; // rand.nextInt(20,31) 어떤 행동을 하고 행복도가 떨어질 때는 20~30 사이로 떨어짐
		int tired_down_rand = (rand.nextInt(4)+5) * 10; // rand.nextInt(50,91) 어떤 행동을 하고 피로도가 떨어질 때는 50~90 사이로 떨어짐

		

		poke.setTired(poke.getTired() + tired_up_rand); // 놀기 피로도

		if (poke.getTired() >= 80) { // 놀기 행복도
			poke.setHappy(poke.getHappy() - happy_down_rand); //
		} else {
			poke.setHappy(poke.getHappy() + happy_up_rand);
		}
		if (poke.getHappy() > 100) {
			poke.setHappy(100);
		}

		poke.setFull(poke.getFull() - full_down_rand); // 놀기 포만도

		poke.setExp(poke.getExp() + exp_up_rand); // 놀기 경험치

		st.die(poke);
		st.level_up(poke);
		st.upgrade(poke);
		st.status(poke);
		st.need(poke);
		
		
	
	

	}

	public void sleep(Pokemon poke) {
		System.out.println();
		System.out.println(poke.getNick() + "을/를 재웠습니다!");
		System.out.println();

		int full_up_rand = (rand.nextInt(2)+8) * 10; // rand.nextInt(80,101) 밥을 먹으면 포만도가 80~100 사이로 오름
		int happy_up_rand = (rand.nextInt(2)+5) * 10; // rand.nextInt(50,71) 어떤 행동을 하고 행복도가 오를 때는 50~70 사이로 오름
		int tired_up_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) 어떤 행동을 하고 피로도가 오를 때는 10~30 사이로 오름
		int exp_up_rand = (rand.nextInt(5)+4) * 10; // rand.nextInt(40,91) 어떤 행동을 하고 경험치가 오를 때는 40~90 사이로 오름

		int full_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(10,31) 어떤 행동을 하고 포만도가 떨어질 때는 10~30 사이로 떨어짐
		int happy_down_rand = (rand.nextInt(1)+2) * 10; // rand.nextInt(20,31) 어떤 행동을 하고 행복도가 떨어질 때는 20~30 사이로 떨어짐
		int tired_down_rand = (rand.nextInt(2)+1) * 10; // rand.nextInt(50,91) 어떤 행동을 하고 피로도가 떨어질 때는 10~30 사이로 고정됨


		poke.setTired(poke.getTired() - tired_down_rand); // 잠 피로도
		if (poke.getTired() < 0) {
			poke.setTired(0);
		}

		
		poke.setHappy(poke.getHappy() + happy_up_rand); // 잠 행복도
		if(poke.getHappy() > 100) {
			poke.setHappy(100);
		}
		
		
		poke.setFull(poke.getFull() - full_down_rand); // 잠 포만도
		
		
		poke.setExp(poke.getExp() + exp_up_rand); // 잠 경험치

		st.die(poke);
		st.level_up(poke);
		st.upgrade(poke);
		st.status(poke);
		st.need(poke);

	
	}

}
