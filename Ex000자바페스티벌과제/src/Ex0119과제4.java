import java.util.Scanner;

public class Ex0119����4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ�����&�ּ� ����� ���ϱ�");
		System.out.print("����1�Է�>> ");
		int num1 = sc.nextInt();
		System.out.print("����2�Է�>> ");
		int num2 = sc.nextInt();
		int a = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				a = i;
			}
		}
		int b = num1 * num2 / a;
		System.out.println("�ִ����� : " + a);
		System.out.println("�ּҰ���� : " + b);
	}

}
