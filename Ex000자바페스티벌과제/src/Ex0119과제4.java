import java.util.Scanner;

public class Ex0119과제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수&최소 공배수 구하기");
		System.out.print("숫자1입력>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		int num2 = sc.nextInt();
		int a = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				a = i;
			}
		}
		int b = num1 * num2 / a;
		System.out.println("최대공약수 : " + a);
		System.out.println("최소공배수 : " + b);
	}

}
