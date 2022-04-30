import java.util.Scanner;

public class Question2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruits = { "자몽", "망고", "바나나", "멜론" };
		System.out.print("찾고 싶은 과일: ");
		String a = sc.next();

		for (int i = 0; i < fruits.length; i++) {
			if (a.equals(fruits[i])) {
				System.out.println(a + "의 위치는 " + (i + 1) + "번에 있습니다.");
			}
		}

	}

}

