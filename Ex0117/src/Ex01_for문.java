import java.util.Scanner;

//오늘은 5시까지!!!!!!
public class Ex01_for문 {

	public static void main(String[] args) {
		/*
		 * // for문 구조 // for(초기값; 조건식; 증가값){ // 실행문장들~~; }
		 * 
		 * 
		 * for(int i = 0; i<10; i++) { System.out.println(i);
		 * 
		 * }
		 */

		// 1. for문 예제 for문을 사용하여 21에서 57까지 출력하시오.
//		for(int i = 21; i<58; i++) {
//			 System.out.println(i);
//		}

		// 2. for문을 사용하여 96에서 53까지 출력
//		for(int i = 96; i>52; i--) {
//			System.out.println(i);
//		}
		// 3. for문을 사용하여 21에서 57까지의 수 중 홀수만 출력

//		for (int i = 21; i < 58; i += 2) {
//			System.out.println(i);
//		}

		// 3.1 다른방법
//		for (int i = 21; i < 58; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//		}

		// 4. 1부터 100까지의 합 구하기
//		int sum = 0;
//		int i = 0;
//		for (i = 1; i < 101; i ++) {
//			sum+=i;
//		}
//		System.out.println(sum);

		// 5. 1-2+3-4 ... 구하기
//		int num=0; 
//		int i=0;
//		for(i=1; i<101; i++) {
//			if(i%2==0) {
//				num-=i;
//			}else {
//				num+=i;
//			}
//		}
//		System.out.println(num);

//		int sum=0;
//		int i = 0;
//		for(i=1; i<=77; i++) {
//			sum+=i *(78-i);
//		}
//		System.out.println(sum);

//		Scanner scan = new Scanner(System.in);
//		
//        System.out.print("정수1 입력>>");
//		int Base = scan.nextInt();
//	    System.out.print("정수2 입력>>");
//		int n = scan.nextInt();
//		int a = 1;
//		int i = 0;
//		for (i = 1; i <= n; i++) {
//			a = a * Base;
//			System.out.println(a);
//		}
		
		//구구단 만들기
//		Scanner scan = new Scanner(System.in);		
//        System.out.print("단 입력: ");
//        int a = scan.nextInt();
//        System.out.print("범위 입력: ");
//        int b = scan.nextInt();
//        
//		for (int i= 1; i<= b; i++) {
//			System.out.println(a+" * "+ i + " = " + a*i);
//		}
//		
//		
		int hap=0;
		int sw=1;
				for(int i =1; i<=10;i++) {
					hap+=(sw*i);
					sw*=-1;
		
				}
				System.out.println(hap);
	}

}
