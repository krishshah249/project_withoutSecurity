package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.bean.User1;

@Repository
public interface SignUpUserDAO extends JpaRepository<User1, Integer>{

	@Query("SELECT u FROM User1 u where u.emailid=?1")
	public User1 userExists(String emailid); 
}
