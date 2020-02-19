package me.rothmajer.threads;

public class Main {
    public static void main(String[] args) {
        NumberPrinterThread t1 = new NumberPrinterThread();
        NumberPrinterThread t2 = new NumberPrinterThread();
        NumberPrinterThread t3 = new NumberPrinterThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
