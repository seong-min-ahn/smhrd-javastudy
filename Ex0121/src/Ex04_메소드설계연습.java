import java.util.Scanner;

//���� 
//������ ������� �ٷ� �����ϴ� �͵� ����
public class Ex04_�޼ҵ弳�迬�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� >>");
	         A(scan.nextInt());

	}
	public static int A(int num) {
		
		if(num>0) {
			System.out.println("���");
		}else if(num<0){
			System.out.println("����");
		}else {
			System.out.println("0");
		}
			return num; 
	}

}
