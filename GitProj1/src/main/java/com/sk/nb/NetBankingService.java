package com.sk.nb;

public class NetBankingService {
	
	//for netbanking
	public String transferMoney(Long sourceAccount, Long destinationAccount, Double amount, String transferType) {
		// Logic to transfer money from sourceAccount to destinationAccount
		System.out.println("NetBankingService.transferMoney()");
		return amount+" Amount is Transfered successfully from "+sourceAccount+" to "+destinationAccount+ " using "+transferType+" transfer type";
	}
}
