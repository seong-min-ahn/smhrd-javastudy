import java.util.Scanner;

public class Ex0120���� {

	public static void main(String[] args) {
		int sum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			sum*=i;
		}
		System.out.print("��� "+ sum);
	}

}
