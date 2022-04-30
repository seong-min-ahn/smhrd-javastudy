
public class Ex05_삼항연산 {

	public static void main(String[] args) {
		
		//(조건문)? (실행문1) : (실행문2)
		
	   int score = 50;
	   System.out.println(score>=60 ? "합격" : "불합격" );
	   
	   int j,k,L,result;
	   j=10;
	   k=20;
	   L=30;
	   result = j<k? k++:--L;
	   System.out.println(result + ","+ k + ","+ L);
		

	}

}
