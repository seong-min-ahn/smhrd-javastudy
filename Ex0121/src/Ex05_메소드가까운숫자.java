import java.util.Scanner;

public class Ex05_메소드가까운숫자 {

	public static void main(String[] args) {
		//두개의 정수를 전달받아 10에 가까운 수를 리턴하는 메소드 설계하기
		Scanner scan = new Scanner(System.in);
	    System.out.print("숫자 1 입력: ");
		int num1 =scan.nextInt();
		System.out.print("숫자 2 입력: ");
		int num2 =scan.nextInt();
	    System.out.print(ten(num1,num2));
	}
	//절대값 구하는 메소드 //if쓰기는 귀찮으니까 삼항연산자 사용
	//알아보니까 절대값 함수 math.abs()가 있다고 한다...
	public static int abs(int num) {
		return (num>0)? num:-num;  //num이 0보다 작으면 -를 붙여 +로 바꿔야지
	}
	public static int ten(int num1, int num2) {
		int result =0;
		if((abs(10-num1))==(abs(10-num2))) {
			result = 0;
		}else if((abs(10-num1))>(abs(10-num2))) {
			result = num2;
		}else if((abs(10-num1))<(abs(10-num2))) {
			result = num1;
		}
		return  result;
	} 
}
