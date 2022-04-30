import java.util.Random;
import java.util.Scanner;

public class Ex03_plusgmae {

	public static void main(String[] args) {
		
		//1.랜덤으로 정수 2개 뽑아 출력 ->Random
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0; //횟수를 세어줄 변수(틀린 횟수)
		
		while(true){
			int num1= rd.nextInt(1,21);
			int num2= rd.nextInt(1,21);
			System.out.print(num1+"+"+ num2+"=");
			int a = sc.nextInt();
			if ((num1+num2)==a) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail!");
				
			    cnt++;
			    if(cnt==5) {
			    	System.out.println("GANME OVER!!");
			    	break;     //5번 틀리면 멈추기 위해서!   if문 바깥에 있으면 한 번만 틀려도 멈춘다!!!
			    }
			    
				
			}
			
			
		}
		
		
	

	}

}
