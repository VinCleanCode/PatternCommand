package com.rp.pattern.command.KichenExample.Invoker;

import com.rp.pattern.command.KichenExample.command.Order;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
	private int snackQty = 2;
	private int drinkQty = 4;
	private List<Order> orderList = new ArrayList<Order>();

	public void setOrder(Order order){
		if(order.getName().equals("snackOrder")){
			if(snackQty <= 0){
				System.out.println("snack sold out!");
			}else {
				System.out.println("Add snack order");
				snackQty--;
				orderList.add(order);
			}
		}

		if(order.getName().equals("drinkOrder")){
			if(drinkQty <= 0){
				System.out.println("Drink sold out!");
			}else{
				System.out.println("Add Drink Order");
				drinkQty--;
			}
		}
	}

	public void cancelOrder(Order order){
		if(order.getName().equals("drinkOrder")){
			drinkQty++;
			System.out.println("Cancel one drink");
		}

		if(order.getName().equals("snackOrder")){
			snackQty++;
			System.out.println("Cancel one snack");
		}
		orderList.remove(order);
	}

	public void notifyBaker(){
		for(Order order: orderList){
			order.sendOrder();
		}
		orderList.clear();
	}
}
