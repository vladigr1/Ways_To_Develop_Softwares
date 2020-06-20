package design_pattern;

import decoretorElements.CWhippedCream;
import decoretorElements.Espresso;
import decoretorElements.Liquor;
import decoretorElements.Mochiato;
import singleton.CoffeeHouse;
import sun.security.jca.GetInstance;

public class main {
	public static void main(String[] args) {
		Liquor liq =new Liquor(new Espresso());
		CWhippedCream cm = new CWhippedCream(new Mochiato());
		CoffeeHouse cf = CoffeeHouse.getInstace();
		System.out.println(liq.makeCoffee() + " " + liq.price());
		System.out.println(cm.makeCoffee() + " " + cm.price());
		
		System.out.println("\n");
		cf.orders.add(liq);
		cf.orders.add(cm);
		System.out.println(cf);
		System.out.println("\n");
		
		CWhippedCream ce = new CWhippedCream(new Espresso());
		CoffeeHouse ncf = CoffeeHouse.getInstace();
		cf.orders.add(ce);
		System.out.println(cf);
	}
}
