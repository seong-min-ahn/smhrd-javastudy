import java.util.Scanner;

public class Ex0118����2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����ݾ� : ");
		int money = scan.nextInt();
		System.out.println("�ܵ���ȯ");
		int tenthousand = money / 10000;
		int fivethousand = money % 10000 / 5000;
		int thousand = money % 10000 % 5000 / 1000;
		int fivehundred = money % 10000 % 5000 / 500;
		int onehundred = money % 10000 % 5000 % 1000 % 500 / 100;

		System.out.println("10000�� : " + tenthousand + "��");
		System.out.println("5000�� : " + fivethousand + "��");
		System.out.println("1000�� : " + thousand + "��");
		System.out.println("500�� : " + fivehundred + "��");
		System.out.println("100�� : " + onehundred + "��");
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("����ݾ� : ");
//		int money = scan.nextInt();
//		int[] arr = { 10000, 5000, 1000, 500, 100 };
//
//		System.out.println("�ܵ���ȯ");
//		for (int i = 0; i < arr.length; i++) {
//			int answer = money / arr[i];
//			money %= arr[i];
//			System.out.println(arr[i] + "��" + ":" + answer + "��");
//		}

	}

}
