import java.util.Arrays;
import java.util.Random;

public class Ex03_�������迭���� {

	public static void main(String[] args) {
		int arr [][] = new int[3][2];
		Random rd = new Random();
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j]=rd.nextInt(1,11);
			}
		}
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.deepToString(arr));
		
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			for(int num : arr[i]) {
				if(num>5) {
					count++;
				}
			}
		}
		System.out.println("5���� ū �� : "+ count);
		
		for(int i =0; i< arr.length; i++) {
			int sum = 0;
			for(int num : arr[i]) {
				sum+=num;
			}
			System.out.println(i + "���� ���: "+ (float)sum/ arr.length);
		}
			
	}

}
