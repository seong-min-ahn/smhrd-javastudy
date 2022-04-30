
public class Ex03_0118과제2 {

	public static void main(String[] args) {
		//배열에 숫자 13 , 5, 7, 17, 3, 16, 19, 20, 2, 1, 저장하고
		//1)짝수 번재 인덱스만 출력
		//2)홀수 몇개 인지 출력
		//3)모든 수의 평균 구하기
		
		int[] number = {13 , 5, 7, 17, 3, 16, 19, 20, 2, 1};
		int i;
		
		for(i = 0; i <= 9; i++) {
			if((1+i)%2==0) {
				System.out.print(number[i]+ " ");
			}
		}
		System.out.println();
		
		int count_number= 0 ;
		for(i = 0; i<=9; i++) {
			if(number[i]%2!=0) { 
				System.out.print(number[i]+" ");
				count_number++;			
			}
		}	System.out.print("이며 홀수의 수는 "+ count_number+"개 이다");
		System.out.println();
		
		int sum = 0;
		for(i=0; i<=9; i++) {
			sum+= number[i];
		}System.out.println("평균은 "+ (sum/10f)+ "이다.");
		

	}

}
