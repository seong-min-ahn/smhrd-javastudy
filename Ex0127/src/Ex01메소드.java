
public class Ex01�޼ҵ� {// ��Ģ����

	public static void main(String[] args) {

		System.out.println(cal(10, 5, '-'));
		
		double result2 = cal(10.5, 1.3,'-');
		System.out.println(result2);

	}


	public static int cal(int num1, int num2, char op) {

		int result = 0;
		if (op == '-') {
			result = num1 - num2;
		} else if (op == '+') {
			result = num1 + num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		
		return result;

	}
	
	//�޼ҵ� �����ε�(�ߺ�����)
	//����: 1. �޼ҵ� �̸��� ����, 2. �Ű������� ������ ������ Ÿ���� �޶���Ѵ�.
	public static double cal(double num1, double num2, char op) {
		double result =0;
		if (op == '-') {
			result = num1 - num2;
		} else if (op == '+') {
			result = num1 + num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		
		return result;
	}
}
