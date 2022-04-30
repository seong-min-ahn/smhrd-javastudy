import java.util.Arrays;
import java.util.Random;

public class Ex0122과제_내일꺼랑잘못햇당3 {

	public static void main(String[] args) {
//		Random rd = new Random();
//		int[] arr = new int[8];
//		System.out.print("배열에 있는 모든 값: ");
//		for (int i = 0; i < arr.length; i++) {
//			int R = rd.nextInt(1, 100);
//			arr[i] = R;
//			for (int j = 0; j < i; j++) { // 중복 제거
//				if (arr[i] == arr[j]) {
//					i--;
//					// break;
//				}
//			}
//		}
//		// 랜덤한 수 배열에 담기
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
//		}// sort 함수쓰면 간다하게 풀릴걸 괜히 고생해서 한 듯..
//		System.out.println();
//		System.out.println("가장 큰 값: " + max);
//		System.out.println("가장 작은 값: " + min);
		System.out.print("배열에 있는 모든 값: ");
		int[] arr = new int[8];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1, 101);
			System.out.print(arr[i] + " ");
		}
		
//		 System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println();
		System.out.println("가장 큰 값: " + arr[7]);
		System.out.println("가장 작은 값: " + arr[0]);

	}

}
