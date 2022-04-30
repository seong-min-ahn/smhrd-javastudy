package Ex06_다형성_실습;

import java.util.Scanner;

public class VendingMachine {
	private int money;
	private Scanner sc;
	private int itemMoney;
	private Language lang;

	public VendingMachine(Language lang) {
		sc = new Scanner(System.in);
		this.lang = lang;
	}

	public void showTitle() {
		System.out.println(lang.getTitleMSG());
	}

	public void inputMoney() {
		System.out.print(lang.getInputMSG());
		money = sc.nextInt();
	}

	public void choiceMenu() {
		System.out.println(lang.getChoiceMSG());
		System.out.print(lang.getMenuMSG());
		int choice = sc.nextInt();

		if (choice == 1) {
			itemMoney = 700;
		} else if (choice == 2) {
			itemMoney = 1000;
		} else if (choice == 3) {
			itemMoney = 500;
		}
	}

	public void changeMoney() {
		if (money - itemMoney < 0) {
			System.out.println(lang.getNoMoneyMSG());
		} else {
			money -= itemMoney;
			System.out.println(lang.getChangeMoneyMSG(money));
		}
	}

	public int getMoney() {
		
		return money;
	}

}
