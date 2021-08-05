package com.scale.project.service;

import java.util.List;

import com.scale.project.model.User;

public interface UserService {
	
	/**
	 * Return a page of users with 6 users sorted by id
	 * 
	 * @param page
	 * @param per_page
	 * @param sortBy
	 * @return List<User>
	 */
	public List<User> getUsers(Integer page, Integer per_page, String sortBy);
}
