package com.test.billsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int invoiceNum;
	
	@NotNull
	@Column(name="cus_name")
	private String customerName;
	
	@NotNull
	@Column(name="invoice_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date invoiceDate;
	
	@Column(name="cashier_name")
	private String staffMemberName;

	public int getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	
}
