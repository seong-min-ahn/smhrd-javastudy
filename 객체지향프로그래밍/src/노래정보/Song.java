package �뷡����;

public class Song {
	
	//���赵 
	//1. �ʵ�
	//�뷡�� ������ ��Ÿ���� title
	//������ ��Ÿ���� artist
	//�뷡�� ��ǥ�� ������ ��Ÿ���� year
	//������ ��Ÿ���� country
	String title;
	String artist;
	int year;
	String country;
	

	//������
	//�뷡 ������ ��ü�����ϸ鼭 �ٷ�
	//������ �޾ƿü� �ֵ���
	//�Ű������� ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	
	public Song(String title, String artist, int year, String country) {
		//super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	

	//2. �޼���
	//�뷡 ������ ����ϴ� show()�޼��� �����
	//1978��, ������ ������ ABBA�� �θ� "Dancing Queen"
	
	//�Ű����� �ʿ����� ����-> �����ڸ� ���ؼ� �����͸� �޾ƿԱ⶧����
	
	// \"  ->  console "�� ��µȴ�
	public void show() {
		System.out.println(year+"��,"+ country+" ������ "+ artist + "�� �θ� "+ "\""+title+"\"" );
	}
	

	
	
	
	
	
	
	
	
}
