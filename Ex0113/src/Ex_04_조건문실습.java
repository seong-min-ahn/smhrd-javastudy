import java.util.Scanner;

public class Ex_04_조건문실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성과급 계산>> ");
		int pay = sc.nextInt();
		
		
//		if(99>=pay) {
//			System.out.println("총 급여는 "+ (pay+0)+"입니다.");
//		}else if(100<=pay&&199>=pay) {
//			System.out.println("총 급여는"+ (pay+20)+"입니다.");
//		}else if(200<=pay&&299>=pay) {
//			System.out.println("총 급여는"+(pay+30)+"입니다.");
//		}else if(300<=pay)
//			System.out.println("총 급여는" +(pay+50)+"입니다.");
		
		int bonus = 0;

		if(99>=pay) {
			 bonus = 0;
			// 조건문 안에서 선언한 변수는 조건문 안에서밖에 못씀.
		}else if(100<=pay&&199>=pay) {
			bonus=20;
		}else if(200<=pay&&299>=pay) {
			bonus=30;
    	}else if(300<=pay)
    		bonus=50;
		
		pay+= bonus;
		System.out.println("총 급여는 "+pay +"만원 입니다.");
		
		
		
		
		
		
	}

}
