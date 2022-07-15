package com.example.mocks;

public class CashRegister {

    private final Printer printer;

    CashRegister(Printer printer) {
        this.printer = printer;
    }

    public void process(Purchase purchase) {
        printer.print(purchase.asString());
    }

}
