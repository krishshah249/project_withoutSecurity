package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.bean.Admin;

@Repository
public interface SignUpAdminDAO extends JpaRepository<Admin, Integer>{

	@Query("SELECT a FROM Admin a where a.emailid=?1")
	public Admin adminExists(String emailId); 

}
