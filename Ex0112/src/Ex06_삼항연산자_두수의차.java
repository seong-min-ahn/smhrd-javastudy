import java.util.Scanner;

public class Ex06_���׿�����_�μ����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		System.out.print("ù ���� ���� �Է�: ");
		int num1 = scan.nextInt();
		
		System.out.print("�� ��° ���� �Է�: ");
		int num2 = scan.nextInt();
		
		
		int result = num1>num2? num1-num2 : num2-num1; // ���� �������� ����� ������ ��Ƽ� �̿��� �� �ִ�!
		
		
		//System.out.print("�μ��� �� : ");
		//System.out.print(num1>num2? num1-num2 : num2-num1  );
		System.out.println("�� ���� ��� : " + result);
		
		

	}

}
