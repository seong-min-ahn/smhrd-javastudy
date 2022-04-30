import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice =0;
		MusicController mc = new MusicController();
		int i = 0;
		Boolean a = true;
		while (a) {
			System.out.println("====뮤직플레이어====");
			System.out.print("1.등록 2.목록 3. 실행 4.이전곡 5. 다음곡 6. 종료.>>");
			 choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("====등록====");
				System.out.print("제목: ");
				String title = scan.next();
				System.out.println("가수 : ");
				String singer = scan.next();
				System.out.println("시간 : ");
				int playTime = scan.nextInt();
				mc.insertMusic(title, singer, playTime);
			} else if (choice == 2) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("목록이 비어있습니다.");
				} else {
					mc.show();
				}
			} else if (choice == 3) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("재생할 곡이 없습니다");
	
				} else {
					mc.play(i);
				}
			} else if (choice == 4) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("재생할 곡이 없습니다.");
		
				} else if (list.size() == 1) {
					System.out.println("곡이 하나뿐입니다.");
				}
				if (i == 0) {
					i = list.size() - 1;
					mc.play(i);
				} else {
					i -= 1;
					mc.play(i);
				}
			} else if (choice == 5) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("재생할 곡이 없습니다.");
				
				} else if (list.size() == 1) {
					System.out.println("곡이 하나뿐입니다.");
				}
				if (i == list.size() - 1) {
					i = 0;
					mc.play(i);
				} else {
					i += 1;
					mc.play(i);
				}
			} else if (choice == 6) {
				System.out.println("종료되었습니다.");
				a = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		

	}

}
