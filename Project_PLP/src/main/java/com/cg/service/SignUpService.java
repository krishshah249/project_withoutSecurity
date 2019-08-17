package com.cg.service;

import com.cg.bean.Admin;
import com.cg.bean.Merchant;
import com.cg.bean.SecurityAns;
import com.cg.bean.User1;

public interface SignUpService {

	boolean userExists(String emailId);
	boolean merchantExists(String emailId);
	boolean adminExists(String emailId);
	boolean addUser(User1 user);
	boolean addAdmin(Admin admin);
	boolean addMerchant(Merchant merchant);
	boolean addSecurityAns(SecurityAns security);
	
}
