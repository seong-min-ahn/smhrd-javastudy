import java.util.Scanner;

public class Ex0119과제1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>> ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int num2 = scan.nextInt();
		int a = num1*(num2%10);
		int b = num1*(num2%100/10);
		int c = num1*(num2/100);
		int d = num1*num2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
