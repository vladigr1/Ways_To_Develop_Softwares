package singleton;

import java.util.ArrayList;

import decoretorElements.Coffee;

public class CoffeeHouse {
	private static CoffeeHouse ch;
	public ArrayList<Coffee> orders;
	
	private CoffeeHouse() {
		orders = new ArrayList<Coffee>();
	}
	public static CoffeeHouse getInstace() {
		if (ch == null) {
			ch = new CoffeeHouse();
		}
		return ch;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int total = 0;
		for(Coffee c :  orders) {
			sb.append(c.makeCoffee() + " " + c.price() + "\n");
			total += c.price();
		}
		sb.append("total: "+total);
		return sb.toString();
	}
}
