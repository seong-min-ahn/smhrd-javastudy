
public class Ex06_완전수 {

	public static void main(String[] args) {
		
		
		
		
		for(int  i=1; i<=1000; i++) {//숫자를 입력하면 1부터 그 숫자까지
			int sum=0;
			for(int j=1; j<i; j++) {
				//1. 약수 구하기
				if(i%j==0) {//차례대로 나눠보고 나누어 떨어지면
					sum+=j; //하나씩 누적해서 더함
				}
			}
			if (sum==i) { //위에 누적된 수에는 자기 자신도 포함되어 있으므로 한번 빼 줌
				System.out.println(i+"은 완전수 입니다! ");
			}
			
		}

	}

}
