package com.sk.upi;

import com.sk.service.ArithmaticOperations;

public class UPIPayment {
	
	public String doUpiPayment(Long mobileno, float amount) {
		return "Payment of amount "+amount+" is done successfully for mobile number "+mobileno+"using Bhart pay UPI"; 
	}

}
