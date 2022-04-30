import java.util.Scanner;

public class Ex_03조건문 {

	public static void main(String[] args) {
		// 스캐너로 숫자하나만 입력받게
		// 이전까지 배운 내용은 합격/불합격, 홀수/짝수를 구분 가능, 2갈래로만 판단
		// 이번에는 등급을 부여
		// 90점이상이면 a,80~90이면 b,70~80이면,나머지면 f
		// 1.90점이상만 판별
		// 2.아닌사람만데려다가 80점이상인지 판별
		// 3.아닌사람만 데려다가 70점이상인지 판별
		// 4. 그것도 아니라면 F

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();

		if (num >= 90) {
			System.out.println("A등급이시네요!");
		} else if (num >= 80) {
			System.out.println("B등급이시네요");
		} else if (num >= 70) {
			System.out.println("C등급이시네요");
		} else {
			System.out.println("F등급이시네요");

		}

	}

}
