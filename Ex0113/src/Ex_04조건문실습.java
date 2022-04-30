import java.util.Scanner;

public class Ex_04조건문실습 {

	public static void main(String[] args) {
		//예제1
		//숫자를 하나 입력받아서 양수,음수,0을 판별
		
		//예제2
		//성과급계산프로그램 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력>> ");
		int num = sc.nextInt();
		
		if(num>0) { 
			System.out.println("양수 입니다");
		}else if(num<0) {
			System.out.println("음수 입니다");
		}else {
			System.out.println("0 입니다");
		}
		
	}

}
