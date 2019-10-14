package com.rp.pattern.command.KichenExample.receiver;

public class Brkeep implements KitchenWorker {
    public void finishOrder() {
        System.out.println("Glass->Ice->Drink->Done\n");
    }
}
