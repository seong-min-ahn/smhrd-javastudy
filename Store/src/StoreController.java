import java.util.ArrayList;

public class StoreController {
	
	Restaurant R1 = new Restaurant("�ؼ��Ĵ�","������",80,65,80,40);
	Restaurant R2 = new Restaurant("�����Ĵ�","������",100,100,97,98);
	Restaurant R3 = new Restaurant("�ջ����","������",70,78,67,75);
	
	Salon S1 =new Salon("�̿�� 1","�̿��",100,99,97);
	Salon S2 =new Salon("�̿�� 2","�̿��",90,98,90);
	Salon S3 =new Salon("�̿�� 3","�̿��",60,59,67);
	
	public ArrayList<Restaurant> getR(){
		ArrayList<Restaurant> Rlist = new ArrayList<>();
		Rlist.add(R1);
		Rlist.add(R2);
		Rlist.add(R3);
		return Rlist;
	}
	public ArrayList<Salon> getS(){
		ArrayList<Salon> Slist = new ArrayList<>();
		Slist.add(S1);
		Slist.add(S2);
		Slist.add(S3);
		return Slist;
	}
	public void showSalon() {
		StoreController C = new StoreController();
	   ArrayList<Salon> S = C.getS();
	   for(int i=0; i<S.size(); i++) {
		   System.out.printf("\n %d. %s\t���� : %.2f", i+1,S.get(i).getName(), S.get(i).grade());
	   }System.out.println();
	}
	public void showRestaurant() {
		StoreController C = new StoreController();
	   ArrayList<Restaurant> R = C.getR();
	   for(int i=0; i<R.size(); i++) {
		   System.out.printf("\n %d. %s\t���� : %.2f", i+1,R.get(i).getName(), R.get(i).grade());
	   }System.out.println();
	}
	public void detail(String name) {
		StoreController C = new StoreController();
		 ArrayList<Store> store = C.getStore();
		 
		 System.out.println("���Ը�: " +name);
		 System.out.println("10\t");
		 
	}
	
	

}
