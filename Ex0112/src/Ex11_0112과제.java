import java.util.Scanner;

public class Ex11_0112���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ���: ");
		
		int bask = scan.nextInt();
		
		int box = bask % 5 == 0? bask/5 :bask/5+1;
		
		System.out.print("�ʿ��� ������ ��: " + box);

	}

}
