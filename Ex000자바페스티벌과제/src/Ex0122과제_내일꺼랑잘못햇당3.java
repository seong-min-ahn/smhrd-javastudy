import java.util.Arrays;
import java.util.Random;

public class Ex0122����_���ϲ����߸��޴�3 {

	public static void main(String[] args) {
//		Random rd = new Random();
//		int[] arr = new int[8];
//		System.out.print("�迭�� �ִ� ��� ��: ");
//		for (int i = 0; i < arr.length; i++) {
//			int R = rd.nextInt(1, 100);
//			arr[i] = R;
//			for (int j = 0; j < i; j++) { // �ߺ� ����
//				if (arr[i] == arr[j]) {
//					i--;
//					// break;
//				}
//			}
//		}
//		// ������ �� �迭�� ���
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		int max = arr[0];
//		int min = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			} else if (arr[i] < min) {
//				min = arr[i];
//			}
//		}// sort �Լ����� �����ϰ� Ǯ���� ���� ����ؼ� �� ��..
//		System.out.println();
//		System.out.println("���� ū ��: " + max);
//		System.out.println("���� ���� ��: " + min);
		System.out.print("�迭�� �ִ� ��� ��: ");
		int[] arr = new int[8];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1, 101);
			System.out.print(arr[i] + " ");
		}
		
//		 System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println();
		System.out.println("���� ū ��: " + arr[7]);
		System.out.println("���� ���� ��: " + arr[0]);

	}

}
