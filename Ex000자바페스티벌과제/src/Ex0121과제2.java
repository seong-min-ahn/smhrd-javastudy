import java.util.Scanner;

public class Ex0121과제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N입력>>");
		int n = sc.nextInt();
		System.out.print("X입력>>");
		int x = sc.nextInt();
		int[]arr=new int[n];
		for(int i =0; i<arr.length; i++) {
			System.out.print(i+1+"번째 정수 입력>>");
			arr[i]=sc.nextInt();
			
		}
		System.out.print("결과>> ");
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
		}		
	}

}
