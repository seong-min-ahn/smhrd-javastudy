import java.util.Collections;
import java.util.Scanner;

public class Ex0124과제2 {
//버블
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 수 입력: ");
			arr[i] = scan.nextInt();
		}
		for (int j = 1; j < arr.length; j++) {  //i가 1일때   arr.length(i)까지 i++까지 i가 i-1이 될 때까지 증가
			for (int i = 0; i < arr.length - j; i++) {//i가 0일때 arr.length-i
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
