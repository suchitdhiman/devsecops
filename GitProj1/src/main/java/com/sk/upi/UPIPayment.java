package com.sk.upi;


public class UPIPayment {
	
	public String doUpiPayment(Long mobileno, float amount) {
		return "Payment of amount "+amount+" is done successfully for mobile number "+mobileno+"using Bhart pay UPI"; 
	}
	
	public String doUPIPaymentByAccountNumber(Long accountNumber, float amount) {
		return "Payment of amount "+amount+" is done successfully for account number "+accountNumber+" using Bhart pay UPI"; 
	}

}
