package com.company.inheritance;

public class FactoryTest {

    public static void main(String[] args) {

        CarFactory car = new CarFactory();
        PhoneFactory phone = new PhoneFactory();

        car.produce();
        car.testDrive();
        phone.checkState();
        phone.testCall();
    }
}
