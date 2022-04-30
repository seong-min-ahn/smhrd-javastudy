import java.util.Scanner;

public class Ex0125과제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int [][]arr= new int [num][num];
		
		int a = 1;
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j]=a;
				a++;
			}
		}for(int i =0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				System.out.print(arr[j][i]+ "\t");
			}System.out.println();
		}
		

	}

}
