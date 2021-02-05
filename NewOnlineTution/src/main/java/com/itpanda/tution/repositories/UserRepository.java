package com.itpanda.tution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itpanda.tution.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	
}
