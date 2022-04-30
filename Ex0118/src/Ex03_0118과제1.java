import java.util.Scanner;

public class Ex03_0118과제1 {

	public static void main(String[] args) {
		// 하고싶은 주제6개이상 넣고
		// 검색어 하나 입력받아 몇번재에 있는지
		// EX 월화수목금토일
		// 입력:수
		// 수요일은 3번째 요일!

		String[] city = { "익산", "부산", "광주", "세종", "인천", "서울" };

		Scanner sc = new Scanner(System.in);
		System.out.print("(익산, 부산, 광주, 세종, 인천, 서울)중 살기 좋은 도시 순위 : ");

		String a = sc.next();
//        int num = 0;
//        
//		for (int i = 0; i <= 5; i++) {
//			if (city[i].equals(a)) {
//				num++;
//				System.out.println(a + "은 살기 좋은 도시" + (i + 1) + "등이야!!!!");
//				
//			}
//		}
//		if(num!=1) {  //num == 0과 같음        if문 조건이 한번도 true인적이 없었다면
//			System.out.println("존재하지 않음");
//		}
		
		//다른 방법
		boolean A = false;
		for(int i =0; i <=5; i++) {
			if(city[i].equals(a)) {
				System.out.println(a + "은"+ (i+1)+ "번째");
				A = true;
			}
		}
		if(!A) {
			System.out.println("존재하지 않음");
		}
		

	}
}
