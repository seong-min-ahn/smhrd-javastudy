import java.util.Scanner;

public class Ex03_예제3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("총금액>> ");
		int num1 = scan.nextInt();
		System.out.print("인원수>> ");
		int num2 = scan.nextInt();
		System.out.println("한 사람당 " + num1/num2 + "원");
		

	}

}
