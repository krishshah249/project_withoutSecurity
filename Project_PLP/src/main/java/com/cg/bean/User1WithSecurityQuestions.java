package com.cg.bean;

public class User1WithSecurityQuestions {
	
	private User1 user;
	private SecurityAns security;
	
	public User1WithSecurityQuestions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1WithSecurityQuestions(User1 user, SecurityAns security) {
		super();
		this.user = user;
		this.security = security;
	}

	public User1 getUser() {
		return user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	public SecurityAns getSecurity() {
		return security;
	}

	public void setSecurity(SecurityAns security) {
		this.security = security;
	}

	@Override
	public String toString() {
		return "User1WithSecurityQuestions [user=" + user + ", security=" + security + "]";
	}
	
	
}
