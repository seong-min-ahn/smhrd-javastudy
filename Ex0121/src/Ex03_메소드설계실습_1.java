import java.util.Scanner;

public class Ex03_메소드설계실습_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수1 입력: ");
		int num1= scan.nextInt();
		System.out.print(" 정수2 입력: ");
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
