package Ex06_������_�ǽ�;

public class Main {

	public static void main(String[] args) {
		// ���Ǳ� ���α׷�
		// �پ��� �� �����ϴ� ���α׷����� Ȯ��
		VendingMachine vm = new VendingMachine(new Korean());

		vm.showTitle();

		vm.inputMoney();

		while (vm.getMoney() >= 500) {

			vm.choiceMenu();

			vm.changeMoney();

		}

	}

}
