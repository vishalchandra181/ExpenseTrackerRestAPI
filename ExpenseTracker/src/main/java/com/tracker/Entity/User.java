package com.tracker.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="person")
public class User {
	
	@Id
	private String Id;
	private String userName;
	private String userEmail;
	
	@OneToMany(mappedBy = "transactionId")
    private List<Transaction> transaction;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	public User(String id, String userName, String userEmail, List<Transaction> transaction) {
		super();
		Id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.transaction = transaction;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}