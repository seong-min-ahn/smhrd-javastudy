import java.util.Arrays;
import java.util.Random;

public class Ex01_�迭 {

	public static void main(String[] args) {
		// 1 10���� ������ �����ϴ� �迭 ����!
		// 2 ����(10~50)���� �迭 ���� ����!
		// 2�� ��ȭ) �ߺ����� �̱�
		// 3 ���� ū ���� �� ��°�� �ִ��� ã��

		Random rd = new Random();

		// 10���� ������ �����ϴ� �迭
		int[] num = new int[10];

		// ���� 10���� 50���� �迭 ���� ����
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(10, 51);

			for (int j = 0; j < i; j++) {//for (int j=j-1; j>=0; j--
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		// �迭�� �����ϴ� ���� ���
//		for (int i : num) {
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(num));
		int max = 0;
		int max_number = 0;
		// ���� ū ���� � ���̰�, �� ��°�� �ִ��� ã��
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= max) {
				max = num[i];
				max_number = i;
			}
		}
		System.out.println(max);
		System.out.println(max_number+1);

	}
}
