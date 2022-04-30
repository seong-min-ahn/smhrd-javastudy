import java.util.Random;

public class Ex01_메소드 {

	public static void main(String[] args) {
		//Method --> 함수
		
		//String str = Arrays. toString( ) ;
		//Arrays.toString 메소드란?? 매개변수로 배열을 전달받아 각 원소를 문자열로 리턴하는 메소드 
		
		
		//1. 매개변수(Parameter)  - 메소드가 알고리즘(명령)을 처리하기 위해 외부(사용자)에서 전달받는 데이터
		//  -  메소드를 동작시키기 위해 필요한 데이터(사용자 관점)
		
		//2. 리턴값(메소드를 호출한 곳으로!!!) 
		//- 메소드가 명령을 처리한 후 돌려주는 데이터
		
		//3. 메소드 호출 - 메소드 사용
		
		Random rd = new Random();
		int num = rd.nextInt(1,10); 
		//Random 수를 뽑는 nextInt라는 메소드에 대해 정의하세요!!
		//매개변수, 리턴값, 호출 이라는 단어를 사용하여
		
		//1 ,10의 최소값과 상한선을 매개변수로 입력하여 메소드를 호출하여 1부터 9까지의 랜덤한 수를 입력값으로 출력함 .       
		
		// 알고리즘을 처리하기 위해 사용자에게 전달받는 데이터이므로 1, 10까지라는 두개의 숫자를 입력받아서 매개변수는 1,10   2개이다
		// 명령을 처리한 후 돌려주는 데이터가 리턴값이므로 리턴 값은 1개 
		// int num = rd.nextInt(1,10); 을 사용한 것을 자체가 호출
		
		String name = "이은비";
		if (name.equals("정세연")) {
			System.out.println("같지않다!!");
		}
		//equals 메소드 정의하기!     .은 ~~에 있는 
		
		//String에 있는 함수 equals라는 메소드를 호출하여 
		//equals 메소드에서 "정세연"이라는 데이터 매개변수 1개를 받아 name의 "이은비"와 비교하여
		//리턴값 boolean형 false를 호출한 곳으로 리턴 시켜준다.
	    		   
		System.out.println(name.length());
		//String에 있는 함수 length 메소드를 호출하여 name변수에 있는 값(ex )) "이은비")의 문자 개수 세서 호출한 곳으로 리턴
		
		int num22 = Integer.parseInt("1234");// 문자열을 숫자로 바꿔주는 메소드
		
		//숫자로 이루어진 문자열을 매개변수로 입력하면 Integer에 있는 parseInt라는 메소드를 호출하여 문자열을 숫자로 바꾼 값을 num22의 리턴값으로 출력함
		
	
		String num33 = Integer.toString(1234); //숫자를 문자열로 바꿔주는 메소드
 		//숫자를 매개변수로 입력하면 Integer에 있는 tostring이라는 메소드를 호출해서 숫자를 문자열로 바꾼 값을 num33에 리턴값으로 출력함
		//쌤이 해주신거
		//Integer 라는 (클래스)에 있는 toString이라는 메소드를 호출
		//매개변수-> 정수형 1234
		//리턴값 -> 1234를 문자열로 바꾼 값!
		//메소드를 호출한 곳으로 문자열이 리턴(반환)
		//반환된 리턴값(문자열)을 num33라는 변수에 저장
		
		
		

	}

}
