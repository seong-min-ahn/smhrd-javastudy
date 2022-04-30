import java.util.Random;
import java.util.Scanner;

public class Ex01_updown게임 {

	public static void main(String[] args) {
		//1)컴퓨터가 랜덤으로 1~100까지 하나 뽑느다!
		//2)숫자를 입력한다!
		//3)랜덤수보다 입력한 수가 더 크면 down이라고 출력한다!
		//4)랜덤수보다 입력한 수가 더 작으면 up이라고 출력한다!
		//5)맞추면! 마셔마셔 먹고 죽어 네발로 기어가~~ 네발로 기어가~~ 출력한다!
		
		//랜덤 수 뽑는 법! (*Scanner랑 헷갈리지 말자!!!*)
		//1. 도구준비
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		//2. 2.숫자뽑기!
		//int rdNum= rd.nextInt(100)+1; 1에서 100
		//int rdNum= rd.nextInt(100);   0에서 99
		//int rdNum= rd.nextInt(10,100);   10에서 99(0~n-1)
		//int rdNum= rd.nextInt(90)+10; // 0~99(0 ~ n-1) 
		
		//반복문이란? 특정 조건을 만족할 때까지 작업을 반복하여 수행하는 것!
		int rdNum= rd.nextInt(10,100);
		int user = 0;
		System.out.println("랜덤 수 : " + rdNum);
		
		while(rdNum != user) {//반복이 계속될 조건 =>틀렸으면 반복!
			System.out.print("(10~99) 수 입력>>");			
			user = sc.nextInt();
			
			 if(rdNum>user) {
				System.out.println("up");
			}else if(user>rdNum) {
				System.out.println("down");
			}else {
				System.out.println("마셔마셔 ");
				break;               //break는 반복문을 빠져나가는 명령
			}
		}
			
		
		
		

	}

}
