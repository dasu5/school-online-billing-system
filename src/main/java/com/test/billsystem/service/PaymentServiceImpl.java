package com.test.billsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.billsystem.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public List<Payment> getMonthlyBill() {
		return null;
	}

}
