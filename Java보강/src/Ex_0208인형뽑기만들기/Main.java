package Ex_0208인형뽑기만들기;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// 인형을 뽑을 수 있는 인형뽑기 기계 생성!
		//1. 기계 ----> Machine
		//2. 인형 ----> Pika
		
		Machine m = new Machine();
		
//		Pika pika = new Pika();
//		m.pic(pika);
//		
//		Pairi pairi = new Pairi();
//		m.pic(pairi); 
		
//		m.pic(new Pika());
//      m.pic(new Pairi());
	
		
		//랜덤으로 인형이 뽑히는 기계 생성
	    
		Doll[] dolls = {new Pika(), new Pairi(), new Kkobuk()};
		             //  [0]       ,   [1]       ,   [2]
		
		// 인형이 랜덤으로 지정될 수 있도록 랜덤수 생성
		Random rd = new Random();
		int num = rd.nextInt(dolls.length);
		
		m.pic(dolls[num]);
		
		

	}

}
