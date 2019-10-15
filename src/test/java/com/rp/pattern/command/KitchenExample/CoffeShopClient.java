package com.rp.pattern.command.KitchenExample;

import com.rp.pattern.command.KichenExample.command.DrinkerOrder;
import com.rp.pattern.command.KichenExample.command.Order;
import com.rp.pattern.command.KichenExample.command.SnackOrder;
import com.rp.pattern.command.KichenExample.receiver.Brkeep;
import com.rp.pattern.command.KichenExample.receiver.Chef;

public class CoffeShopClient {
	public static void main(String[] args) {
		System.out.println("======================Command Pattern TEST===================");

		Chef snackChef = new Chef();
		Brkeep brkeep = new Brkeep();
		Order snackOrder = new SnackOrder(snackChef);
		Order drinkOrder = new DrinkerOrder(brkeep);
	}
}
