import java.util.Scanner;

public class Ex10_조건문예제_삼항연산자입력받은수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("첫 번재 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1>num2? num1 : num2);

	}

}
