import java.util.Scanner;

public class Ex0120����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ��� : ");
		int input = sc.nextInt();
		System.out.print(input + "=");
		for(int i =2; i<=input; i++) {
			while(input%i==0) {
				System.out.print(i);
				input=input/i;
				if(input==1) {
					break;
				}else {
					System.out.print("*");
				}
			}
		}

	}

}
