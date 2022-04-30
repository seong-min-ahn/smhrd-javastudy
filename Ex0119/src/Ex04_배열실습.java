import java.util.Arrays;
import java.util.Random;

public class Ex04_배열실습 {

	public static void main(String[] args) {
		// 과제 겸 실습!
		// 1단계) 배열에 들어있는 수만큼 하트찍기!
		// 3:하트하트하트
		// 4:하트하트하트하트
		// 2:하트하트
		// 4:하트하트하트하트
		// 1:하트

		int[] heart = { 3, 4, 2, 4, 1 };
		// 2단계)
		// 랜던으로 1~5까지 뽑고 각 숫자별 개수세기

		// 마라맛!)
		// A,B,C,D,F 중에 랜덤으로 50개 뽑고 각 알파벳 별 개수 세어서 그래프(네모) 그리기
		// A(10개) : 네모 *10
		// B(8개)

		// 잘못 만진 랜덤으로 5번까지 별뽑기
//		Random rd = new Random();
//		int[]arr= new int[5];
//		
//		for (int i = 0; i< arr.length;i++) {
//			arr[i]=rd.nextInt(5)+1;
//			System.out.print(arr[i]+":");
//			for(int j =0; j<arr[i];j++) {
//				System.out.print("♥");
//				
//			}
//			System.out.println();
//		}

		// 1단계
//		for (int i = 0; i < heart.length; i++) {
//			System.out.print(heart[i] + ":");
//			for (int j = 0; j < heart[i]; j++) {
//				System.out.print("♥");
//			}
//			System.out.println();
//		}

		// 2단계(if 써서)
//		Random rd = new Random();
//		int[]arr= new int[5];
//		int[] number = new int[50];
//		int count_1 = 0;
//		int count_2 = 0;
//		int count_3 = 0;
//		int count_4 = 0;
//		int count_5 = 0;
//		
//	
//		for(int i = 0; i<number.length; i++) {
//			
//			System.out.println(Arrays.toString(number));
//			if (number[i] ==1) {
//				count_1=count_1+1;
//			}else if (number[i]==2){
//				count_2=count_2+1;
//			}else if (number[i]==2){
//				count_2=count_2+1;
//			}else if (number[i]==2){
//				count_2=count_2+1;
//			}else {
//				count_5=count_5+1;
//			}
//			
			//2단계(if안씀	)
		int[]numbers = new int[30]; 
		
		Random rand = new Random();
		for(int i =0; i<numbers.length; i++) {
			numbers[i] = rand.nextInt(1,6);				
		}
		System.out.println(Arrays.toString(numbers)); //배열 넣어주면 문자열이 나오는 함수!
		
		int[]cnt = new int[5];
		
		for(int i =0; i<numbers.length; i++) {
			cnt[numbers[i]-1]++;
		}
		System.out.println(Arrays.toString(cnt));

		// 3단계 (심화) A,B,C,D,F 중에서 랜덤으로 50개 뽑고 개수별로 그래프 그리기
//		Random rd = new Random();
//		int[] aaa = new int[50];
//		for (int i = 0; i < (aaa.length); i++) {
//			aaa[i] = rd.nextInt(1, 6);
//			System.out.print(aaa[i] + ":");
//			for (int j = 0; j < aaa[i]; j++) {
//				System.out.print("■");
//
//			}
//			System.out.println();
//		}

	}

}
