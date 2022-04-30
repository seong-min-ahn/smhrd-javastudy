import java.util.Scanner;

public class Ex11_0112과제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요: ");
		
		int bask = scan.nextInt();
		
		int box = bask % 5 == 0? bask/5 :bask/5+1;
		
		System.out.print("필요한 상자의 수: " + box);

	}

}
