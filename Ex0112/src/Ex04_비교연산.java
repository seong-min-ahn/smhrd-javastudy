
public class Ex04_비교연산 {

	public static void main(String[] args) {
		boolean isTrue = (3 < 5);
		System.out.println(isTrue);
		//3보다 5가 더 크냐??  맞으므로 true
		
		boolean isTrue2 = (5!= 5);
		System.out.println(isTrue2);
		//5와 5가 같지않냐?? 틀리므로 false
		
		boolean isTrue3 = (3==3.0);
		System.out.println(!isTrue3);
		
		//논리연산
		//AND(그리고)&&
		//(입력한 숫자가 10보다 크고 짝수라면)  8입력시 --> false ,15입력시--> false , 14입력시-->true
		//두가지의 비교연산을 묶어주는데 두개의 비교연산 AND는 둘 다 참이여야 참이다.
		
		//OR(또는) ||    --> 위치 shift 와 enter키 위의 \
		//(입력한 숫자가 10보다 크거나 짝수라면) 8--> true , 15입력시--> true, 7--> false
		System.out.println("==논리연산 배우는중 =="); 
	    int input = 15;
		
		//(입력한 숫자가 10보다 크고 짝수라면)
		boolean isTrue9 = (input > 10) && (input%2==0);
		System.out.println(isTrue9);
		
		//(입력한 숫자가 10보다 크거나 짝수라면)
		boolean isTrue10 =(input > 10)|| (input%2==0);
		System.out.println(isTrue10);
		
		
		
	}

}
