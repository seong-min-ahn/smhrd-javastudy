package Ex01_Å¬·¡½º¿Í°´Ã¼;

//¼³°èµµ
public class Dog {
	//¼Ó¼º,data,ÇÊµå
	String name;
	int age;
	int hungry; //¹è°íÇÄ
	int ddong;  //¹èº¯¿å±¸ 
	
	//Çàµ¿, logic,¸Þ¼Òµå
	public void bark() {
		System.out.println("¸Û¸Û¸Û");
	}
	public void feed(String food) {
		if(food.equals("°í±â")) {
			System.out.println("¿Ð¿Ð¿Ð ½Å³­´Ù!");
			hungry += 20;
			ddong+= 5;
			
		}else {
			System.out.println("Èþ...°ÅÀý");
		}
	}
	public String poo() {
		ddong =0;
		return "¶ß±ÙÇÑ ÀÀ°¡";
	}
    
	public void lick(Cat c) {//ÇÓ´Â ÇàÀ§
		System.out.println(c.name + "À» ÁI´Ù. «‡«‡«‡");
		c.angry += 50;
	}
}
