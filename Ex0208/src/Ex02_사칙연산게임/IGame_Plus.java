package Ex02_사칙연산게임;

import java.util.Random;

public class IGame_Plus implements IGame{
   int num1;
   int num2;
   int result;
   String msg;
   
   public void makeRandom() {
      Random rd = new Random();
      num1 = rd.nextInt(1, 50);
      num2 = rd.nextInt(1, 50);
            
   }

   public String getQuizMSG() {
      result = num1 + num2;
      msg = num1 + " + " + num2 + " = ";
      return msg;
   }
   
   public boolean checkAnswer(int answer) {
      
      return answer == result;
   }
   
}