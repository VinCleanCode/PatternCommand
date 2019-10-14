package com.rp.pattern.command.KichenExample.receiver;

public class Chef implements KitchenWorker {
    public void finishOrder() {
        System.out.println("Bread->Oven->polish->Done\n");
    }
}
