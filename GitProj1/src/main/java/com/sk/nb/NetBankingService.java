package com.sk.nb;

import java.util.Random;

public class NetBankingService {
	
	//for netbanking
	public String transferMoney(Long sourceAccount, Long destinationAccount, Double amount, String transferType) {
		// Logic to transfer money from sourceAccount to destinationAccount
		System.out.println("NetBankingService.transferMoney()");
		return amount+" Amount is Transfered successfully from "+sourceAccount+" to "+destinationAccount+ " using "+transferType+" transfer type";
	}
	
	public float getBalance() {
		// Logic to get the balance of the account
		float random = new Random().nextFloat() * 10000; // generating a random balance for demonstration
		return random; // returning a dummy balance for demonstration
	}
}
