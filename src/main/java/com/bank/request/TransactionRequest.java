package com.bank.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class TransactionRequest {
	 @NotBlank
	 private Double amount;
	 
	 @NotBlank
	 private String comment;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	 

}
