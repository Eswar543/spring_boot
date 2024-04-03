package com.java.vege.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.vege.Model.User;

public interface CustRepo  extends JpaRepository<User,Integer>{
    
}