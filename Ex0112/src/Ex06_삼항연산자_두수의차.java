import java.util.Scanner;

public class Ex06_삼항연산자_두수의차 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		System.out.print("첫 번재 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		
		int result = num1>num2? num1-num2 : num2-num1; // 삼항 연산자의 결과를 변수에 담아서 이용할 수 있다!
		
		
		//System.out.print("두수의 차 : ");
		//System.out.print(num1>num2? num1-num2 : num2-num1  );
		System.out.println("두 수의 결과 : " + result);
		
		

	}

}
