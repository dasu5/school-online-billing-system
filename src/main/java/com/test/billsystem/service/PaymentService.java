package com.test.billsystem.service;

import java.util.List;

import com.test.billsystem.model.Payment;

public interface PaymentService {

	List<Payment> getMonthlyBill();
}
