
public class Ex01메소드 {// 사칙연산

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
	
	//메소드 오버로딩(중복정의)
	//조건: 1. 메소드 이름은 동일, 2. 매개별수의 개수나 데이터 타입이 달라야한다.
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
