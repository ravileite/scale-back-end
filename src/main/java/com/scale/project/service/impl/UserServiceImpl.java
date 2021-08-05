package com.scale.project.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;

import com.scale.project.model.User;
import com.scale.project.repository.UserRepository;
import com.scale.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
		
	@Autowired
	UserRepository userRepository;
	
	public List<User> getUsers(Integer page, Integer per_page, String sortBy){
		log.info("Searching for users...");
        Pageable paging = PageRequest.of(page, per_page, Sort.by(sortBy));
        Page<User> pagedResult = userRepository.findAll(paging);

        return pagedResult.getContent();
    }
}
