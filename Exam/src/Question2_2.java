import java.util.Scanner;

public class Question2_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("정수입력: ");
		int num = scan.nextInt();
		int a =1;
		int[][]arr = new int[num][num];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=a++;
			}
		}
		for(int i=0; i<arr.length; i++ ) {
			for(int j=0; j<arr[i].length; j++) {
				if(i%2==0) {
					System.out.print(arr[i][j]+"\t");
				}else {
					System.out.print(arr[i][num-1-j]+"\t");
				}
			}
			System.out.println();
		}

	}

}
