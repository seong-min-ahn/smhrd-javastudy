
public class MusicVO {

	public String title;
	public String singer;
	public int playTime;
	
	
	public MusicVO(String title, String singer, int playTime) {
		//super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getSinger() {
		return this.singer;
	}
	public int getPlayTime() {
		return this.playTime;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setPlaytime(int playTime) {
		this.playTime = playTime;
	}
	
	public String toString () {
		String string = "�뷡 ����: "+ this.title+"\t" + "����: " +" this.singer"+ "\t"+
				       "�ð�: "+ this.playTime; 
		return string;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}