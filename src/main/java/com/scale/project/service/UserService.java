package com.scale.project.service;

import java.util.List;

import com.scale.project.model.User;

public interface UserService {
	public List<User> getUsers(Integer page, Integer per_page, String sortBy);
}
