import java.util.Scanner;

public class Ex0122����_���ϲ����߸��޴�1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����: ");
		
		int num = sc.nextInt();
		for(int i =0; i<num; i++) {
			for(int j=i; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		Scanner scan = new Scanner(System.in);
//		System.out.print("�� ����: ");
//		int num = scan.nextInt();
//
//		for (int i = num; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
