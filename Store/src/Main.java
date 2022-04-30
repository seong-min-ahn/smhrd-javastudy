import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StoreController C = new StoreController();
		
		while(true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >>");
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.print("====음식점 보기====");
				C.showRestaurant();
			}else if(choice ==2) {
				System.out.println("====미용실 보기====");
				C.showSalon();
			}else if(choice==3) {
				System.out.println("====상세정보====");
				System.out.print("가게명 입력 : ");
				String name = sc.next();
			}else if(choice==4) {
				C.showScore();
			}else if(choice ==5) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

}
