import java.util.Scanner;

public class Ex0121����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N�Է�>>");
		int n = sc.nextInt();
		System.out.print("X�Է�>>");
		int x = sc.nextInt();
		int[]arr=new int[n];
		for(int i =0; i<arr.length; i++) {
			System.out.print(i+1+"��° ���� �Է�>>");
			arr[i]=sc.nextInt();
			
		}
		System.out.print("���>> ");
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
		}		
	}

}
