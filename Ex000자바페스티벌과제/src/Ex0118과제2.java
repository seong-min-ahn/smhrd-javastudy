import java.util.Scanner;

public class Ex0118과제2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("현재금액 : ");
		int money = scan.nextInt();
		System.out.println("잔돈변환");
		int tenthousand = money / 10000;
		int fivethousand = money % 10000 / 5000;
		int thousand = money % 10000 % 5000 / 1000;
		int fivehundred = money % 10000 % 5000 / 500;
		int onehundred = money % 10000 % 5000 % 1000 % 500 / 100;

		System.out.println("10000원 : " + tenthousand + "개");
		System.out.println("5000원 : " + fivethousand + "개");
		System.out.println("1000원 : " + thousand + "개");
		System.out.println("500원 : " + fivehundred + "개");
		System.out.println("100원 : " + onehundred + "개");
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("현재금액 : ");
//		int money = scan.nextInt();
//		int[] arr = { 10000, 5000, 1000, 500, 100 };
//
//		System.out.println("잔돈반환");
//		for (int i = 0; i < arr.length; i++) {
//			int answer = money / arr[i];
//			money %= arr[i];
//			System.out.println(arr[i] + "원" + ":" + answer + "개");
//		}

	}

}
