package com.model;

public class UserLog {
	private String firstName,lastname,email,mno,password;

	@Override
	public String toString() {
		return "UserLog [firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", mno=" + mno
				+ ", password=" + password + "]";
	}

	public UserLog(String firstName, String lastname, String email, String mno, String password) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.mno = mno;
		this.password = password;
	}

	public UserLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}