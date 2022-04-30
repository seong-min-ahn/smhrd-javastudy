import java.util.Scanner;

public class Ex_조건문실습 {

	public static void main(String[] args) {
		//국어,영어,수학 점수를 입력받아서 합격/불합격 여부를 연결해주고 싶습니다
		//평균 70점이 넘으면 합격, 한과목이라도 60점 미만이면 과락!
		
		//80,90,80 -->합격
		//80,55,90--> 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력: ");
		int score1 = sc.nextInt();
		
		System.out.print("영어점수 입력: ");
		int score2 = sc.nextInt();
		
		System.out.print("수학점수 입력: ");
		int score3 = sc.nextInt();
		
		if ((((score1+score2+score3)/3)>=70)&&(score1>=60&&score2>=60&&score3>=60)){
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다");
			System.out.println((score1+score2+score3)/3<70?"평균이 70점 미만입니다":"");
			System.out.println(score1<60 ? "국어과락":"");
			System.out.println(score2<60 ? "영어과락":"");
			System.out.println(score3<60 ? "수학과락":"");
			
			
			
				}
			
		}
		
	
		
		

	}
	


