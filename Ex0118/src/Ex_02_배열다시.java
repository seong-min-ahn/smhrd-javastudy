import java.util.Scanner;

public class Ex_02_배열다시 {

	public static void main(String[] args) {
		String[] member = { "정세연", "박수현", "황해도", "채수민", "위홍주" };
		Scanner scan = new Scanner(System.in);
		System.out.print("ID입력 : ");
		String newId= scan.next();
		for(int i = 0; i<5; i++) {
			if ( member[i].equals(newId)) {
				System.out.println("중복");
			}
		}

	}

}
 