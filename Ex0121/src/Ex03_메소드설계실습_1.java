import java.util.Scanner;

public class Ex03_�޼ҵ弳��ǽ�_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" ����1 �Է�: ");
		int num1= scan.nextInt();
		System.out.print(" ����2 �Է�: ");
		int num2= scan.nextInt();
		
		boolean aaa = A(num1,num2);
		System.out.println(aaa);
	
	}
	public static boolean A(int a, int b) {
		
//		if(a%b==0) {
//			return true;
//		}
		return a%b==0; 
	}

}
