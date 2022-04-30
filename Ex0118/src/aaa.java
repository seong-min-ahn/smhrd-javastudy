
public class aaa {

	public static void main(String[] args) {
		//배열 만드는 방법
				//1. 데이터 세팅(초기화)하면서 배열 생성!
//				 int[]numbers = {1,2,3,4,5,};
				//2.텅 빈 n칸 짜리 배열 생성!
//				int[] num2 = new int[10]; 
				// new : 새롭게 메모리를 생성할 때 쓰는 키워드! int형 10칸 배열 메모리 생성!
				
				//1).계절을 저장하는 season이라는 배열 생성!
			     String[] season = {"봄","여름","가을","겨울"};
				
				
				//2)팀원 이름을 저장하는 team라는 배열 5칸 생성!
				String[] team= new String[4];
				 //[Ljava.lang.String;@6504e3b2   ---->이렇게 뜨는데 이게 배열 메모리의 주소임!!
				//2-1) 각각 칸에 이름 저장하기~~
				team[0] = "이";
				team[1] = "김";
				team[2] = "박";
				team[3] = "유";
				team[4] = "양";
				//team[5] = "가나다" 예외 발생!! 5번인덱스 없음!!
				
				season = team;
				
				System.out.println(season[2]);
				//1)team은 5칸,seaon은 4칸인데 이게 어떻게 가능함?
				
				team[2] = "칼국수"; //2? 내가 바꾼거는 team인데 왜  
				System.out.println(season[2]);
				//왜 season이 바뀜??
				System.out.println(season[4]);
				//3)이거 어떻게 됨? 
				System.out.println(team[4]);
			}

	}


