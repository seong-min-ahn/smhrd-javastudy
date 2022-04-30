package Ex01클래스;//클래스와 객체

public class TV {
	// 필드(data, 속성)
	 String 브랜드;
	 String 색상;
	private int 채널;
	private int 음량;
	private boolean 인터넷연결상태;
	private boolean 전원상태;
	private float 화면크기;

	// 메소드(logic,기능)
	public void 채널변경(int 변경할채널) {
		채널 = 변경할채널;
	}
	public void 채널업() {
		if (채널 <= 999) {
			채널++;
		}else {
			채널 = 0;
		}
	}
	public void 채널다운() {
		if(채널>0) {
			채널--;
		}else {
			채널=999;
		}
	}
	public void 전원온오프() {
		전원상태 = !전원상태; 
	}
	public boolean 전원상태확인() {
		return 전원상태;
	}
	
}
