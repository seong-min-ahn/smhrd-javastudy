import java.util.ArrayList;

public class MusicController {
	ArrayList<MusicVO>list = new ArrayList<>();
	
	public void insertMusic(String title, String singer, int playTime) {
		MusicVO vo = new MusicVO(title, singer, playTime);
		list.add(vo);
	}
	
	public void show() {
		System.out.println("====�뷡���====");
		for(int i=0; i<list.size();i++) {
			System.out.println((1+i)+ "����: "+ list.get(i).getTitle()+"\t"+ "����: "
		    + list.get(i).getSinger()+"\t"+ "�ð�: "+list.get(i).getPlayTime()+ "��");
			
		}
		
	}
	public void play(int i) {
		System.out.println("====����====");
		System.out.println("����: "+ list.get(i).getTitle()+"\t"
		+"����: "+list.get(i).getSinger()+ 
				"\t"+ "�ð�: "+ list.get(i).getPlayTime()+"��");
	}
    public ArrayList<MusicVO>getList(){
    	return list;
    	
    }
	

}
