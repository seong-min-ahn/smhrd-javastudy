
public class Main {

	public static void main(String[] args) {
		Tv t = new Tv();
		
		t.channel =7;
		t.color="red";
		t.print(); //���� Tv�� ���� ���
		t.channelUP();
		t.channelUP();
		t.print();
		t.color="black";
		t.channelDown();
		t.print();
		
	}

}
