import java.util.Arrays;
import java.util.Random;

public class Ex01_배열 {

	public static void main(String[] args) {
		// 1 10개의 정수를 저장하는 배열 생성!
		// 2 랜덤(10~50)으로 배열 원소 셋팅!
		// 2번 심화) 중복없이 뽑기
		// 3 가장 큰 수가 몇 번째에 있는지 찾기

		Random rd = new Random();

		// 10개의 정수를 지정하는 배열
		int[] num = new int[10];

		// 랜덤 10부터 50까지 배열 원소 세팅
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(10, 51);

			for (int j = 0; j < i; j++) {//for (int j=j-1; j>=0; j--
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		// 배열에 존재하는 모든수 출력
//		for (int i : num) {
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(num));
		int max = 0;
		int max_number = 0;
		// 가장 큰 수는 어떤 것이고, 몇 번째에 있는지 찾기
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
