import java.util.Scanner;

//���� 
//������ ������� �ٷ� �����ϴ� �͵� ����
public class Ex03_�޼ҵ弳��ǽ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� >>");
		System.out.println(A(scan.nextInt()));
		

	}
	public static String A(int num1) {
		String A= " ";
		if(num1>0) {
			System.out.println("���");
		}else if(num1<0){
			System.out.println("����");
		}else {
			System.out.println("0");
		}
			return A;
	} 

}
