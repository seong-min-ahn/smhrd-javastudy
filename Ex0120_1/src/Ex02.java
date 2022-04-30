import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// 이름이 5개 들어갈 배열
		String[] array = new String[5];
		array[0] = "승환";
		array[1] = "세연";
		array[2] = "은비";
		array[3] = "동원";
		array[4] = "선재";

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 적어:");
		String name = sc.next();

		// 배열 안에서 사용자가 입력한 값을 찾고싶어요!
		// 배열 안에 있는 값을 전부 출력 시켜 주세요!

		for (int i = 0; i < 5; i++) {
			// name과 배열안에 있는 값을 찾아주세요!!
			// 만약 배열안에 있는 값이 내가입력한 값과 같다면 찾았다 출력
			//이름을 찾았을때 n번째 인덱스에 있습니다.!
			if (array[i].equals(name)) {
				System.out.println("찾았다");
				System.out.println("검색한 이름은 "+ i+ "번째 인덱스에 있습니다!");
			}
			//System.out.println(array[i]);
		}

	}

}
