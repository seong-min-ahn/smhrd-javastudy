import java.util.Collections;
import java.util.Scanner;

public class Ex0124����2 {
//����
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° �� �Է�: ");
			arr[i] = scan.nextInt();
		}
		for (int j = 1; j < arr.length; j++) {  //i�� 1�϶�   arr.length(i)���� i++���� i�� i-1�� �� ������ ����
			for (int i = 0; i < arr.length - j; i++) {//i�� 0�϶� arr.length-i
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println("���� ��");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
