package org.example.dataprocessor.Output;

public class Console implements OutputInterface {
    @Override
    public void output(double value) {
        System.out.println(value);
    }
}
