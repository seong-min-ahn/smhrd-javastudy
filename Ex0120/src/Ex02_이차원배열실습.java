import java.util.Arrays;
import java.util.Scanner;

public class Ex02_이차원배열실습 {

	public static void main(String[] args) {
	
		
		String [][] array = new String [3][2];
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i<array.length; i++) {
			System.out.print((i+1)+"일" );
			for(int j =0; j<array[i].length;j++) {
				
				array[i][j] = scan.next();
			}
		}
		System.out.println(Arrays.deepToString(array));
		
		
		System.out.println("검색한 메뉴 몇요일 점심인지 저녁인지 찾아보기");
		System.out.println("메뉴 검색: ");
		String aaa = scan.next();
		
		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array[i].length;j++) {
				if(aaa.equals(array[i][j])) {
					System.out.println(array[i]+ "요일의 " );
				}
			}
		}
	    
	    

		
		
		

	}

}
