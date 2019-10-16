package com.rp.pattern.command.KichenExample.receiver;

public class Barkeep implements KitchenWorker {
    public void finishOrder() {
        System.out.println("Glass->Ice->Drink->Done\n");
    }
}
