import java.util.Scanner;

public class Ex03_����3_3 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("�ݾ� �Է� >>");
		int n1 = scan.nextInt();
		int n2 = (n1%10000);
		int n3 = (n2%5000);
		int n4 = (n3%1000);
		int n5 = (n4%500);
		int n6 = (n5%100);
		System.out.print("����¥�� "+ (n1/10000)+ "��");
		System.out.print("5õ��¥�� "+ (n2/5000)+ "��");
		System.out.print("õ��¥�� "+ (n3/1000)+ "��");
		System.out.print("�����¥�� "+ (n4/500)+ "��");
		System.out.print("���¥�� "+ (n5/100)+ "��");
		
	}

}
