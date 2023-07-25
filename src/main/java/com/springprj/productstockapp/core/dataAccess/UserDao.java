package com.springprj.productstockapp.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springprj.productstockapp.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
