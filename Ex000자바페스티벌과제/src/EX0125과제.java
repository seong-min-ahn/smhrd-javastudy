import java.util.Scanner;

public class EX0125���� {
	//�̰� ��������...

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° �� �Է�: ");
			arr[i] = scan.nextInt();
		}
		for (int j = 0; j < arr.length-1; j++) {
			int m = j;
			for (int i = j + 1; i< arr.length; i++) {
				if (arr[m] > arr[i]) {
					m = i;
				}
			}
			int temp = arr[m];
			arr[m] = arr[j];
			arr[j] = temp;
		}
		System.out.println("���� ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
