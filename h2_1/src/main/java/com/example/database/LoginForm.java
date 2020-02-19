package com.example.database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginForm {

	
	@Id
	private int aid;
	private String username;
	private String password;
	private int mobileNo;
	
	/*
	 * @Override public String toString() { return "Alien [aid=" + aid + ", aname="
	 * + username + " ,password=" + password + " ,+ mobileNo=" + mobileNo + "]"; }
	 */
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LoginForm() {
		super();
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
