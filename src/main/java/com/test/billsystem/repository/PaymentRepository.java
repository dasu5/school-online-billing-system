package com.test.billsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.billsystem.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
