import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for(int i=0;i<input.length; i++) {
			System.out.print(i+1+"번째 정수 입력>> ");
			int num = sc.nextInt();
			input[i]=num;
		}
		System.out.print("3의 배수: ");
		for(int i =0; i<input.length; i++) {
			if(input[i]%3==0) {
				System.out.print( input[i]+ "  ");
			}
		}
	}

}
