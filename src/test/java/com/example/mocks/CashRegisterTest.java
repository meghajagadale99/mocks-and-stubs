package com.example.mocks;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class CashRegisterTest {

    @Test
    public void dummyTest() {
        assertEquals("Integer One is equal to Integer 1", 1, 1);
    }

    @Test
    public void shouldCallPrintMethodWhenProcessMethodIsCalled() {
        Purchase purchase = new Purchase(Collections.EMPTY_LIST);
        MockPrinter printer = new MockPrinter();
        CashRegister cashRegister = new CashRegister(printer);

        cashRegister.process(purchase);

        assertTrue(printer.isPrintMethodCalled);
    }

    @Test
    public void shouldPrintStringValueWhenPrintMethodIsCalledByCashRegisterProcess() {
        StubPurchase purchase = new StubPurchase(List.of(new Item("Soap", 5)));
        MockPrinter printer = new MockPrinter();
        CashRegister cashRegister = new CashRegister(printer);
        String printThis = "Print this";
        purchase.printThis = "Print this";

        cashRegister.process(purchase);

        assertEquals(printThis, printer.printContent);
    }

    @Test
    public void shouldPrintStringValueWhenPrintMethodIsCalledByCashRegisterProcessUsingMockito() {
        Printer printer = mock(Printer.class);
        Purchase purchase = mock(Purchase.class);
        when(purchase.asString()).thenReturn("Print this");
        CashRegister cashRegister = new CashRegister(printer);

        cashRegister.process(purchase);

        verify(printer).print("Print this");
    }
}
