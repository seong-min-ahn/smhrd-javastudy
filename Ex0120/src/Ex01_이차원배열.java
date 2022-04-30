
public class Ex01_이차원배열 {

	public static void main(String[] args) {
		//tip! 이차원 배열은 실제 알고리즘을 사용할 때 (프로그래밍할 때) 많이 ~ 쓰진 않음
		//하지만 향후에 배울 객체(아직 안 배움)를 배열에 저장하는 개념을 이해하기위한 단계
		//이론 위주 ~~ 개념 설명
		
		//thinking!! 1팀(미지님)의 팀원들 이름(권창, 미지, 준형, 혜선, 호진)  저장~~
		
		String[] team1 = { "권창", "미지", "준형", "혜선", "호진" };
		
		// 2팅(창현팀)의 팀원들 저장(창현, 영균, 영현, 홍주, 하빈)
		
		String[] team2 = { "창현", "영균", "영현", "홍주", "하빈" };
		
		//우리반은 5개의 팀으로 구성되어 있다!
		//=>> string[]  (스트링배열)이 5개 만들어진다
		//=>> 각 배열의 주소는 string[]이라는 같은 자료형!!
		//=>> 같은 자료형을 순차적으로 저장하는 방법은?? => 배열!!
		//=> 결론! string[]을 배열에 또 저장할 수 있음!! => 이차원배열
	    String[] 선생님 = {"세연","은비"};
		String[][] 우리반 = {team1, team2,선생님};
		
//		System.out.println(우리반[1][3]);    //==> 홍주 
		System.out.println(우리반);                  //주소만
		System.out.println(우리반.length);            //3
		System.out.println(우리반[1]);               //team2 주소만   우리반 배열의 1번 인덱스 값
		System.out.println(team2);                 //team1 주소만   
		System.out.println(우리반[0].length);         //우리반 배열의 0번 인덱스 값의 길이     5
		System.out.println(우리반[2].length);         //우리반 배열의 2번 인덱스 값의 길이     2
		System.out.println(우리반[0][2].length());    //우리반 배열의 0번 인덱스의 2번인덱스 값의 길이(준형의 길이 2)   2
		
		
		// 위에서 적은 방법은 이미 데이터가 결정된 후에 배열 만든 방법!!
		//그렇다면 텅 빈 배열(데이터가 나중에 결정될 배열) 만드는 방법은??
		int [][] total = new int [5][3];
		
		
		
		

	}

}
