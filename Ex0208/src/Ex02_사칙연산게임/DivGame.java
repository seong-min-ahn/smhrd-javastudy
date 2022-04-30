package Ex02_사칙연산게임;

import java.util.Random;

public class DivGame implements IGame {
	private int num1 = 0;
	private int num2 = 0;
	private Random rd = new Random();
	@Override
	public void makeRandom() {
		
		num1 = rd.nextInt(100);
		num2 = rd.nextInt(100);
	}

	@Override
	public String getQuizMSG() {
		String result = num1 + "/" + num2 + "=";
		return result;
	}

	@Override
	public boolean checkAnswer(int answer) {
		if (answer == num1 / num2) {
			return true;
		}
		return false;
	}

}
