import java.util.Scanner;

public class Ex03_���������Ǳ� {

	public static void main(String[] args) {
		int money = 0, first = 0, menu = 0,change = 0;
		int coke = 800,hotsix = 1200,vita500 = 2000;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===���Ǳ� ���α׷�===");
	    System.out.print("�ݾ��� �־��ּ��� >> ");
	    
	    money = scan.nextInt();
	    
	    while(true){
	    	System.out.print("[1]�޴� ���� [2]�ܵ� ��ȯ�ϱ�>>");
	    	first = scan.nextInt();
	    	if (first == 1) {
	    		System.out.println("=�޴��� ������=");
	    		System.out.print("[1]�ݶ�(800��) [2]�ֽĽ�(1200)�� [3]��Ÿ500(2000��) >>");
	    		menu = scan.nextInt();
	    		if (menu==1) {
	    			if (money>= coke) {
	    				System.out.println("�ݶ� ���Խ��ϴ�.");
	    				money-=coke;
	    			}else {
	    				System.out.println("�ܾ��� �����մϴ�!!");
	    			}
	    		}else if (menu==2) {
	    			if(money>=hotsix) {
	    				System.out.println("�ֽĽ��� ���Խ��ϴ�.");
	    				money-=hotsix;
	    			}else {
	    				System.out.println("�ܾ��� �����մϴ�!!");
	    			}
	    		}else {
	    			if(money>=vita500) {
	    				System.out.println("��Ÿ 500�� ���Խ��ϴ�.");
	    				money-=vita500;
	    			}else {
	    				System.out.println("�ܾ��� �����մϴ�!!");
	    			}
	    		}
	    	}else if(first ==2) {
	    		System.out.println("=�ܵ��� ��ȯ�մϴ�");
	    		System.out.println("�ܵ� : "+ money +"��");
				int thousand = money / 1000;
				int fivehundred = money % 1000 / 500;
				int onehundred = money % 1000 % 500 / 100;
				System.out.println("õ��: " + thousand + "��");
				System.out.println("�����: " + fivehundred + "��");
				System.out.println("���: " + onehundred + "��");
				break;
	    	}
	    }
	}

}
