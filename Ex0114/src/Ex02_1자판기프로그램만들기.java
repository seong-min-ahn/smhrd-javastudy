import java.util.Scanner;

public class Ex02_1자판기프로그램만들기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int money, choi, change = 0;
		int price = 0;
		int thousand, fivehundred, onehundred = 0;

		System.out.println("-----자판기 프로그램-----");
		System.out.print("금액을 넣어주세요>> ");
		money = scan.nextInt();

		while (true) {
			System.out.print("[1]메뉴 선택 [2]잔돈 반환하기 >>");
			choi = scan.nextInt();
			if (choi == 2) {
				change = money;
				System.out.println("==잔돈을 반환합니다.== ");
				System.out.println("잔돈:" + change + "원");
				thousand = change / 1000;
				fivehundred = change % 1000 / 500;
				onehundred = change % 1000 % 500 / 100;
				System.out.println("천원: " + thousand + "개");
				System.out.println("오백원: " + fivehundred + "개");
				System.out.println("백원: " + onehundred + "개");
				break;// 작업수행 종료

			} else if (choi == 1) {
				System.out.println("==메뉴를 고르세요=== ");
				System.out.print("[1]콜라(800원) [2]핫식스(1200원) [3]비타500(2000원) >>");
				choi = scan.nextInt();

				if (choi == 1 && money >= 800) {
					change = money - 800;
					price = 800;
					System.out.println("콜라가 나왔습니다.");
				} else if (choi == 2 && money >= 1200) {
					change = money - 1200;
					price = 1200;
					System.out.println("핫식스가 나왔습니다.");
				} else if (choi == 3 && money >= 2000) {
					change = money - 2000;
					price = 2000;
					System.out.println("비타500이 나왔습니다.");
				}
				if (choi == 1 && money < 800) {
					System.out.println("잔액이 부족합니다!!");
				} else if (choi == 2 && money < 1200) {
					System.out.println("잔액이 부족합니다!!");
				} else if (choi == 3 && money < 1500) {
					System.out.println("잔액이 부족합니다!!");
				}
				money -= price;
			}else {
				System.out.println("잘못 입력 했지롱");
			}
		}
	}
}
