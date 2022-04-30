import java.util.Scanner;

public class Ex03_다중for문예제 {
	// 이중for문 구구단 세로
	// 나중에 보면 i,j의 위치만 바뀌게 됨
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//
//			for (int j = 2; j < 10; j++) {
//				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//			}
//			System.out.println();
//		}

		// *
		// **
		// *** --->이 모양으로 별 쌓기
		// ****
		// *****
//		for (int i = 1; i <= 5; i++) {
//			// 별 반복 , 5줄까지
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//        }

//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		for (int i = 1; i <= num; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//별 거꾸로 찍기
		for (int i = 0; i<6; i++) {
			for(int j=(6-i); j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
