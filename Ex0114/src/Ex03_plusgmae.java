import java.util.Random;
import java.util.Scanner;

public class Ex03_plusgmae {

	public static void main(String[] args) {
		
		//1.�������� ���� 2�� �̾� ��� ->Random
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0; //Ƚ���� ������ ����(Ʋ�� Ƚ��)
		
		while(true){
			int num1= rd.nextInt(1,21);
			int num2= rd.nextInt(1,21);
			System.out.print(num1+"+"+ num2+"=");
			int a = sc.nextInt();
			if ((num1+num2)==a) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail!");
				
			    cnt++;
			    if(cnt==5) {
			    	System.out.println("GANME OVER!!");
			    	break;     //5�� Ʋ���� ���߱� ���ؼ�!   if�� �ٱ��� ������ �� ���� Ʋ���� �����!!!
			    }
			    
				
			}
			
			
		}
		
		
	

	}

}
