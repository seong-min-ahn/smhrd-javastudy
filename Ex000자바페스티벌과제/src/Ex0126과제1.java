
public class Ex0126����1 {

	public static void main(String[] args) {

		int[][] arr = new int[8][8];
		int a = 1;

		for (int i = -7 / 2; i <= 7 / 2; i++) { // ��Ī�� ���� �߽��� 0����, �������� ��������
			for (int j = Math.abs(i) + 1; j < 8 - Math.abs(i); j++) {
				arr[i + 7 / 2 + 1][j] = a;
				a++;
			}
		}
		for (int i = 1; i <arr.length; i++) {
			for (int j = 1; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
