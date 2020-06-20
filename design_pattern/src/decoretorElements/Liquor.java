package decoretorElements;

public class Liquor extends DecCoffee {
	private int liquorPrice = 2;
	private String coffeeType = " with liquar";
	public Liquor(Coffee compnent) {
		super(compnent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String makeCoffee() {
		return super.makeCoffee() + coffeeType;
	}
	
	@Override
	public int price() {
		// TODO Auto-generated method stub
		return super.price()+liquorPrice;
	}
}
