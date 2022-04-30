import java.util.Scanner;

public class Ex03_팀원꺼자판기 {

	public static void main(String[] args) {
		int money = 0, first = 0, menu = 0,change = 0;
		int coke = 800,hotsix = 1200,vita500 = 2000;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===자판기 프로그램===");
	    System.out.print("금액을 넣어주세요 >> ");
	    
	    money = scan.nextInt();
	    
	    while(true){
	    	System.out.print("[1]메뉴 선택 [2]잔돈 반환하기>>");
	    	first = scan.nextInt();
	    	if (first == 1) {
	    		System.out.println("=메뉴를 고르세요=");
	    		System.out.print("[1]콜라(800원) [2]핫식스(1200)원 [3]비타500(2000원) >>");
	    		menu = scan.nextInt();
	    		if (menu==1) {
	    			if (money>= coke) {
	    				System.out.println("콜라가 나왔습니다.");
	    				money-=coke;
	    			}else {
	    				System.out.println("잔액이 부족합니다!!");
	    			}
	    		}else if (menu==2) {
	    			if(money>=hotsix) {
	    				System.out.println("핫식스가 나왔습니다.");
	    				money-=hotsix;
	    			}else {
	    				System.out.println("잔액이 부족합니다!!");
	    			}
	    		}else {
	    			if(money>=vita500) {
	    				System.out.println("비타 500이 나왔습니다.");
	    				money-=vita500;
	    			}else {
	    				System.out.println("잔액이 부족합니다!!");
	    			}
	    		}
	    	}else if(first ==2) {
	    		System.out.println("=잔돈을 반환합니다");
	    		System.out.println("잔돈 : "+ money +"원");
				int thousand = money / 1000;
				int fivehundred = money % 1000 / 500;
				int onehundred = money % 1000 % 500 / 100;
				System.out.println("천원: " + thousand + "개");
				System.out.println("오백원: " + fivehundred + "개");
				System.out.println("백원: " + onehundred + "개");
				break;
	    	}
	    }
	}

}
