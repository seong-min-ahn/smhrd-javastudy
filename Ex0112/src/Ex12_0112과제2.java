import java.util.Scanner;

public class Ex12_0112����2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);					

	
		System.out.print("������ �Է��ϼ���: ");
			int num = scan.nextInt();
		if(num%2==0) {
			System.out.println(num+"��(��) ¦���Դϴ�.");
		}else {
			System.out.println(num+"��(��) Ȧ���Դϴ�.");
		}
	}

}
