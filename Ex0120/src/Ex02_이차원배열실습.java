import java.util.Arrays;
import java.util.Scanner;

public class Ex02_�������迭�ǽ� {

	public static void main(String[] args) {
	
		
		String [][] array = new String [3][2];
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i<array.length; i++) {
			System.out.print((i+1)+"��" );
			for(int j =0; j<array[i].length;j++) {
				
				array[i][j] = scan.next();
			}
		}
		System.out.println(Arrays.deepToString(array));
		
		
		System.out.println("�˻��� �޴� ����� �������� �������� ã�ƺ���");
		System.out.println("�޴� �˻�: ");
		String aaa = scan.next();
		
		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array[i].length;j++) {
				if(aaa.equals(array[i][j])) {
					System.out.println(array[i]+ "������ " );
				}
			}
		}
	    
	    

		
		
		

	}

}
