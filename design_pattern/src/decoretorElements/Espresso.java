package decoretorElements;

public class Espresso implements Coffee{

	@Override
	public int price() {
		return 5;
	}

	@Override
	public String makeCoffee() {
		// TODO Auto-generated method stub
		return this.toString();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Espresso";
	}

}
