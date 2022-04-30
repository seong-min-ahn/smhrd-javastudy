import java.util.Arrays;
import java.util.Scanner;

public class Ex03_메소드재사용 {

	public static void main(String[] args) {
		//1. 두 정수(base과 divisor)를 입력받아서 num2가 num1의 약수인지 아닌지를 
		//알려주는 메소드 isdivisor
		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 base 입력: ");
//		int base = scan.nextInt();
//		System.out.print("정수 divisor 입력: ");
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
		//삼항 연산자
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
	
	    //3. 하나의 정수를 입력받아 해당숫자가 소수인지 아닌지 구별하는 메소드
	
	public static boolean isprimenumber(int number) {
		String divisors = getdivisors(number);
		//split은 쪼개는 기능이 있음
		String[] array=  divisors.split(",");
//		System.out.println(Arrays.toString(array));
		//위에서 구한 약수들을 이용해 소수인지 아닌지 판별하는 알고리즘
		//힌트 : 배열의 길이
		
		return array.length ==2;
	}
	

}
