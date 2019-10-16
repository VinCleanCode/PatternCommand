package com.rp.pattern.command.KitchenExample;

import com.rp.pattern.command.KichenExample.Invoker.Waitress;
import com.rp.pattern.command.KichenExample.command.DrinkerOrder;
import com.rp.pattern.command.KichenExample.command.Order;
import com.rp.pattern.command.KichenExample.command.SnackOrder;
import com.rp.pattern.command.KichenExample.receiver.Barkeep;
import com.rp.pattern.command.KichenExample.receiver.Chef;

public class CoffeShopClient {
	public static void main(String[] args) {
		System.out.println("======================Command Pattern TEST===================");

		Chef snackChef = new Chef();
		Barkeep barkeep = new Barkeep();
		Order snackOrder = new SnackOrder(snackChef);
		Order drinkOrder = new DrinkerOrder(barkeep);

		Waitress w1 = new Waitress();
		System.out.println("=======Customer order=======");
		w1.setOrder(snackOrder);
		w1.setOrder(snackOrder);
		w1.setOrder(drinkOrder);
		w1.setOrder(drinkOrder);

		w1.setOrder(drinkOrder);
		System.out.println("=============Customer cancel snack==============");
		w1.cancelOrder(snackOrder);

		w1.setOrder(snackOrder);
		System.out.println("====== Finished order, notify Kitchen =========");

		w1.notifyBaker();
		System.out.println();
		System.out.println("===== snack stock not enough ======");
		w1.setOrder(snackOrder);
	}
}
