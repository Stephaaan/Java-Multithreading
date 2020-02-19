package me.rothmajer.threads;

import java.util.Random;

public class NumberPrinterThread extends Thread {
    private int maxMillisecondsDelay = 1000;
    @Override
    public void run() {
        Random rnd = new Random();
        for(int i = 1; i < 11; i++){
            System.out.println(i);
            try {
                Thread.sleep(rnd.nextInt(maxMillisecondsDelay));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
