package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.bean.*;
import com.cg.service.SignUpService;
import com.cg.service.SignUpServiceImpl;


@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200")
public class SignUpController {

	@Autowired
	private SignUpService service;
	
	@PostMapping(value="addUser",consumes={"application/json"})
	public ResponseToFrontend addUser(@RequestBody User1WithSecurityQuestions user) {
		if(service.userExists((user.getUser()).getEmailid()))
			return new ResponseToFrontend("User Already Exists");
		else {
			if(service.addUser(user.getUser()) && service.addSecurityAns(user.getSecurity()))
			return new ResponseToFrontend("User Added");
			else
			return new ResponseToFrontend("Error Occured");
		}
	
	}
	
	@PostMapping(value="addAdmin",consumes={"application/json"})
	public ResponseToFrontend addAdmin(@RequestBody AdminWithSecurityQuestions admin) {
		
		if(service.adminExists(admin.getAdmin().getEmailid()))
			return new ResponseToFrontend("Admin Already Exists");
		else{
			if(service.addAdmin(admin.getAdmin()) && service.addSecurityAns(admin.getSecurity()))
			return new ResponseToFrontend("Admin Added");
			else
			return new ResponseToFrontend("Error Occured");
		}
	}
	@PostMapping(value="addMerchant",consumes={"application/json"})
	public ResponseToFrontend addMerchant(@RequestBody MerchantWithSecurityQuestions merchant) {
		
		if(service.merchantExists(merchant.getMerchant().getEmailid()))
			return new ResponseToFrontend("Merchant Already Exists");
		else{
			if(service.addMerchant(merchant.getMerchant()) && service.addSecurityAns(merchant.getSecurity()))
			return new ResponseToFrontend("Merchant Added");
			return new ResponseToFrontend("Error Occured");
		}
	}
}
