package com.tracker.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
	
	@Id
	private String transactionId;
	private String itemName;
	private Double amount;
	private String note; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Transaction(String transactionId, String itemName, Double amount, String note, User user) {
		super();
		this.transactionId = transactionId;
		this.itemName = itemName;
		this.amount = amount;
		this.note = note;
		this.user = user;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}	
}


    
	
