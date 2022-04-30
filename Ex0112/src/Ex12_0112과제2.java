import java.util.Scanner;

public class Ex12_0112과제2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);					

	
		System.out.print("정수를 입력하세요: ");
			int num = scan.nextInt();
		if(num%2==0) {
			System.out.println(num+"는(은) 짝수입니다.");
		}else {
			System.out.println(num+"는(은) 홀수입니다.");
		}
	}

}
