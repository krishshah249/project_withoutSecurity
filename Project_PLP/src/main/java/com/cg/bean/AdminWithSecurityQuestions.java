package com.cg.bean;

public class AdminWithSecurityQuestions {

	private Admin admin;
	private SecurityAns security;
	
	public AdminWithSecurityQuestions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminWithSecurityQuestions(Admin admin, SecurityAns security) {
		super();
		this.admin = admin;
		this.security = security;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public SecurityAns getSecurity() {
		return security;
	}

	public void setSecurity(SecurityAns security) {
		this.security = security;
	}
	
	
	
}
