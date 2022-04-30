import java.util.Scanner;

public class Ex02_입력 {

	public static void main(String[] args) {
		//입력 받는 방법! (컴퓨터가 사용자한테 입력받는 법!)
		// 1) 입력받는 도구 필요!
	    Scanner scan = new Scanner(System.in);
	    
	    // 2)도구 사용!
	    //2_1 숫자 입력받기
	    System.out.print("숫자를 입력하세요>> ");
	    int num = scan.nextInt();
	    //4byte 정수를 num이라는 이름의 메모리를 생성하고 scanner를 통해 입력받은 값을 저장하시오.
	    
	    //2-2 입력한 숫자를 2로 나눠서 출력해주고 싶다아아
	    // 입력한 숫자를 저장해놔야함(기억)>> 변수!
	    System.out.println(num/2);
	    
	}

}
