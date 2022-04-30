package Ex01클래스;//클래스와 객체

public class Tvsimlator {

	public static void main(String[] args) {
		//객체 생성
		//클래스명 객체명 = new 클래스명();
		TV tv1 = new TV();
		TV tv2 = new TV();
		
	    tv1.브랜드 = "삼성";
	    tv2.브랜드 = "LG";
		System.out.println(tv1.브랜드);
		System.out.println(tv2.브랜드);
		
		tv1.전원온오프();
		System.out.println(tv1.전원상태확인()); //켜짐
		
		//좋지 않은 접근방법
//		tv1.전원상태 = false;
//		System.out.println(tv1.전원상태);
//        
//		tv1.채널 = -50;
//		System.out.println(tv1.채널);
		
	}

}
