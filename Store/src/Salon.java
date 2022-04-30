
public class Salon extends Store{
	private double technology;
	private double kindness;
	
	
	public Salon(String name, String event, double technology, double kindness, double price) {
//		/uper();
		this.technology = technology;
		this.kindness = kindness;
		this.setPrice(price);
	}


	@Override
	public double grade() {
		double Savg =(this.technology + this.kindness +this.getPrice())/3;
		
		return Savg;
	}
	
	

}
