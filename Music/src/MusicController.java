import java.util.ArrayList;

public class MusicController {
	ArrayList<MusicVO>list = new ArrayList<>();
	
	public void insertMusic(String title, String singer, int playTime) {
		MusicVO vo = new MusicVO(title, singer, playTime);
		list.add(vo);
	}
	
	public void show() {
		System.out.println("====노래목록====");
		for(int i=0; i<list.size();i++) {
			System.out.println((1+i)+ "제목: "+ list.get(i).getTitle()+"\t"+ "가수: "
		    + list.get(i).getSinger()+"\t"+ "시간: "+list.get(i).getPlayTime()+ "초");
			
		}
		
	}
	public void play(int i) {
		System.out.println("====실행====");
		System.out.println("제목: "+ list.get(i).getTitle()+"\t"
		+"가수: "+list.get(i).getSinger()+ 
				"\t"+ "시간: "+ list.get(i).getPlayTime()+"초");
	}
    public ArrayList<MusicVO>getList(){
    	return list;
    	
    }
	

}
