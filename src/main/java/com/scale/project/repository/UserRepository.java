package com.scale.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scale.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
