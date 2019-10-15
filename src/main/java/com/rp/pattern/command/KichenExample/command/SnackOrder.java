package com.rp.pattern.command.KichenExample.command;

import com.rp.pattern.command.KichenExample.receiver.KitchenWorker;

public class SnackOrder extends Order {
	public SnackOrder(KitchenWorker receiver) {
		super(receiver);
		super.name = "snackOrder";
	}
}
