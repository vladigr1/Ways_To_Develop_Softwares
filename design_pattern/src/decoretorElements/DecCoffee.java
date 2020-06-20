package decoretorElements;

public abstract class DecCoffee implements Coffee{
	public Coffee compnent;
	
	public DecCoffee(Coffee compnent) {
		this.compnent =compnent;
	}
	
	public int price() {
		return compnent.price();
	}
	public String makeCoffee(){
		return compnent.makeCoffee();
	}
}
