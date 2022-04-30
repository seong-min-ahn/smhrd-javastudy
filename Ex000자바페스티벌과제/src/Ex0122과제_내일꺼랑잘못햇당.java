import java.util.Scanner;

public class Ex0122과제_내일꺼랑잘못햇당 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int a =1;
		for(int i =0; i<n;i++) {
			a+=i;
			System.out.print(a+" ");
		}

	}

}
