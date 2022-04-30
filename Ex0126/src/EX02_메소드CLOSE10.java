
public class EX02_메소드CLOSE10 {
// 나와 다른 10에 가까운 수 구하는 메소드
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
