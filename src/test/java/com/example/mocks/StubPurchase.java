package com.example.mocks;

import java.util.List;


public class StubPurchase extends Purchase {
    public List<Item> items;
    public String printThis;

    public StubPurchase(List<Item> items) {
        super(items);
        this.items = items;
    }

    @Override
    public String asString() {
        return printThis;
    }
}

