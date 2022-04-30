import java.util.Scanner;

//꿀팁 
//연산의 결과값을 바로 리턴하는 것도 가능
public class Ex03_메소드설계실습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 >>");
		System.out.println(A(scan.nextInt()));
		

	}
	public static String A(int num1) {
		String A= " ";
		if(num1>0) {
			System.out.println("양수");
		}else if(num1<0){
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
			return A;
	} 

}
