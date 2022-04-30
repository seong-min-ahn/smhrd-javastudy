import java.util.Scanner;

public class Ex03_예제3_3 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("금액 입력 >>");
		int n1 = scan.nextInt();
		int n2 = (n1%10000);
		int n3 = (n2%5000);
		int n4 = (n3%1000);
		int n5 = (n4%500);
		int n6 = (n5%100);
		System.out.print("만원짜리 "+ (n1/10000)+ "장");
		System.out.print("5천원짜리 "+ (n2/5000)+ "장");
		System.out.print("천원짜리 "+ (n3/1000)+ "장");
		System.out.print("오백원짜리 "+ (n4/500)+ "개");
		System.out.print("백원짜리 "+ (n5/100)+ "개");
		
	}

}
