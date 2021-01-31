package com.bank.dao;

import java.math.BigDecimal;

import java.util.Date;

import lombok.Data;

@Data
public class TransactionDAO {
	private Long id;
	private String date;
	private String description;
	private String type;
	private double amount;
	private BigDecimal availableBalance;
	private Boolean isTransfer;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}
	public Boolean getIsTransfer() {
		return isTransfer;
	}
	public void setIsTransfer(Boolean isTransfer) {
		this.isTransfer = isTransfer;
	}
	
}
