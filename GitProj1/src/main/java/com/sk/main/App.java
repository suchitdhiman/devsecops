package com.sk.main;

import com.sk.nb.NetBankingService;
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
        
        System.out.println("-------------------UPI Payment-------------------");
        UPIPayment upiPayment = new UPIPayment();
        String paymentStatus = upiPayment.doUpiPayment(1234567890L, 100.50f);
        System.out.println(paymentStatus);
        
        String paymentStatusByAccount = upiPayment.doUPIPaymentByAccountNumber(9876543210L, 200.75f);
        System.out.println(paymentStatusByAccount);
        
        System.out.println("-------------------Net Banking-------------------");
        NetBankingService netBankingService = new NetBankingService();
        String transferStatus = netBankingService.transferMoney(1234567890L, 9876543210L, 500.00,"RTGS");
        System.out.println(transferStatus);
    }
}
