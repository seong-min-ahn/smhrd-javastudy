package Ex_0208�����̱⸸���;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// ������ ���� �� �ִ� �����̱� ��� ����!
		//1. ��� ----> Machine
		//2. ���� ----> Pika
		
		Machine m = new Machine();
		
//		Pika pika = new Pika();
//		m.pic(pika);
//		
//		Pairi pairi = new Pairi();
//		m.pic(pairi); 
		
//		m.pic(new Pika());
//      m.pic(new Pairi());
	
		
		//�������� ������ ������ ��� ����
	    
		Doll[] dolls = {new Pika(), new Pairi(), new Kkobuk()};
		             //  [0]       ,   [1]       ,   [2]
		
		// ������ �������� ������ �� �ֵ��� ������ ����
		Random rd = new Random();
		int num = rd.nextInt(dolls.length);
		
		m.pic(dolls[num]);
		
		

	}

}
