package com.rp.pattern.command.KichenExample.command;

import com.rp.pattern.command.KichenExample.receiver.KitchenWorker;

public class DrinkerOrder extends Order{
	public DrinkerOrder(KitchenWorker receiver){
		super(receiver);
		super.name = "drinkOrder";
	}
}
