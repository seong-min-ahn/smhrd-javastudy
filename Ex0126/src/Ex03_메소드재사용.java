import java.util.Arrays;
import java.util.Scanner;

public class Ex03_�޼ҵ����� {

	public static void main(String[] args) {
		//1. �� ����(base�� divisor)�� �Է¹޾Ƽ� num2�� num1�� ������� �ƴ����� 
		//�˷��ִ� �޼ҵ� isdivisor
		Scanner scan = new Scanner(System.in);
//		System.out.print("���� base �Է�: ");
//		int base = scan.nextInt();
//		System.out.print("���� divisor �Է�: ");
//		int divisor = scan.nextInt();
//		
//		boolean result = isdivisor(base, divisor);
//		System.out.println(result);
		
//		String result3 = getdivisors(10);
//		System.out.println(result3);	
		boolean result3 = isprimenumber(13);
		System.out.println(result3);
	}
	public static boolean isdivisor(int base, int divisor) {
//		boolean result = false;
//		if(base%divisor==0) {
//			return true;
//		}		
		//���� ������
//	    boolean result = base%divisor==0?true:false;
		return base%divisor==0;  
	}
	public static String getdivisors(int number) {
		String result = " ";
		
		for(int i = 1; i< number; i++) {
			if(isdivisor(number,i)) {
				result += (i+",");
			}
		}
		return result+number;
	}
	
	    //3. �ϳ��� ������ �Է¹޾� �ش���ڰ� �Ҽ����� �ƴ��� �����ϴ� �޼ҵ�
	
	public static boolean isprimenumber(int number) {
		String divisors = getdivisors(number);
		//split�� �ɰ��� ����� ����
		String[] array=  divisors.split(",");
//		System.out.println(Arrays.toString(array));
		//������ ���� ������� �̿��� �Ҽ����� �ƴ��� �Ǻ��ϴ� �˰���
		//��Ʈ : �迭�� ����
		
		return array.length ==2;
	}
	

}
