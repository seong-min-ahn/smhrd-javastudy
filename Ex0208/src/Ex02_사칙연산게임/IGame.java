package Ex02_사칙연산게임;

public interface IGame {
	 // 1. 난수를 만드는 기능
	   void makeRandom();
	      
	   // 2. 퀴즈 메시지를 만드는 기능
	   String getQuizMSG();
	   
	   // 3. 정답을 체크하는 기능
	   boolean checkAnswer(int answer);

}
