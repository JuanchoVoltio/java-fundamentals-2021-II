package com.javacourse.examples.statictest;

public class Test {

    public static void main(String[] args) {
//        System.out.println(BillingSystem.quote(200));
//        System.out.println(BillingSystem.quote(150));
//        System.out.println(BillingSystem.quote(100));

        BillingSystem billingSystem = new BillingSystem();
        Bill myBill = billingSystem.generateBill(100);
        Bill anotherBill = new Bill();

        System.out.println(myBill.IVA);
        System.out.println(anotherBill.IVA);


    }
}
