import java.util.Scanner;

public class Ex0124����1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�>>");
		
		
		int num=scan.nextInt();
		
		int []a = new int[num];
		
		int i=0;
		
		while(num>0) {
			a[i]=num%2;
			num=num/2;
			i++;
		}
		for(int j = i-1; j>=0;j-- ) {
			System.out.print(a[j]+" ");
		}
		//�˾Ƽ� 2������ �ٲ� �ִ� �Լ�
//		System.out.println("�����Է�>>");
//		int i = scan.nextInt();
//		String a = Integer.toBinaryString(i);
//		System.out.println(a);
		
				
	}

}
