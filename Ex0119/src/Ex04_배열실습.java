import java.util.Arrays;
import java.util.Random;

public class Ex04_�迭�ǽ� {

	public static void main(String[] args) {
		// ���� �� �ǽ�!
		// 1�ܰ�) �迭�� ����ִ� ����ŭ ��Ʈ���!
		// 3:��Ʈ��Ʈ��Ʈ
		// 4:��Ʈ��Ʈ��Ʈ��Ʈ
		// 2:��Ʈ��Ʈ
		// 4:��Ʈ��Ʈ��Ʈ��Ʈ
		// 1:��Ʈ

		int[] heart = { 3, 4, 2, 4, 1 };
		// 2�ܰ�)
		// �������� 1~5���� �̰� �� ���ں� ��������

		// �����!)
		// A,B,C,D,F �߿� �������� 50�� �̰� �� ���ĺ� �� ���� ��� �׷���(�׸�) �׸���
		// A(10��) : �׸� *10
		// B(8��)

		// �߸� ���� �������� 5������ ���̱�
//		Random rd = new Random();
//		int[]arr= new int[5];
//		
//		for (int i = 0; i< arr.length;i++) {
//			arr[i]=rd.nextInt(5)+1;
//			System.out.print(arr[i]+":");
//			for(int j =0; j<arr[i];j++) {
//				System.out.print("��");
//				
//			}
//			System.out.println();
//		}

		// 1�ܰ�
//		for (int i = 0; i < heart.length; i++) {
//			System.out.print(heart[i] + ":");
//			for (int j = 0; j < heart[i]; j++) {
//				System.out.print("��");
//			}
//			System.out.println();
//		}

		// 2�ܰ�(if �Ἥ)
//		Random rd = new Random();
//		int[]arr= new int[5];
//		int[] number = new int[50];
//		int count_1 = 0;
//		int count_2 = 0;
//		int count_3 = 0;
//		int count_4 = 0;
//		int count_5 = 0;
//		
//	
//		for(int i = 0; i<number.length; i++) {
//			
//			System.out.println(Arrays.toString(number));
//			if (number[i] ==1) {
//				count_1=count_1+1;
//			}else if (number[i]==2){
//				count_2=count_2+1;
//			}else if (number[i]==2){
//				count_2=count_2+1;
//			}else if (number[i]==2){
//				count_2=count_2+1;
//			}else {
//				count_5=count_5+1;
//			}
//			
			//2�ܰ�(if�Ⱦ�	)
		int[]numbers = new int[30]; 
		
		Random rand = new Random();
		for(int i =0; i<numbers.length; i++) {
			numbers[i] = rand.nextInt(1,6);				
		}
		System.out.println(Arrays.toString(numbers)); //�迭 �־��ָ� ���ڿ��� ������ �Լ�!
		
		int[]cnt = new int[5];
		
		for(int i =0; i<numbers.length; i++) {
			cnt[numbers[i]-1]++;
		}
		System.out.println(Arrays.toString(cnt));

		// 3�ܰ� (��ȭ) A,B,C,D,F �߿��� �������� 50�� �̰� �������� �׷��� �׸���
//		Random rd = new Random();
//		int[] aaa = new int[50];
//		for (int i = 0; i < (aaa.length); i++) {
//			aaa[i] = rd.nextInt(1, 6);
//			System.out.print(aaa[i] + ":");
//			for (int j = 0; j < aaa[i]; j++) {
//				System.out.print("��");
//
//			}
//			System.out.println();
//		}

	}

}
