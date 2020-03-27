package com.company;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        this.tonerLevel = 0;
        this.printedPages = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int ink){
        if(ink<0){
            System.out.println("Invalid amount of ink");
            return;
        }

        if(tonerLevel+ink>100){
            System.out.println("Too much ink, ink's set to 100");
            return;
        }

        tonerLevel+=ink;
    }

    public void printing(){
        printedPages++;
    }
}
