
public class Ex02_이중포문구구단 {

	public static void main(String[] args) {
		
	//	System.out.println("2단~9단까지 전부 출력");
		
		//밖에 있는 for문
		for(int i = 2; i<10; i++) {
		//	System.out.print(i+"단: ");                      
			
			//안에 있는 for문
			for(int j = 1; j<10; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+ "\t" );
			}
			System.out.println();
		}

	}

}
