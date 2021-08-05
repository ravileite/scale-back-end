package com.scale.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;

import com.scale.project.model.User;
import com.scale.project.repository.UserRepository;

@Service
public class UserService {
		
	@Autowired
	UserRepository userRepository;
	
	public List<User> getUsers(Integer page, Integer per_page, String sortBy)
    {
        Pageable paging = PageRequest.of(page, per_page, Sort.by(sortBy));
 
        Page<User> pagedResult = userRepository.findAll(paging);

        return pagedResult.getContent();
    }
}
