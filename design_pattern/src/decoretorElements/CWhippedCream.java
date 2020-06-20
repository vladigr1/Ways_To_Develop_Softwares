package decoretorElements;

public class CWhippedCream extends DecCoffee{
	private int creamPrice = 1;
	private String coffeeType = " with cream";
	public CWhippedCream(Coffee compnent) {
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
		return super.price()+creamPrice;
	}

}
