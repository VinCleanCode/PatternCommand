package com.rp.pattern.command.KichenExample.command;

import com.rp.pattern.command.KichenExample.receiver.KitchenWorker;

public abstract class Order {
	protected KitchenWorker receiver;
	protected String name;

	public Order(KitchenWorker receiver){
		this.receiver = receiver;
	}

	public void sendOrder(){
		receiver.finishOrder();
	}

	public String getName(){
		return this.name;
	}
}
