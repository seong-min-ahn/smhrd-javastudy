package Ex02_��Ģ�������;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ����, ����, ����, �������� �����Ӱ� ������ �� �ִ�
		// ��Ģ���� ������ �о��ؼ� ������.
		IGame_Plus plus = new IGame_Plus();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("====��Ģ������� ����====");
		plus.makeRandom(); //��������(���������� ���� 2�� ����)
		
		String msg = plus.getQuizMSG();
		
		System.out.print(msg); //   8/2=
		int input = scan.nextInt(); 
		boolean isSuccess = plus.checkAnswer(input); //����Ȯ��
		
		System.out.println(isSuccess? "�����Դϴ�." : "Ʋ�Ƚ��ϴ�.");

	}

}
