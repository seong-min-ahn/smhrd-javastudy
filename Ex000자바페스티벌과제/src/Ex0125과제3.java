
public class Ex0125과제3 {

	public static void main(String[] args) {
		int[][]arr = new int [5][5];
		int a = 1;
		for(int i = 0; i< arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j]=a;
				a++;
			}
		}
		for(int i= arr.length-1; i>=0; i--) {  // 상하좌우 다바껴서 i와 j둘다 --
			for(int j = arr[i].length-1; j>=0; j--) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}
