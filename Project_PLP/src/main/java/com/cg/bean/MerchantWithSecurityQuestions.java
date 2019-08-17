package com.cg.bean;

public class MerchantWithSecurityQuestions {
	
	private Merchant merchant;
	private SecurityAns security;
	
	public MerchantWithSecurityQuestions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MerchantWithSecurityQuestions(Merchant merchant, SecurityAns security) {
		super();
		this.merchant = merchant;
		this.security = security;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public SecurityAns getSecurity() {
		return security;
	}

	public void setSecurity(SecurityAns security) {
		this.security = security;
	}
	
}
