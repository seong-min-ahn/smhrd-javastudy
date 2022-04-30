import java.util.Random;

public class ex01복습 {

	public static void main(String[] args) {
		int[]numbers = new int[10];
		
		Random rd = new Random();
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rd.nextInt(10,51);
			for(int j=0; j<i; j++) {
				
			}
		}
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//최대값 찾기!!
		int max = numbers[0];
		int maxIndex = 0;
		for(int i = 1; i<numbers.length; i++) {
			if (numbers[i]>max) {
				max = numbers[i];   //numbers[i]는 값!!!!!
				maxIndex = i; //i 는 방번호! 인덱스!
			}
		}
		System.out.println("가장 큰 값은 "+ max + "입니다.");
		System.out.println("인덱스 값은 "+ maxIndex + " 번 입니다.");
		System.out.println("가장 큰값 순서는 "+ (maxIndex+1) + " 번 입니다.");

	}

}
