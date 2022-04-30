import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EQEQ {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
        char op ='*';
		System.out.println(cal(num1,num2,op));
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

}
