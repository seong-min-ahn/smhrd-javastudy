
public class EX02_�޼ҵ�CLOSE10 {
// ���� �ٸ� 10�� ����� �� ���ϴ� �޼ҵ�
	public static void main(String[] args) {
		
		int result = close10(2,7);
		System.out.println(result);
		

	}
	public static int close10( int num1, int num2) {
		int result = 0; 
		
	int num1result = num1 -10;
	int num2result = num2 -10;
	if(num1result<0) {
		num1result *= -1;
	}
	if(num2result<0) {
		num2result *= -1;
	}
	
	if(num1result < num2result) {
		result = num1;
	}else if(num2result < num1result) {
		result = num2;
	}else {
		result = 0;
	}
	return result;

	}
}
