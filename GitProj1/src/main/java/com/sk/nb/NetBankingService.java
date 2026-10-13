package com.sk.nb;

public class NetBankingService {
	
	public String transferMoney(Long sourceAccount, Long destinationAccount, Double amount) {
		// Logic to transfer money from sourceAccount to destinationAccount
		return amount+" Amount is Transfered successfully from "+sourceAccount+" to "+destinationAccount;
	}
}
