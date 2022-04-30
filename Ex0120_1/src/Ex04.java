import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int[]input = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		
		for(int i=0; i<input.length;i++ ) {
			System.out.print(i+1 + "번답>>");
			int num = sc.nextInt();
			input[i]=num;
		}
		System.out.print("입력한 답은 : ");
//		for(int i = 0; i<input.length;i++){
//			System.out.print( input[i]+ "  ");
//		}
		int[]ans = {1,4,3,2,1}; // 실제 정답을 저장하고 있는 배열!!
		
		int sum =0;
		for(int i=0; i<ans.length;i++) {
			if(input[i]==ans[i]) {
				System.out.print("O"+" ");
				sum+=20;
				
			}else {
				System.out.print("X"+" ");
			}
		}System.out.println("총점 : "+ sum);

	}

}
