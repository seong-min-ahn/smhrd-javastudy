import java.util.Random;

public class ex01���� {

	public static void main(String[] args) {
		int[]numbers = new int[10];
		
		Random rd = new Random();
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rd.nextInt(10,51);
			for(int j=0; j<i; j++) {
				
			}
		}
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//�ִ밪 ã��!!
		int max = numbers[0];
		int maxIndex = 0;
		for(int i = 1; i<numbers.length; i++) {
			if (numbers[i]>max) {
				max = numbers[i];   //numbers[i]�� ��!!!!!
				maxIndex = i; //i �� ���ȣ! �ε���!
			}
		}
		System.out.println("���� ū ���� "+ max + "�Դϴ�.");
		System.out.println("�ε��� ���� "+ maxIndex + " �� �Դϴ�.");
		System.out.println("���� ū�� ������ "+ (maxIndex+1) + " �� �Դϴ�.");

	}

}
