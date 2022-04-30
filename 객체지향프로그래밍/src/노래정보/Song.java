package 노래정보;

public class Song {
	
	//설계도 
	//1. 필드
	//노래의 제목을 나타내는 title
	//가수를 나타내는 artist
	//노래가 발표된 연도를 나타내는 year
	//국적을 나타내는 country
	String title;
	String artist;
	int year;
	String country;
	

	//생성자
	//노래 정보를 객체생성하면서 바로
	//데이터 받아올수 있도록
	//매개변수로 모든 필드를 초기화하는 생성자
	
	public Song(String title, String artist, int year, String country) {
		//super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	

	//2. 메서드
	//노래 정보를 출력하는 show()메서드 만들기
	//1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"
	
	//매개변수 필요하지 않음-> 생성자를 통해서 데이터를 받아왔기때문에
	
	// \"  ->  console "가 출력된다
	public void show() {
		System.out.println(year+"년,"+ country+" 국적의 "+ artist + "가 부른 "+ "\""+title+"\"" );
	}
	

	
	
	
	
	
	
	
	
}
