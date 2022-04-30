
public class Ex01_메소드 {
	//2개의 양수를 입력받아 더 큰 수를 반환하는 메소드
	//largerNumner를 만들어 보자. 단, 두 수의 크기가 같다면 0을 반환한다.
	//메소드 호출(사용)

	public static void main(String[] args) {
		int result = largerNumber(10,10);
		System.out.println(result);

	}				
	//메소드 정의
	public static int largerNumber(int num1, int num2) {
		//더 큰 수를 반환하는 알고리즘 작성
		int result=0; //메소드의 결과 값을 담는 변수 
		
		if(num1 >num2) {
			result = num1;
		}else if(num2>num1) {
			result = num2;
		}else {
			result = 0;
		}
		
		return result;
	}

}
