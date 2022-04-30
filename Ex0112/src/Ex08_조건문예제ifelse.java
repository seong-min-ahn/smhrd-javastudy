import java.util.Scanner;

public class Ex08_조건문예제ifelse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		//60점 이상이면 합격입니다. -> 조건문 if
		//60 미만이면 불합격입니다.  ->조건이 아닌 경우 else			
		if (score>=60){
			System.out.println("합격입니다");
			
		}else{//그렇지 않으면 (else는 조건쓰지 않는다 )
			System.out.println("불합격 입니다");
		}

	}

}
