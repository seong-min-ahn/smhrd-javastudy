
public class Restaurant extends Store {
	
	private double service;
	private double flavor;
	private double clean;
	
	public Restaurant (String name, String event, double service, double flavor, double clean, double price ) {
		this.setName(name);
		this.setEvent(event);
		this.service= service;
		this.flavor=flavor;
		this.clean=clean;
		this.setPrice(price);
	}
	
	public double grade() {
		double Ravg = 	(	this.service+this.flavor+this.clean+this.getPrice())/4;
		return Ravg;
	}

}
