import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int[]input = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		
		
		for(int i=0; i<input.length;i++ ) {
			System.out.print(i+1 + "����>>");
			int num = sc.nextInt();
			input[i]=num;
		}
		System.out.print("�Է��� ���� : ");
//		for(int i = 0; i<input.length;i++){
//			System.out.print( input[i]+ "  ");
//		}
		int[]ans = {1,4,3,2,1}; // ���� ������ �����ϰ� �ִ� �迭!!
		
		int sum =0;
		for(int i=0; i<ans.length;i++) {
			if(input[i]==ans[i]) {
				System.out.print("O"+" ");
				sum+=20;
				
			}else {
				System.out.print("X"+" ");
			}
		}System.out.println("���� : "+ sum);

	}

}
