package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.SecurityAns;

@Repository
public interface SecurityAnswerDAO extends JpaRepository<SecurityAns, String>{

}
