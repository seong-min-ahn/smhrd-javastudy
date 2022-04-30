import java.util.Scanner;

public class Ex09_조건문예제_입력받은숫자중큰수출력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		

	}

}
