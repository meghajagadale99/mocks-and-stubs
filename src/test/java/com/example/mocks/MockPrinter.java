package com.example.mocks;

public class MockPrinter extends Printer{
    public boolean isPrintMethodCalled = false;
    public String printContent;

    @Override
    public void print(String contents){
        printContent = contents;
        isPrintMethodCalled = true;
    }

}
