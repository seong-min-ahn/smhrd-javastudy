package Ex01_Å¬·¡½º¿Í°´Ã¼;
//½Ü²¨ 
public class Cat {
	String name;
	int hungry;
	int angry;
	
	public void feed(String food) {
		if(food.equals("Ãò¸£")) {
			System.out.println("³È³È");
			hungry += 20;
			
		}else {
			System.out.println("ÇÏ¾Æ¾Ç!!");
		}
	}

}
