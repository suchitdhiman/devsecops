package com.sk.main;

import com.sk.service.ArithmaticOperations;
import com.sk.upi.UPIPayment;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ArithmaticOperations operations = new ArithmaticOperations();
        int sum = operations.add(5, 3);
        int difference = operations.subtract(5, 3);
        int product = operations.multiply(5, 3);
        System.out.println("Sum is:"+sum);
        System.out.println("Difference is:"+difference);
        System.out.println("Product is:"+product);
        
        UPIPayment upiPayment = new UPIPayment();
        String paymentStatus = upiPayment.doUpiPayment(1234567890L, 100.50f);
        System.out.println(paymentStatus);
    }
}
