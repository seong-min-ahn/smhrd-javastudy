
public class Ex0126����3 {

	public static void main(String[] args) {
		int[][]arr = new int [5][5];
		int a = 1;
		for(int i = 0; i< arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j]=a;
				a++;
			}
		}
		for(int i= arr.length-1; i>=0; i--) {  // 0125����3�ϰ� �ٸ��� ���� �ٲ��� i --
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[j][i]+ "\t");//i�� j��ġ�� �ٲ۴�
			}
			System.out.println();
		}

	}

}
