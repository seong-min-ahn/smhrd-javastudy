package Ex06_다형성_실습;

public class Main {

	public static void main(String[] args) {
		// 자판기 프로그램
		// 다양한 언어를 지원하는 프로그램으로 확장
		VendingMachine vm = new VendingMachine(new Korean());

		vm.showTitle();

		vm.inputMoney();

		while (vm.getMoney() >= 500) {

			vm.choiceMenu();

			vm.changeMoney();

		}

	}

}
